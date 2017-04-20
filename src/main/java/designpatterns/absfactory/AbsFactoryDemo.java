package designpatterns.absfactory;

import designpatterns.absfactory.interfaces.Color;
import designpatterns.absfactory.interfaces.Pet;

import static designpatterns.absfactory.enumtypes.ColorType.RED;
import static designpatterns.absfactory.enumtypes.ColorType.WHITE;
import static designpatterns.absfactory.FactoryProducer.getFactory;
import static designpatterns.absfactory.enumtypes.FactoryType.COLOR;
import static designpatterns.absfactory.enumtypes.FactoryType.PET;
import static designpatterns.absfactory.enumtypes.PetType.CAT;
import static designpatterns.absfactory.enumtypes.PetType.DOG;

/**
 * Created by zhxia on 20/04/2017.
 */
public class AbsFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory colorFactory = getFactory(COLOR);
        AbstractFactory petFactory = getFactory(PET);

        Color redColor = colorFactory.getColor(RED);
        Color whiteColor = colorFactory.getColor(WHITE);

        Pet dog = petFactory.getPet(DOG);
        Pet cat = petFactory.getPet(CAT);

        redColor.fill();
        whiteColor.fill();
        dog.bark();
        cat.bark();

    }
}
