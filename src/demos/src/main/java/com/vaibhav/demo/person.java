package com.vaibhav.demo;


import com.vaibhav.demo.Name.Name;

public class person {
    private Name personName;

    public String helloworld() {
        return  "Hello world";

    }
    public person(Name personName ){
           this.personName = personName;
//        return  personName;
    }
}
