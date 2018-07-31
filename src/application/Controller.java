package application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ResourceBundle;


public class Controller implements Initializable {
public String filename="";
    @FXML
    private Button browse;

    @FXML
    private Button decompile;

    @FXML
    private Button recompile;

    @FXML
    private Button sign;

//    @FXML
//    void browseapk(ActionEvent event) {
//
//    
//    	
//    	
//    }
//
//    @FXML
//    void decompileapk(ActionEvent event) {
//
//    }
//
//    @FXML
//    void recompileapk(ActionEvent event) {
//
//    }
//
//    @FXML
//    void signapk(ActionEvent event) {
//
//    }
  
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
        browse.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("adsd");
				FileChooser fileChooser = new FileChooser();
				FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
				fileChooser.getExtensionFilters().add(extFilter);
				File file = fileChooser.showOpenDialog(null);
				System.out.println(file);
				filename = file.toString();
				Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
				System.out.println(path);
				 System.out.println("Working Directory = " +
			              System.getProperty("user.dir"));
				
				
			}
		});
    }

}