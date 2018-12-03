package com.pro.test;

import java.io.IOException;
import java.util.Date;

/**
 * Created by wangjinyu on 2018/12/3 15:04.
 * 随机验证码生成
 */
public class TestPic {
    public static void main(String[] args) {

        ValidateCode vCode = new ValidateCode(160, 40, 5, 150);

        try {
            String path = "D:/" + new Date().getTime() + ".png";
            System.out.println(vCode.getCode() + " >" + path);
            vCode.write(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
