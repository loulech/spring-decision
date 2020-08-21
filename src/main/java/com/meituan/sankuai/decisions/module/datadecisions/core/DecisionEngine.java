package com.meituan.sankuai.decisions.module.datadecisions.core;

import com.meituan.sankuai.decisions.module.datadecisions.core.DecisionSet;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.RuleListener;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public abstract class DecisionEngine{
    /**
     * 引擎
     */
    private static DefaultRulesEngine rulesEngine = new DefaultRulesEngine();

    @Autowired
    private DecisionSet decisionSet;

    static{
        rulesEngine.registerRuleListener(new RuleListener() {
            @Override
            public boolean beforeEvaluate(Rule rule, Facts facts) {
                log.info(rule.getName());
                return true;
            }
        });
    }

    public void fire(String paramStr) {
        rulesEngine.fire(decisionSet.getRules(), new Facts());
    }

}
