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
package org.apache.groovy.parser.antlr4;

/**
 * Represents a dialect
 *
 * See http://groovy-lang.org/differences.html
 */
public enum Dialect {
    GROOVY(true, false, false, true, false, true), JAVA(false, true, true, false, true, false);

    public static Dialect getInstance() {
        String dialectName = System.getProperty("groovy.dialect", "GROOVY").toUpperCase();

        try {
            return Dialect.valueOf(dialectName);
        } catch (Exception e) {
            return GROOVY;
        }
    }

    private boolean semiColonOptional;                // e.g. Java: println("123");                Groovy: println("123")
    private boolean arrayLiteralSupported;            // e.g. Java: int[] a = {1, 2, 3}            Groovy: int[] a = [1, 2, 3]
    private boolean packageScopeDefault;              // e.g. Java: Yes                            Groovy: No
    private boolean doubleQuotedStringInterpreted;    // e.g. Java: "${name}" is a normal string   Groovy: "${name}" will be interpreted as "Daniel" for example
    private boolean equalMarkMeansIdentity;           // e.g. Java: Yes                            Groovy: No
    private boolean closureSupported;                 // e.g. Java: N/A                            Groovy: { a, b -> println "$a, $b" }

    Dialect(boolean semiColonOptional, boolean arrayLiteralSupported, boolean packageScopeDefault, boolean doubleQuotedStringInterpreted, boolean equalMarkMeansIdentity, boolean closureSupported) {
        this.semiColonOptional = semiColonOptional;
        this.arrayLiteralSupported = arrayLiteralSupported;
        this.packageScopeDefault = packageScopeDefault;
        this.doubleQuotedStringInterpreted = doubleQuotedStringInterpreted;
        this.equalMarkMeansIdentity = equalMarkMeansIdentity;
        this.closureSupported = closureSupported;
    }

    public boolean isSemiColonOptional() {
        return semiColonOptional;
    }

    public boolean isArrayLiteralSupported() {
        return arrayLiteralSupported;
    }

    public boolean isPackageScopeDefault() {
        return packageScopeDefault;
    }

    public boolean isDoubleQuotedStringInterpreted() {
        return doubleQuotedStringInterpreted;
    }

    public boolean isEqualMarkMeansIdentity() {
        return equalMarkMeansIdentity;
    }

    public boolean isClosureSupported() {
        return closureSupported;
    }
}
