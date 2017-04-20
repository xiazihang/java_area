package designpatterns.absfactory.implementations;

import designpatterns.absfactory.interfaces.Color;

/**
 * Created by zhxia on 20/04/2017.
 */
public class White implements Color {
    @Override
    public void fill() {
        System.out.println("Inside White::fill() method");
    }
}
