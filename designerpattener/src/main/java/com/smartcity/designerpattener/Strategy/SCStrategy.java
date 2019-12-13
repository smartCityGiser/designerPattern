package com.smartcity.designerpattener.Strategy;

/**
 * @author lipoGiser
 * @date 2019/12/13 9:03
 * @Version 0.1
 */

import com.smartcity.designerpattener.Strategy.AlgorithmInterface.SCConcreteStrategyA;
import com.smartcity.designerpattener.Strategy.AlgorithmInterface.SCConcreteStrategyB;
import com.smartcity.designerpattener.Strategy.AlgorithmInterface.SCConcreteStrategyC;
import com.smartcity.designerpattener.Strategy.Context.SCContext;

/**
 * 策略模式（Strategy）：它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式
 * 让算法的变化，不会影响到算法的客户。
 */
public class SCStrategy {

   public static void main(String[] args){
       SCContext context;

       context = new SCContext(new SCConcreteStrategyA());
       context.contextInterface();

       context = new SCContext(new SCConcreteStrategyB());
       context.contextInterface();

       context = new SCContext(new SCConcreteStrategyC());
       context.contextInterface();
   }
}
