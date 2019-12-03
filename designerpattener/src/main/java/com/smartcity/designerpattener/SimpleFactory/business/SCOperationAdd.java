package com.smartcity.designerpattener.SimpleFactory.business;

/**
 * @author lipoGiser
 * @date 2019/12/3 16:06
 * @Version 0.1
 */
public class SCOperationAdd extends SCOperation {
    @Override
    public double getResult() {
        double result = 0.0;
        result = numberA + numberB;
        return result;
    }
}
