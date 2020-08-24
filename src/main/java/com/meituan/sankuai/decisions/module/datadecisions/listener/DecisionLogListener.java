package com.meituan.sankuai.decisions.module.datadecisions.listener;

import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.RuleListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DecisionLogListener implements RuleListener {

    @Override
    public boolean beforeEvaluate(Rule rule, Facts facts) {
        log.info(rule.getName());
        return true;
    }
}
