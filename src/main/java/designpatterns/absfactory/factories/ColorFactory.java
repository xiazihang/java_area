package designpatterns.absfactory.factories;

import designpatterns.absfactory.AbstractFactory;
import designpatterns.absfactory.enumtypes.ColorType;
import designpatterns.absfactory.enumtypes.PetType;
import designpatterns.absfactory.implementations.Red;
import designpatterns.absfactory.implementations.White;
import designpatterns.absfactory.interfaces.Color;
import designpatterns.absfactory.interfaces.Pet;

import static designpatterns.absfactory.enumtypes.ColorType.RED;
import static designpatterns.absfactory.enumtypes.ColorType.WHITE;

/**
 * Created by zhxia on 20/04/2017.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    protected Pet getPet(PetType petType) {
        return null;
    }

    @Override
    protected Color getColor(ColorType colorType) {
        if (RED.equals(colorType)) {
            return new Red();
        } else if (WHITE.equals(colorType)) {
            return new White();
        }

        return null;
    }
}
