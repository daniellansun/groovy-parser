/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.codehaus.groovy.runtime;

import groovy.lang.Closure;
import groovy.lang.MetaMethod;

import java.io.IOException;
import java.util.List;


/**
 * Represents a method on an object using a closure which can be invoked
 * at any time
 *
 * @author <a href="mailto:james@coredevelopers.net">James Strachan</a>
 */
public class MethodClosure extends Closure {
    public static final String IS_ALL_METHODS_STATIC = "allMethodStatic";
    public static boolean ALLOW_RESOLVE = false;
    private static final Class[] EMPTY_CLASS_ARRAY = new Class[0];

    private final String method;
    private final boolean allMethodStatic;

    public MethodClosure(Object owner, String method) {
        super(owner);
        this.method = method;

        final Class clazz = owner.getClass() == Class.class ? (Class) owner : owner.getClass();

        this.maximumNumberOfParameters = 0;
        this.parameterTypes = EMPTY_CLASS_ARRAY;

        List<MetaMethod> methods = InvokerHelper.getMetaClass(clazz).respondsTo(owner, method);

        int staticMethodCnt = 0;
        for (MetaMethod m : methods) {
            Class[] newParameterTypes = this.makeParameterTypes(owner, m);

            if (newParameterTypes.length > this.maximumNumberOfParameters) {
                this.maximumNumberOfParameters = newParameterTypes.length;
                this.parameterTypes = newParameterTypes;
            }

            if (m.isStatic()) {
                staticMethodCnt++;
            }
        }

        this.allMethodStatic = staticMethodCnt == methods.size();
    }

    /*
     * Create a new array of parameter type.
     *
     * If the owner is a class instance(e.g. String) and the method is instance method,
     * we expand the original array of parameter type by inserting the owner at the first place of the expanded array
     */
    private Class[] makeParameterTypes(Object owner, MetaMethod m) {
        Class[] newParameterTypes;

        if (owner instanceof Class && !m.isStatic()) {
            Class[] nativeParameterTypes = m.getNativeParameterTypes();
            newParameterTypes = new Class[nativeParameterTypes.length + 1];

            System.arraycopy(nativeParameterTypes, 0, newParameterTypes, 1, nativeParameterTypes.length);
            newParameterTypes[0] = (Class) owner;
        } else {
            newParameterTypes = m.getNativeParameterTypes();
        }

        return newParameterTypes;
    }

    public String getMethod() {
        return method;
    }

    // TODO confirm: The "doCall" method seems to be never called..., because MetaClassImpl.invokeMethod will intercept calls and return the result
    protected Object doCall(Object arguments) {
        return InvokerHelper.invokeMethod(getOwner(), method, arguments);
    }

    private Object readResolve() {
        if (ALLOW_RESOLVE) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {
        if (ALLOW_RESOLVE) {
            stream.defaultReadObject();
        }
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String property) {
        if ("method".equals(property)) {
            return getMethod();
        } else if (IS_ALL_METHODS_STATIC.equals(property)) {
            return this.allMethodStatic;
        } else return super.getProperty(property);
    }
}
