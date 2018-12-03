package com.company.Sample2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Sample2_example extends Application {
    public static void main(String[] args){
        launch(args);
    }
    public void start(Stage stage)throws Exception{
        BorderPane bp = new BorderPane();
        Scene sc = new Scene(bp,300,200);

        stage.setScene(sc);
        stage.setTitle("こんにちは");
        stage.show();
    }
}
