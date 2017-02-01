package view;

import model.AModel;
import model.BModel;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wouterba on 30/01/2017.
 */
public class ConsoleView implements Observer{
    @Override
    public void update(Observable observable, Object o) {
        if (observable.getClass() == AModel.class){
            System.out.println("Tha value for A has changed: " + ((AModel)observable).getA());
        }else {
            System.out.println("The value for B has changed: " + ((BModel)observable).getB());
        }
    }
}
