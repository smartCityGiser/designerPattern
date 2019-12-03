package com.smartcity.designerpattener.SimpleFactory.business;

/**
 * @author lipoGiser
 * @date 2019/12/3 16:02
 * @Version 0.1
 */
public abstract class SCOperation {
    protected double numberA = 0.0;
    protected double numberB = 0.0;


    public abstract double getResult() throws Exception;
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }


}
