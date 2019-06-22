package com.example.demo;

import com.example.demo.utils.CommonUtil;

import java.util.UUID;

public class Test {
    public static void main(String[] args) {
//        String test  = "";
//        for(int i = 0 ; i<50 ;i++) {
//            UUID uuid = UUID.randomUUID();
//            int random = (int) (Math.random() * 900+100);
//            String string = Integer.toString(random);
//            System.out.print(" "+ string+ " ");
//            System.out.println("uuid:"+uuid);
//
//        }
        try {
            CommonUtil.generateRandomNumber(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
