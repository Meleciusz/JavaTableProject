/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package pl.polsl.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pl.polsl.model.Calculate;
import pl.polsl.table.App;
/**
 * FXML Controller class
 * @version 3.0
 * @author Mikolaj Krasucki
 */
public class GetInformationViewController  {


    Calculate controller = new Calculate();
    @FXML
    private Label label1;
    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label l3;
    @FXML
    private Label l4;
    @FXML
    private Slider slider1;
    @FXML
    private Slider slider2;
    @FXML
    private Slider slider3;
    @FXML
    private Slider slider4;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    
    
    /**
     * cos - go futher after clicking the button
     * @throws IOException 
     */
    @FXML
    public void cos() throws IOException{
        App.setRoot("/pl/polsl/views/products.fxml");
        
        ArrayList<Integer> infos = new ArrayList<Integer>();
        int sex = (int) slider1.getValue();
        int kg = (int) slider2.getValue();
        int height = (int) slider3.getValue();
        int age = (int) slider4.getValue();
        infos.add(sex);
        infos.add(kg);
        infos.add(height);
        infos.add(age);
        

        if(infos.get(0) == 0 || infos.get(1) == 0 || infos.get(2) == 0 || infos.get(3) == 0)
        {
            show_error();
            for(int x : infos)
            {
                if(infos.get(x) == 0)
                {
                    infos.set(x, 1);
                }
            }
        }
  
    }  
    
    /**
     * show_error - show error if needed
     */
    public void show_error(){
        
        Label secondLabel = new Label("Podano niemozliwa wartosc, automatyczna zmiana wartosci!");


        StackPane secondaryLayout = new StackPane();
        secondaryLayout.getChildren().add(secondLabel);
        Scene secondScene = new Scene(secondaryLayout, 500, 500);
        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("ERROR");
        newWindow.setScene(secondScene);

        newWindow.show();

    }
    
    /**
     * showinfos - open new window with information about needed nutritients
     */
    @FXML
    public void showinfos(){
        
        ArrayList<Integer> infos = new ArrayList<Integer>();
        ArrayList<Double> needed = new ArrayList<Double>();
        ArrayList<String> show_needed = new ArrayList<String>();
        int sex = (int) slider1.getValue();
        int kg = (int) slider2.getValue();
        int height = (int) slider3.getValue();
        int age = (int) slider4.getValue();
        infos.add(sex);
        infos.add(kg);
        infos.add(height);
        infos.add(age);
        
        
        needed = controller.needed_nutrients(infos);
        
        show_needed.add("Wymagane, dzienne wartosci odzywcze");
        show_needed.add("1. Kalorie: "+needed.get(0));
        show_needed.add("2. Sole: "+needed.get(1));
        show_needed.add("3. Cukry: "+needed.get(2));
        show_needed.add("4. Bialka: "+needed.get(3));
        show_needed.add("5. Tluszcze: "+needed.get(4));
         
        Label secondLabel = new Label();
       
        secondLabel.setText(show_needed.get(0) + "\n" + show_needed.get(1) + "\n" + show_needed.get(2) + "\n" + 
                show_needed.get(3) + "\n" + show_needed.get(4) + "\n" + show_needed.get(5) + "\n");

        

        StackPane secondaryLayout = new StackPane();
        secondaryLayout.getChildren().add(secondLabel);
        Scene secondScene = new Scene(secondaryLayout, 500, 500);
        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("Daily needed calories");
        newWindow.setScene(secondScene);

        newWindow.show();
    }
}
