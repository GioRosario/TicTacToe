/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/**
 *
 * @author John
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Button btnOne;
    @FXML private Button btnTwo;
    @FXML private Button btnThree;
    @FXML private Button btnFour;
    @FXML private Button btnFive;
    @FXML private Button btnSix;
    @FXML private Button btnSeven;
    @FXML private Button btnEight;
    @FXML private Button btnNine;
    @FXML private Button btnClear;
    @FXML private HBox clear = new HBox();
    @FXML private HBox textBox;
    @FXML private int count;
    @FXML private Line hor1;
    @FXML private Line hor2;
    @FXML private Line hor3;
    @FXML private Line vert1;
    @FXML private Line vert2;
    @FXML private Line vert3;
    @FXML private Line diag1;
    @FXML private Line diag2;
    @FXML private String X;
    @FXML private String O;
    @FXML private String player = "X";
    @FXML private Text one = new Text();
    @FXML private Text two = new Text();
    @FXML private Text three = new Text();
    @FXML private Text four = new Text();
    @FXML private Text five = new Text();
    @FXML private Text six = new Text();
    @FXML private Text seven = new Text();
    @FXML private Text eight = new Text();
    @FXML private Text nine = new Text();
    @FXML private Label lbl = new Label("Player "+player+"'s turn");
              
    @FXML
    public void xWins(){
        if ((X.contains("1") && X.contains("4") && X.contains("7")) || 
            (X.contains("2") && X.contains("5") && X.contains("8")) ||
            (X.contains("3") && X.contains("6") && X.contains("9")) ||
            (X.contains("1") && X.contains("2") && X.contains("3")) ||
            (X.contains("4") && X.contains("5") && X.contains("6")) ||
            (X.contains("7") && X.contains("8") && X.contains("9")) ||
            (X.contains("1") && X.contains("5") && X.contains("9")) ||  
            (X.contains("3") && X.contains("5") && X.contains("7"))){  
            
            lbl.setText("Player X wins!");
            xLineDraw();
            btnClear.setStyle("-fx-opacity: 1;" + "-fx-background-color: orange;");
            clearButton();
        } else{
            player = "O";
            lbl.setText("Player "+player+"'s turn");
        }
    }
   
    @FXML
    public void oWins(){
       if ((O.contains("1") && O.contains("4") && O.contains("7")) || 
           (O.contains("2") && O.contains("5") && O.contains("8")) ||
           (O.contains("3") && O.contains("6") && O.contains("9")) ||
           (O.contains("1") && O.contains("2") && O.contains("3")) ||
           (O.contains("4") && O.contains("5") && O.contains("6")) ||
           (O.contains("7") && O.contains("8") && O.contains("9")) ||
           (O.contains("1") && O.contains("5") && O.contains("9")) ||  
           (O.contains("3") && O.contains("5") && O.contains("7"))){ 
            lbl.setText("Player O wins!");
            oLineDraw();
            btnClear.setStyle("-fx-opacity: 1;" + "-fx-background-color: orange;");
            clearButton();
            
        } else{
            player = "X";
            lbl.setText("Player "+player+"'s turn");
        }
   }
    
    @FXML
    public void xLineDraw(){
        if (X.contains("1") && X.contains("2") && X.contains("3")){
            hor1.setStyle("-fx-opacity: 1;" + "-fx-stroke: red;");
        } else if (X.contains("4") && X.contains("5") && X.contains("6")){
            hor2.setStyle("-fx-opacity: 1;" + "-fx-stroke: red;");
        } else if (X.contains("7") && X.contains("8") && X.contains("9")){
            hor3.setStyle("-fx-opacity: 1;" + "-fx-stroke: red;");
        } else if (X.contains("1") && X.contains("4") && X.contains("7")){
            vert1.setStyle("-fx-opacity: 1;" + "-fx-stroke: red;");
        } else if (X.contains("2") && X.contains("5") && X.contains("8")){
            vert2.setStyle("-fx-opacity: 1;" + "-fx-stroke: red;");
        } else if (X.contains("3") && X.contains("6") && X.contains("9")){
            vert2.setStyle("-fx-opacity: 1;" + "-fx-stroke: red;");
        } else if (X.contains("1") && X.contains("5") && X.contains("9")){
            diag1.setStyle("-fx-opacity: 1;" + "-fx-stroke: red;");
        } else if (X.contains("3") && X.contains("5") && X.contains("7")){
            diag2.setStyle("-fx-opacity: 1;" + "-fx-stroke: red;");
        }    
    }
    
    @FXML
    public void oLineDraw(){
        if (O.contains("1") && O.contains("2") && O.contains("3")){
            hor1.setStyle("-fx-opacity: 1;" + "-fx-stroke: blue;");
        } else if (O.contains("4") && O.contains("5") && O.contains("6")){
            hor2.setStyle("-fx-opacity: 1;" + "-fx-stroke: blue;");
        } else if (O.contains("7") && O.contains("8") && O.contains("9")){
            hor3.setStyle("-fx-opacity: 1;" + "-fx-stroke: blue;");
        } else if (O.contains("1") && O.contains("4") && O.contains("7")){
            vert1.setStyle("-fx-opacity: 1;" + "-fx-stroke: blue;");
        } else if (O.contains("2") && O.contains("5") && O.contains("8")){
            vert2.setStyle("-fx-opacity: 1;" + "-fx-stroke: blue;");
        } else if (O.contains("3") && O.contains("6") && O.contains("9")){
            vert2.setStyle("-fx-opacity: 1;" + "-fx-stroke: blue;");
        } else if (O.contains("1") && O.contains("5") && O.contains("9")){
            diag1.setStyle("-fx-opacity: 1;" + "-fx-stroke: blue;");
        } else if (O.contains("3") && O.contains("5") && O.contains("7")){
            diag2.setStyle("-fx-opacity: 1;" + "-fx-stroke: blue;");
        }    
    }
    
    @FXML
    public void lineClear(){
        hor1.setStyle("-fx-opacity: 0");
        hor2.setStyle("-fx-opacity: 0");
        hor3.setStyle("-fx-opacity: 0");
        vert1.setStyle("-fx-opacity: 0");
        vert2.setStyle("-fx-opacity: 0");
        vert3.setStyle("-fx-opacity: 0");
        diag1.setStyle("-fx-opacity: 0");
        diag2.setStyle("-fx-opacity: 0");
        btnClear.setStyle("-fx-opacity: 0");
    }
    
    @FXML
    public void clearButton(){
        btnClear.setOnAction(e -> {
           one.setText("");
           two.setText("");
           three.setText("");
           four.setText("");
           five.setText("");
           six.setText("");
           seven.setText("");
           eight.setText("");
           nine.setText("");
           lbl.setText("Player X's turn");
           count = 0;
           X = "";
           O = "";
           lineClear();
        });
    }
    
    @FXML
    public void handleButton(Button b, Text t, String s){
        b.setOnAction(e -> {
            if (this.count % 2 == 0){
                t.setText("X");
                t.setFill(Color.RED);
                this.X += s;
                xWins();
            }else{
                t.setText("O");
                t.setFill(Color.BLUE);
                this.O += s;
                oWins();
            }
            this.count++;
        });
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {      
        lbl.setTextFill(Color.web("#ffffff"));
        lbl.setStyle("-fx-font-weight: bold");
        textBox.getChildren().add(lbl);
        
        handleButton(btnOne, one, "1");
        handleButton(btnTwo, two, "2");
        handleButton(btnThree, three, "3");
        handleButton(btnFour, four, "4");
        handleButton(btnFive, five, "5");
        handleButton(btnSix, six, "6");
        handleButton(btnSeven, seven, "7");
        handleButton(btnEight, eight, "8");
        handleButton(btnNine, nine, "9");       
    }    
}