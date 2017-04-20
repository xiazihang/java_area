package designpatterns.absfactory.implementations;

import designpatterns.absfactory.interfaces.Pet;

/**
 * Created by zhxia on 20/04/2017.
 */
public class Dog implements Pet {
    @Override
    public void bark() {
        System.out.println("Inside Dog::bark() method wowowowowowowow");
    }
}
