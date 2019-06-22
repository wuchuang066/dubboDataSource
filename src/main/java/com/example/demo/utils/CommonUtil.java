package com.example.demo.utils;

public class CommonUtil {
    /**
     * 生成随机数
     *
     * @param length 生成的长度
     */
    public static String generateRandomNumber(int length) throws Exception {

        String var = length + "";
        if (var == null || "".equals(var)) {
            throw new NullPointerException("生成随机数长度不正确");
        }
        String num = "1";
        while (num.length() <= length) {
            num = num.concat("0");
        }
        int parseInt = Integer.parseInt(num);
        int parseInt1 = parseInt * 9 / 10;
        int random = (int) (Math.random() * parseInt1 + (parseInt - parseInt1));
        return random + "";
    }

}
