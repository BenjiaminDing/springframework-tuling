package com.zhouyu.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class CarService {

@Value(value = "tomy")
 private  User user;

    public void userDriveCar() {
		System.out.println(user);

        }



}

