package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.AModel;
import model.BModel;

import java.util.Observable;
import java.util.Observer;

public class APresenter implements Observer{
    private AModel aModel;
    private BModel bModel;
    private AView aView;

    public APresenter(AModel aModel, BModel bModel, AView aView) {
        this.aModel = aModel;
        this.bModel = bModel;
        this.aView = aView;
        addEventHandlers();
        aModel.addObserver(this);
        bModel.addObserver(this);
    }

    private void addEventHandlers() {
        aView.getBtnBereken().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int invoer = Integer.parseInt(aView.getTfInput().getText());
                aModel.setA(invoer);
            }
        });
    }

    @Override
    public void update(Observable observable, Object o) {
        aView.getTfOutput().setText(Integer.toString(aModel.getA() * bModel.getB()));
    }
}
