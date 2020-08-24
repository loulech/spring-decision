package com.meituan.sankuai.decisions.module.datadecisions.core;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.core.BasicRule;

import java.util.Set;

public abstract class Decision extends BasicRule {

    /**
     * 条件函数, 满足条件
     *
     * @param facts
     */
    @Override
    public abstract boolean evaluate(Facts facts);

    /**
     * 满足条件后执行的函数
     *
     * @param facts
     */
    @Override
    public abstract void execute(Facts facts);

    /**
     * 使用类全名作为rule的name, 不会重复
     * @return
     */
    @Override
    public String getName() {
        return this.getClass().getName();
    }

    /**
     * 优先级
     * @return
     */
    @Override
    public abstract int getPriority();

    /**
     * 获取依赖
     * @return
     */
    public abstract Set<String> getDependencies();


}
