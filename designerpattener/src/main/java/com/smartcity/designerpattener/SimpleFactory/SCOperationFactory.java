package com.smartcity.designerpattener.SimpleFactory;

import com.smartcity.designerpattener.SimpleFactory.business.*;

/**
 * @author lipoGiser
 * @date 2019/12/3 16:19
 * @Version 0.1
 */
public class SCOperationFactory {
    public static SCOperation getOperation(String operation){
        SCOperation scOperation =null;
        switch (operation){
            case "+":
                scOperation = new SCOperationAdd();
               break;
            case "-":
                scOperation = new SCOperationSubtract();
                break;
            case "*":
                scOperation = new SCOperationMultiply();
                break;
            case "/":
                scOperation =  new SCOperationDivide();
                break;
        }
        return scOperation;
    }

    public static void main(String[] args) throws Exception {
        SCOperation operation = SCOperationFactory.getOperation("+");
        operation.setNumberA(12);
        operation.setNumberB(6);
        System.out.println(operation.getResult());
    }
}
