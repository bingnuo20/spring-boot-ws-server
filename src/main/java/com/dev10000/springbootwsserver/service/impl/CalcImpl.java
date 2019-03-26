package com.dev10000.springbootwsserver.service.impl;

import com.dev10000.springbootwsserver.service.Calc;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * 计算接口实现类
 */
@Component("calc")
@WebService(name = "calc",targetNamespace = "http://service.springbootwsserver.dev10000.com/" ,
        endpointInterface = "com.dev10000.springbootwsserver.service.Calc")
public class CalcImpl implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1-num2;
    }
}
