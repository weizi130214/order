package com.huaweiair.order.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestOrder {

        OrderDelegate orderDelegate = new OrderDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = orderDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}