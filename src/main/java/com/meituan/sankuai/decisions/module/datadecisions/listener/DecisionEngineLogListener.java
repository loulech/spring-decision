package com.meituan.sankuai.decisions.module.datadecisions.listener;

import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.RuleListener;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.api.RulesEngineListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DecisionEngineLogListener implements RulesEngineListener {

    @Override
    public void beforeEvaluate(Rules rules, Facts facts) {
        log.info("进入engine listener");
        return;
    }
}
