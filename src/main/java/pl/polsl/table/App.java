package pl.polsl.table;

import pl.polsl.controllers.TableController;
import pl.polsl.model.Calculate;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * <b>App </b> class uses to controll
 * @version 3.0
 * @author Mikolaj Krasucki
 */
public class App extends Application {

    private static Scene scene;

    private static Calculate persons;
    
    //private WhateatController whateat = new WhateatController();
    
    /**
     * Function that show next scene 
     * @param stage - actual view 
     * @throws IOException 
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("/pl/polsl/views/table.fxml"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Function that load fxml file 
     * @param fxml - file 
     * @return fxml Loader 
     * @throws IOException 
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml));
        //fxmlLoader.setControllerFactory( p -> { return new TableController(persons);} );        
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        persons = new Calculate();
        launch();
        
//        persons.getData().forEach(x -> {
//            System.out.println(x.getFirstName());
//        });        
    }
    
    /**
     * Function that send user to next view 
     * @param fxml
     * @throws IOException 
     */
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

}