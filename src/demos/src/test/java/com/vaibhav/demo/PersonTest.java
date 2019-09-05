package com.vaibhav.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shuldreturnhelloworld() {

        person vk = new person();
         assertEquals("Hello world",vk.helloworld());
    }
}
