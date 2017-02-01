package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.AModel;
import model.BModel;

import java.util.Observable;
import java.util.Observer;

public class BPresenter implements Observer{
    private AModel aModel;
    private BModel bModel;
    private BView bView;

    public BPresenter(AModel aModel, BModel bModel, BView bView) {
        this.aModel = aModel;
        this.bModel = bModel;
        this.bView = bView;
        addEventHandlers();
        aModel.addObserver(this);
        bModel.addObserver(this);
    }

    private void addEventHandlers() {
        bView.getBtnBereken().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int invoer = Integer.parseInt(bView.getTfInput().getText());
                bModel.setB(invoer);
            }
        });
    }

    @Override
    public void update(Observable observable, Object o) {
        bView.getTfOutput().setText(Integer.toString(aModel.getA() + bModel.getB()));
    }
}