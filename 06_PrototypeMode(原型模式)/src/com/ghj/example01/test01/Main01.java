package com.ghj.example01.test01;

/**
 * @program: 06_PrototypeMode
 * @description: 客户端类01
 * @author: 小江
 * @create: 2021-05-21 15:07
 **/

public class Main01 {
    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX公司");

        Resume b = new Resume("大鸟");
        b.setPersonalInfo("男", "29");
        b.setWorkExperience("1998-2000", "XX公司");
        Resume c = new Resume("大鸟");
        c.setPersonalInfo("男", "29");
        c.setWorkExperience("1998-2000", "XX公司");
        a.display();
        b.display();
        c.display();

    }
}
