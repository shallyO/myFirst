/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlite_login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class Side_barController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void max(MouseEvent event) {
         Node node =(Node) event.getSource();
        
       Stage stage =(Stage) node.getScene().getWindow();
       stage.setFullScreenExitHint(" ");
       stage.setFullScreen(true);
    }

    @FXML
    private void close(MouseEvent event) {
        Node node =(Node) event.getSource();
        
       Stage stage =(Stage) node.getScene().getWindow();
       stage.close();
    }

    @FXML
    private void min(MouseEvent event) {
         Node node =(Node) event.getSource();
        
       Stage stage =(Stage) node.getScene().getWindow();
       stage.setIconified(true);
    }
    
}
