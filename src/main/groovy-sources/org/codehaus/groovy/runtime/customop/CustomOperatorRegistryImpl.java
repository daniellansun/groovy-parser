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
package org.codehaus.groovy.runtime.customop;

import groovy.lang.CustomOperator;
import groovy.lang.CustomOperatorRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A registry stores operators and allows operators to be dynamically registered at runtime
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on 2016/10/30
 */
public class CustomOperatorRegistryImpl extends CustomOperatorRegistry {
    private Map<String, CustomOperator> registry = new ConcurrentHashMap<>();
    private static final CustomOperatorRegistryImpl INSTANCE = new CustomOperatorRegistryImpl();

    private CustomOperatorRegistryImpl() {}

    public static CustomOperatorRegistryImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public CustomOperator getOperator(String operator) {
        return registry.get(operator);
    }

    @Override
    public void setOperator(String operator, CustomOperator method) {
        registry.put(operator, method);
    }

    @Override
    public void removeOperator(String operator) {
        registry.remove(operator);
    }
}
