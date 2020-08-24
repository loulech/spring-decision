package com.meituan.sankuai.decisions.module.datadecisions.core;

import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.RuleListener;
import org.jeasy.rules.api.RulesEngineListener;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Slf4j
public class DecisionEngine{
    /**
     * 引擎
     */
    private DefaultRulesEngine engine = new DefaultRulesEngine();

    @Autowired
    private DecisionSet decisionSet;

    @Autowired
    private List<RuleListener> customListener;

    @Autowired
    private List<RulesEngineListener> customEngineListener;


    public void fire(String paramStr) {
        this.engine.fire(decisionSet.getRules(), new Facts());
    }


    @PostConstruct
    public void afterInit(){
        if (!CollectionUtils.isEmpty(this.customEngineListener)) {
            this.engine.registerRulesEngineListeners(this.customEngineListener);
        }
        if (!CollectionUtils.isEmpty(this.customListener)) {
            this.engine.registerRuleListeners(this.customListener);
        }
    }

}
