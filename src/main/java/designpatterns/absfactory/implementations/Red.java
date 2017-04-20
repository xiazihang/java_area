package designpatterns.absfactory.implementations;

import designpatterns.absfactory.interfaces.Color;

/**
 * Created by zhxia on 20/04/2017.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
