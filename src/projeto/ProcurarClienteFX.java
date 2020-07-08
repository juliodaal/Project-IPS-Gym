/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;


import clases.UdpClient;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static projeto.PrincipalPage.deleteWord;

/**
 *
 * @author julio
 */
public class ProcurarClienteFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();
        
        Label name = new Label();
        name.setText("Procurar Cliente");
        name.setTranslateX(250);
        name.setTranslateY(100);
        
        TextField textbox = new TextField();
        textbox.setTranslateY(200);
        
        Button btn = new Button();
        btn.setText("Procurar");
        btn.setTranslateX(270);
        btn.setTranslateY(300);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                UdpClient client = new UdpClient("Procurar Cliente",textbox.getText());
                String msg = client.initClient();
                System.out.println("Este es el msg : " + msg);

                String accum = "",accum2 = "", word = "", nameTable = "";
                String email = "";
                int cont = 1;
                    for(int i = 0; i < msg.length(); i++){
                        char c = msg.charAt(i); 
                            if(c == '#' || c == '%'){
                                accum2 += c;
                                accum += c;
                                if("#%#".equals(accum2)){
                                    word = deleteWord(accum,accum2);
                                    System.out.println("Ver accum:------");
                                    System.out.println(word);
                                    switch(cont){
                                    case 1:
                                        email = word;
                                        break;
                                    }
                                    accum2 = "";
                                    accum = "";
                                    cont++;
                                }
                            } else {
                                accum += c;
                            }
                    }

                    PrincipalPage page = new PrincipalPage(email);
                    page.setVisible(true);
            }
        });
               
        vbox.getChildren().add(name);
        vbox.getChildren().add(textbox);
        vbox.getChildren().add(btn);
                
        StackPane root = new StackPane();
        root.getChildren().add(vbox);
        
        root.setStyle("-fx-background-color: white;");
        
        Scene scene = new Scene(root, 650, 760);
        
        primaryStage.setTitle("Procurar Cliente");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
