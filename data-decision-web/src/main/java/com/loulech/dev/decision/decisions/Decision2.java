package com.loulech.dev.decision.decisions;

import core.Decision;
import org.jeasy.rules.api.Facts;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component
public class Decision2 extends Decision {
    @Override
    public boolean evaluate(Facts facts) {
        return true;
    }

    @Override
    public void execute(Facts facts) {
        System.out.println("love u");
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public Set<String> getDependencies() {
        return null;
    }

}
