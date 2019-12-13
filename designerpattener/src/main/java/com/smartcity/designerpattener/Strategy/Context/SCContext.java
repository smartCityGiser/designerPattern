package com.smartcity.designerpattener.Strategy.Context;

import com.smartcity.designerpattener.Strategy.AlgorithmInterface.SCAbstractStrategy;

import javax.security.auth.login.Configuration;

/**
 * @author lipoGiser
 * @date 2019/12/13 9:14
 * @Version 0.1
 * @des 上下文，用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 */
public class SCContext {
    private SCAbstractStrategy scAbstractStrategy;

    public SCContext(SCAbstractStrategy scAbstractStrategy){
        this.scAbstractStrategy = scAbstractStrategy;
    }


    /**
     * 上下文接口
     */
    public void contextInterface() {
        scAbstractStrategy.algorithmInterface();
    }
}
