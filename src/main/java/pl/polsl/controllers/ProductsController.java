/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package pl.polsl.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
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
public class ProductsController{
    private Calculate controller = new Calculate();
    private ArrayList<String> listText = new ArrayList<String>();  //nazwy produktow
    private ArrayList<Integer> amount = new ArrayList<Integer>();
    public ArrayList<Integer> total_makro = new ArrayList<Integer>();
    Stage stage;
    Scene scene;
    @FXML
    private Label label1;
    @FXML
    private TextField text1;
    @FXML
    private Button button;
    @FXML
    private Label label2;
    @FXML
    private Slider slider1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private TextField text4;
    @FXML
    private TextField text5;
    @FXML
    private Slider slider2;
    @FXML
    private Slider slider3;
    @FXML
    private Slider slider4;
    @FXML
    private Slider slider5;
    
    /**
     * send information to another controller after clicking a button
     */
    @FXML
    public void products(ActionEvent event) throws IOException, InterruptedException{
       //App.setRoot("/pl/polsl/views/choose.fxml");
       
       String t1 = text1.getText(); listText.add(t1);
       String t2 = text2.getText(); listText.add(t2);
       String t3 = text3.getText(); listText.add(t3);
       String t4 = text4.getText(); listText.add(t4);
       String t5 = text5.getText(); listText.add(t5);
       
       int grams1 = (int) slider1.getValue(); amount.add(grams1);
       int grams2 = (int) slider2.getValue(); amount.add(grams2); 
       int grams3 = (int) slider3.getValue(); amount.add(grams3); 
       int grams4 = (int) slider4.getValue(); amount.add(grams4); 
       int grams5 = (int) slider5.getValue(); amount.add(grams5); 
       
       
//       if(grams1 == 0 || grams2 == 0 || grams3 == 0 || grams4 == 0 || grams5 ==0)
//       {
//           show_error();
//           System.exit(0);
//       }
       
       for(int i = 0; i < listText.size(); i++)
       {
           if(listText.get(i).length() > 1 ){
               
           }
           else
           {
               listText.remove(i);
               amount.remove(i);
               i--;
           }
       }
       
       if(listText.size() != amount.size())
       {
           //System.out.println("TU   ");
           show_error();
           System.exit(0);
       }
       
       
       
       total_makro = controller.makro(listText, amount);
      
       ////////////////////////////////////////
       FXMLLoader loader = new FXMLLoader(getClass().getResource("/pl/polsl/views/show.fxml"));

       Parent root = loader.load();
       ShowController showcontroller = loader.getController();
       showcontroller.show(total_makro, listText, amount);
      
       stage =(Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    
    /**
     * show_error - show error if necesarry 
     * @throws InterruptedException 
     */
    @FXML
    public void show_error() throws InterruptedException{
        
        Label secondLabel = new Label("Proba wywolania bledu programu, program konczy sie..!");
        
        StackPane secondaryLayout = new StackPane();
        secondaryLayout.getChildren().add(secondLabel);
        Scene secondScene = new Scene(secondaryLayout, 500, 100);
        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("Proba wywolania bledu programu, program konczy sie..!");
        newWindow.setScene(secondScene);

        newWindow.show();

        
        TimeUnit.SECONDS.sleep(2);
    }
}
