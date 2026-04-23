package org.esaip.ira52526.demoboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Value("${app.owners:La promo}")
    private String appOwner;

    public String greeting(String visitor) {

        return "Hello, " + visitor + " <br/>By " + appOwner + "!";
    }
}
