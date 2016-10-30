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
package groovy.lang;

import org.codehaus.groovy.runtime.customop.CustomOperatorRegistryImpl;

/**
 * CustomOperatorRegistry is responsible for storing custom operators
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on 2016/10/30
 */
public abstract class CustomOperatorRegistry {
    /**
     * Get existing operator, otherwise return null
     *
     * @param operator operator
     * @return the operator implementation
     */
    public abstract CustomOperator getOperator(String operator);

    /**
     * Add the operator to registry
     *
     * @param operator operator
     * @param method the operator implementation
     */
    public abstract void setOperator(String operator, CustomOperator method);

    /**
     * Remove the operator in the registry
     *
     * @param operator operator
     */
    public abstract void removeOperator(String operator);

    /**
     * Get the instance of CustomOperatorRegistry
     * @return CustomOperatorRegistry instance
     */
    public static CustomOperatorRegistry getInstance() {
        return CustomOperatorRegistryImpl.getInstance();
    }
}
