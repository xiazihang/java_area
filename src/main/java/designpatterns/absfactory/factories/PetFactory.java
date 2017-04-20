package designpatterns.absfactory.factories;

import designpatterns.absfactory.AbstractFactory;
import designpatterns.absfactory.enumtypes.ColorType;
import designpatterns.absfactory.enumtypes.PetType;
import designpatterns.absfactory.implementations.Cat;
import designpatterns.absfactory.implementations.Dog;
import designpatterns.absfactory.interfaces.Color;
import designpatterns.absfactory.interfaces.Pet;

import static designpatterns.absfactory.enumtypes.PetType.CAT;
import static designpatterns.absfactory.enumtypes.PetType.DOG;

/**
 * Created by zhxia on 20/04/2017.
 */
public class PetFactory extends AbstractFactory {
    @Override
    protected Pet getPet(PetType petType) {
        if (CAT.equals(petType)) {
            return new Cat();
        } else if (DOG.equals(petType)) {
            return new Dog();
        }

        return null;
    }

    @Override
    protected Color getColor(ColorType petType) {
        return null;
    }
}
