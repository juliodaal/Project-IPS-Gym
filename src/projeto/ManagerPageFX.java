/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;


import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author julio
 */
public class ManagerPageFX extends Application {
    
    public ManagerPageFX(String email){
    
    }
    public ManagerPageFX(){
    
    }
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        HBox hbox = new HBox();
        
        Image imgLogo = new Image("./Images/dumbbell.PNG");
        ImageView loadImg = new ImageView(imgLogo);
        
        Label name = new Label();
        name.setText("Manager Name");
        Button btnPerfil = new Button();
        
        VBox vbox = new VBox();
        vbox.setTranslateY(45);
        vbox.setTranslateX(10);
        vbox.getChildren().add(name);
        vbox.getChildren().add(btnPerfil);
        
        btn.setText("Procurar Cliente");
        btn.setTranslateY(45);
        btn.setTranslateX(20);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                ProcurarClienteFX page = new ProcurarClienteFX();
                Stage stage = new Stage();
                page.start(stage);
            }
        });
        
        btnPerfil.setText("Perfil");
        
        btnPerfil.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Perfil page = new Perfil();
                page.setVisible(true);
            }
        });
        
        hbox.getChildren().add(loadImg);        
        hbox.getChildren().add(vbox);
        hbox.getChildren().add(btn);
                
        StackPane root = new StackPane();
        root.getChildren().add(hbox);
        
        root.setStyle("-fx-background-color: white;");
        
        Scene scene = new Scene(root, 1200, 750);
        
        primaryStage.setTitle("Manager Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    void start(JFXPanel fxPanel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
