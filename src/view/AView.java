package view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AView extends GridPane {
    private TextField tfInput;
    private TextField tfOutput;
    private Button btnBereken;

    public AView() {
        initNodes();
        layoutNodes();
    }

    private void initNodes() {
        tfInput = new TextField("0");
        tfInput.setPrefWidth(30);
        tfOutput = new TextField("0");
        tfOutput.setPrefWidth(30);
        tfOutput.setEditable(false);
        btnBereken = new Button("Calculate");
        btnBereken.setPrefWidth(200);
    }

    private void layoutNodes() {
        this.setPadding(new Insets(10));
        this.setHgap(10);
        this.setVgap(10);
        this.setAlignment(Pos.CENTER);
        this.add(new Label("A x B = "), 0, 0);
        this.add(tfOutput, 1, 0);
        this.add(new Label("Value for A:"), 0, 1);
        this.add(tfInput, 1, 1);
        this.add(btnBereken, 0, 2, 2, 1);
        setHalignment(btnBereken, HPos.CENTER);
    }

    Button getBtnBereken() {
        return btnBereken;
    }

    TextField getTfInput() {
        return tfInput;
    }

    TextField getTfOutput() {
        return tfOutput;
    }
}
