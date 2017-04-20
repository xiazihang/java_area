package designpatterns.absfactory;

import designpatterns.absfactory.enumtypes.FactoryType;
import designpatterns.absfactory.factories.ColorFactory;
import designpatterns.absfactory.factories.PetFactory;

import static designpatterns.absfactory.enumtypes.FactoryType.COLOR;
import static designpatterns.absfactory.enumtypes.FactoryType.PET;

/**
 * Created by zhxia on 20/04/2017.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (COLOR.equals(factoryType)) {
            return new ColorFactory();
        } else if (PET.equals(factoryType)) {
            return new PetFactory();
        }

        return null;
    }
}
