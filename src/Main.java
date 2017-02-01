import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.AModel;
import model.BModel;
import view.*;

public class Main extends Application {
    public void start(Stage firstStage) throws Exception {
        AModel aModel = new AModel();
        BModel bModel = new BModel();
        AView aView = new AView();
        BView bView = new BView();
        ConsoleView consoleView = new ConsoleView();
        aModel.addObserver(consoleView);
        bModel.addObserver(consoleView);
        new APresenter(aModel, bModel, aView);
        new BPresenter(aModel, bModel, bView);

        Scene aScene = new Scene(aView);
        firstStage.setScene(aScene);
        firstStage.setTitle("AModel");
        firstStage.setX(300);
        firstStage.setY(200);
        firstStage.setWidth(260);
        firstStage.setHeight(150);
        firstStage.show();

        Stage secondStage = new Stage();
        Scene bScene = new Scene(bView);
        secondStage.setScene(bScene);
        secondStage.setTitle("BModel");
        secondStage.setX(600);
        secondStage.setY(200);
        secondStage.setWidth(260);
        secondStage.setHeight(150);
        secondStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
