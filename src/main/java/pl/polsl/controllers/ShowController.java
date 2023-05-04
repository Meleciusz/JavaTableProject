/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package pl.polsl.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.polsl.model.Dishes;
/**
 * FXML Controller class
 * @version 3.0
 * @author Mikolaj Krasucki
 */
public class ShowController{


    @FXML
    private Button button1;
    @FXML
    private TableView<Dishes> table;
    @FXML
    private TableColumn<Dishes, String> name;
    @FXML
    private TableColumn<Dishes, Integer> grams;
    @FXML
    private TableColumn<Dishes, Integer> kcals;
    @FXML
    private TableColumn<Dishes, Integer> salt;
    @FXML
    private TableColumn<Dishes, Integer> sugar;
    @FXML
    private TableColumn<Dishes, Integer> protein;
    @FXML
    private TableColumn<Dishes, Integer> fats;    
    
    /**
     * show - prepare the table 
     * @param total_makro - list of nutritients
     * @param names - dished names
     * @param amounts - amount of dishes in grams 
     */
    @FXML
    public void show(ArrayList<Integer> total_makro, ArrayList<String> names, ArrayList<Integer> amounts){
        ObservableList<Dishes> dishes = FXCollections.observableArrayList();
        
        int hlp = 0;
        for(int i =0; i<names.size(); i++)
        {
            dishes.add(new Dishes(names.get(i), amounts.get(i), total_makro.get(i), total_makro.get(i+1+hlp), total_makro.get(i+2+hlp), total_makro.get(i+3+hlp), total_makro.get(i+4+hlp)));
             hlp += 5;
       
        }
        table.setItems(dishes);
        name.setCellValueFactory(new PropertyValueFactory<Dishes, String>("name"));
        grams.setCellValueFactory(new PropertyValueFactory<Dishes, Integer>("amount"));
        kcals.setCellValueFactory(new PropertyValueFactory<Dishes, Integer>("kcals"));
        salt.setCellValueFactory(new PropertyValueFactory<Dishes, Integer>("salt"));
        sugar.setCellValueFactory(new PropertyValueFactory<Dishes, Integer>("sugar"));
        protein.setCellValueFactory(new PropertyValueFactory<Dishes, Integer>("protein"));
        fats.setCellValueFactory(new PropertyValueFactory<Dishes, Integer>("fats"));
        
    }

    @FXML
    private void end() {
        System.exit(0);
    }
    
}
