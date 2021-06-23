package com.ghj.example01.test03.apparel;

import com.ghj.example01.test03.entity.Finery;
/**
 * @program: 02_DecorativePattern
 * @description: 具体服饰类
 * @author: 小江
 * @create: 2021-05-12 14:01
 **/
public class wearPlaidShirt extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.print("格子衫 ");
    }
}
