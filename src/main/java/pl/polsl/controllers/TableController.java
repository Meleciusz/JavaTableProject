package pl.polsl.controllers;

import java.io.IOException;
import pl.polsl.model.Calculate;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pl.polsl.table.App;
/**
 * FXML Controller class
 * @version 3.0
 * @author Mikolaj Krasucki
 */

public class TableController {
    
    private Calculate controller= new Calculate();
    
    public String nickname;
 
    @FXML
    private TextField text1;
    
    @FXML
    private Button button1;
    

    /**
     * liczenie - Go futher after clicking the button
     * @throws IOException 
     */
    @FXML
    public void liczenie() throws IOException{
        App.setRoot("/pl/polsl/views/getInformationView.fxml");
        
        String nickname = text1.getText();
        String correct_nickname;
        correct_nickname = controller.if_name_correct(nickname);
        
        
        if(correct_nickname.equals(nickname))
        {
            ;
        }
        else
        {
            show_error(correct_nickname);
        }
        }
    
    /**
     * show_error - show window with error information 
     * @param nick - user nickname
     */
    public void show_error(String nick){
        
        Label secondLabel = new Label("Podano niewlasciwa nazwe uzytkownika, automatyczna zmiana na : " + nick);


        StackPane secondaryLayout = new StackPane();
        secondaryLayout.getChildren().add(secondLabel);
        Scene secondScene = new Scene(secondaryLayout, 500, 500);
        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("ERROR");
        newWindow.setScene(secondScene);

        newWindow.show();

    }
//        String show;
//        try{
//            double first = Double.parseDouble(text1.getText());
//            double second = Double.parseDouble(text2.getText());
//            double results = first+second;
//            show = String.valueOf(results);
//        }
//        catch(Exception e){
//            show = e.getMessage();
//        }
//        wynik.setText(show);

//        String nickname; 
//        nickname = text1.getText();
      
//    private final ObservableList<Calculate> data;    
//    private final Calculate persons;
//    
//    public TableController(Calculate persons) {
//        this.persons = persons;
//        data = FXCollections.observableArrayList(persons.getData());
//        data.addListener(new ListChangeListener<Calculate>(){
//            @Override
//            public void onChanged(ListChangeListener.Change<? extends Calculate> change) {
//                while (change.next()) {
//                    if (change.wasPermutated()) {
//                        for (int i = change.getFrom(); i < change.getTo(); ++i) {
//                            System.out.println("zamiana");
//                        }
//                    } else if (change.wasUpdated()) {
//                        System.out.println("uaktualnienie");
//                    } else {
//                        for (var remitem : change.getRemoved()) {
//                            persons.getData().remove(remitem);
//                        }
//                        for (var additem : change.getAddedSubList()) {
//                            persons.getData().add(additem);
//                        }
//                    }
//                }
//            }
//        });
//    }   
//    
//    @FXML
//    public void initialize() {
//        
//        table.setItems(data);
//        firstName.setCellValueFactory(new PropertyValueFactory<Calculate, String>("firstName"));
//        lastName.setCellValueFactory(new PropertyValueFactory<Calculate, String>("lastName"));
//        email.setCellValueFactory(new PropertyValueFactory<Calculate, String>("email"));
//        
//        table.setEditable(true);
//        firstName.setCellFactory(TextFieldTableCell.forTableColumn());	
//
//        firstName.setOnEditCommit(new EventHandler<CellEditEvent<Calculate, String>>() {
//            @Override
//            public void handle(CellEditEvent<Calculate, String> t) {
//                ((Calculate) t.getTableView().getItems().get(t.getTablePosition().getRow())).setFirstName(t.getNewValue());
//            }
//        });
//    }
//    
//    @FXML
//    private void add(ActionEvent evenr) {
//        data.add(new Calculate("1=3","2", "3"));
//    }
//
//    @FXML
//    private void remove(ActionEvent evenr) {
//        int index = table.getSelectionModel().getSelectedIndex();
//        if(index != -1) data.remove(index);
//    }
    
}

