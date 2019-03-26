package com.dev10000.springbootwsserver;

import com.dev10000.springbootwsserver.service.Calc;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

@Configuration
public class CXFConfig {

    @Resource
    private Bus bus;

    @Resource
    private Calc calc;

    @Bean()
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, calc);
        endpoint.publish("/calc");
        return endpoint;
    }
}
