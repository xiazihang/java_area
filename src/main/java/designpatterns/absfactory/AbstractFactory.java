package designpatterns.absfactory;

import designpatterns.absfactory.enumtypes.ColorType;
import designpatterns.absfactory.enumtypes.PetType;
import designpatterns.absfactory.interfaces.Color;
import designpatterns.absfactory.interfaces.Pet;

/**
 * Created by zhxia on 20/04/2017.
 */
public abstract class AbstractFactory {
    protected abstract Pet getPet(PetType petType);
    protected abstract Color getColor(ColorType petType);
}
