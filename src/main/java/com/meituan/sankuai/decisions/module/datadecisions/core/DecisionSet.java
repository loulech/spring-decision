package com.meituan.sankuai.decisions.module.datadecisions.core;


import com.google.common.collect.Sets;
import org.jeasy.rules.api.Rules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Set;

@Component
public class DecisionSet {

    @Autowired
    private Set<Decision> decisions;


    public Rules getRules(){
        if (CollectionUtils.isEmpty(decisions)) {
            throw new RuntimeException("没有找到决策");
        }
        Rules rules = new Rules();
        this.decisions.forEach(rules::register);
        return rules;
    }

    public Set<String> getDependencies() {
        Set<String> dependencies = Sets.newHashSet();
        for (Decision decision : decisions) {
            if (CollectionUtils.isEmpty(decision.getDependencies())) {
                continue;
            }
            dependencies.addAll(decision.getDependencies());
        }
        return dependencies;
    }

}
