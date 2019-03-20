package javafxdemo;

import static Constant.Constant.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import viewcontroller.*;
import model.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mac
 */
public class PseudoCodeDescriptionContainer extends VBox {

    private CodeDescriptionModel codeDescriptionModel;
    private PseudoCodeModel pseudoCodeModel;
    
    private CodeDescriptionViewController codeDescriptionViewController;
    private PseudoCodeViewController pseudoCodeViewController;
    
    // set model
    public void settModel(String description, String subTitle, int selectedId){
        codeDescriptionModel.setDescriptionText(description);
        codeDescriptionModel.setsubtitleText(subTitle);
        
        pseudoCodeViewController.setHightlight(selectedId);
    }
 
    public PseudoCodeDescriptionContainer() {
        // define model
        pseudoCodeModel = new PseudoCodeModel();
        codeDescriptionModel = new CodeDescriptionModel();

        // define viewController 
        codeDescriptionViewController = new CodeDescriptionViewController(this.codeDescriptionModel);
        pseudoCodeViewController = new PseudoCodeViewController(this.pseudoCodeModel);
        
        getChildren().add(codeDescriptionViewController);
        getChildren().add(pseudoCodeViewController);

        
    }

   

}
