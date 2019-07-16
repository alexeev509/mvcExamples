package com.company.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
//https://easyjava.ru/spring/spring-framework/spring-bean-scopes/
@Component
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestBean {
    public void printHashCode(){
        System.out.println(this.hashCode());
    }
}
