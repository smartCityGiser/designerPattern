package com.smartcity.designerpattener.SimpleFactory.business;

/**
 * @author lipoGiser
 * @date 2019/12/3 16:15
 * @Version 0.1
 */
public class SCOperationDivide extends SCOperation {
    @Override
    public double getResult() throws Exception {
        if (numberB ==0){
            throw new Exception("除数不能为0");
        }
        double result = 0.0;
        result = numberA/numberB;
        return result;
    }
}
