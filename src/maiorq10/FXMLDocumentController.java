package maiorq10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML
    private Button button;

    @FXML
    private TextField cxnumero;

    @FXML
    private Label label;

    @FXML
    private TextField cxresult;

    @FXML
    void verificar(ActionEvent event) {
    Integer valor;
    valor=Integer.valueOf(cxnumero.getText());
    if (valor > 10) {
        cxresult.setText(String.valueOf("Valor maior que 10."));
        }
        else if (valor == 10) {
            cxresult.setText(String.valueOf("Valor igual a 10."));
        }
        else {
            cxresult.setText(String.valueOf("Valor menor que 10."));    
        }    

    }

}
