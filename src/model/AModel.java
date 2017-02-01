package model;

import java.util.Observable;

public class AModel extends Observable{
    private int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (this.a != a) {
            this.a = a;
            setChanged();
            notifyObservers(this);
        }
    }


}
