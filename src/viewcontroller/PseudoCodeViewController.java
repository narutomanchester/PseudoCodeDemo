/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewcontroller;


import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.*;

/**
 *
 * @author mac
 */
public class PseudoCodeViewController extends Pane {

    private  PseudoCodeModel pseudoCodeModel;

    public void setPseudoCodeModel(PseudoCodeModel pseudoCodeModel) {
        this.pseudoCodeModel = pseudoCodeModel;
    }

    public PseudoCodeModel getPseudoCodeModel() {
        return pseudoCodeModel;
    }
    
    
    public PseudoCodeViewController(PseudoCodeModel pseudoCodeModel) {
        this.pseudoCodeModel = pseudoCodeModel;
        init();
    }
    
    private void init(){
        Label centerLabel = new Label("Center");
        this.getChildren().add(centerLabel);
    }
    
}
