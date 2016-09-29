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

import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.DecisionState;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.dfa.DFAState;

import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;

/**
 *  The implementation of DfaWrapper depends on modifying the source code of antlr4(https://github.com/antlr/antlr4/pull/1297)
 *  The rationale of DfaWrapper is to use SoftReference to avoid DFA cache growing forever. If the DFA instance is GCed, recreate one when it is needed.
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date 2016/09/28
 */
public class DfaWrapper extends DFA {
    private volatile SoftReference<DFA> dfaSR;
    private ATN atn;
    private int decision;

    public DfaWrapper(ATN atn, int decision) {
        super(atn.getDecisionState(decision), decision);

        this.dfaSR = new SoftReference<>(new DFA(atn.getDecisionState(decision), decision));
        this.atn = atn;
        this.decision = decision;
    }

    public DFA getDFA() {
        DFA dfa = dfaSR.get();
        if (null != dfa) {
            return dfa;
        }

        synchronized (this) {
            if (null == dfaSR.get()) {
                dfa = new DFA(atn.getDecisionState(decision), decision);
                this.dfaSR = new SoftReference<>(dfa);
            }
        }

        return dfa;
    }


    @Override
    public List<DFAState> getStates() {
        return getDFA().getStates();
    }

    @Override
    public String toString() {
        return getDFA().toString();
    }

    @Override
    @Deprecated
    public String toString(String[] tokenNames) {
        return getDFA().toString(tokenNames);
    }

    @Override
    public String toString(Vocabulary vocabulary) {
        return getDFA().toString(vocabulary);
    }

    @Override
    public String toLexerString() {
        return getDFA().toLexerString();
    }

    @Override
    public Map<DFAState, DFAState> getStatesMap() {
        return getDFA().getStatesMap();
    }

    @Override
    public DFAState getS0() {
        return getDFA().getS0();
    }

    @Override
    public void setS0(DFAState s0) {
        getDFA().setS0(s0);
    }

    @Override
    public int getDecision() {
        return getDFA().getDecision();
    }

    @Override
    public DecisionState getAtnStartState() {
        return getDFA().getAtnStartState();
    }
}
