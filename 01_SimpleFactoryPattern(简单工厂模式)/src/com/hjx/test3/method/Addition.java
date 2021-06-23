package com.ghj.test3.method;

import com.ghj.test3.entity.Calculate;
/**
 * @program: 01_SimpleFactoryPattern
 * @description: 加法运算类
 * @author: 小江
 * @create: 2021-05-11 21:49
 **/
public class Addition extends Calculate {
    @Override
    public double getResult() throws Exception {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}
