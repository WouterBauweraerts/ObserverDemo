package model;

import java.util.Observable;

public class BModel extends Observable{
    private int b = 0;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (this.b != b) {
            this.b = b;
            setChanged();
            notifyObservers(this);
        }
    }
}
