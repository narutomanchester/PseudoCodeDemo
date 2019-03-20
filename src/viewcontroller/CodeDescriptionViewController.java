/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewcontroller;

import java.util.logging.Logger;
import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import model.*;
import static Constant.Constant.*;
import javafx.scene.text.Font;

/**
 *
 * @author mac
 */
public class CodeDescriptionViewController extends VBox {

    private CodeDescriptionModel codeDescriptionModel;
    private Label descriptionText;
    private Label subtitleText;

    public CodeDescriptionModel getCodeDescriptionModel() {
        return codeDescriptionModel;
    }

    public void setCodeDescriptionModel(CodeDescriptionModel codeDescriptionModel) {
        this.codeDescriptionModel = codeDescriptionModel;
    }

    public CodeDescriptionViewController(CodeDescriptionModel codeDescriptionModel) {
        this.codeDescriptionModel = codeDescriptionModel;
        init();
    }

    private void init() {
        // create pane of description and subtitle of pane
        Pane descriptionPane = new Pane();
        
        descriptionText = new Label();
        setupLabelInContainer(descriptionText);
        descriptionText.textProperty().bind(this.codeDescriptionModel.descriptionTextProperty());
        descriptionPane.getChildren().add(descriptionText);

        Pane subtitlePane = new Pane();
        subtitleText = new Label();   
        setupLabelInContainer(subtitleText);
        subtitleText.textProperty().bind(this.codeDescriptionModel.subtitleTextProperty());
        subtitlePane.getChildren().add(subtitleText);

        // implenments & add pane into list
        ObservableList list = this.getChildren();
        list.addAll(descriptionPane, subtitlePane);

        this.setBackground(new Background(new BackgroundFill(Color.web(COLOR_DESCRIPTION_VIEW_BACKGROUND), CornerRadii.EMPTY, Insets.EMPTY)));

    }

    protected void setupLabelInContainer(Label label) {
        
        label.setTextFill(Color.valueOf(COLOR_DESCRIPTION_TEXT_PSEUDOCODE_CONTAINER));
        label.setFont(new Font(FONT_PSEUDOCODE_CONTAINER_TEXT, SIZE_PSEUDOCODE_CONTAINER_TEXT));
    }

}
