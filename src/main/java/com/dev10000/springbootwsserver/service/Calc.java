package com.dev10000.springbootwsserver.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 计算接口
 */
@WebService()
public interface Calc {

    @WebMethod
    int add(@WebParam(name = "num1")int num1, @WebParam(name = "num2")int num2);

    @WebMethod
    int sub(@WebParam(name = "num1")int num1, @WebParam(name = "num2")int num2);
}
