package com.company.Sample3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Sample3 extends Application {
    private Label lb;

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        lb.setText("いらっしゃいませ。");

        BorderPane bp = new BorderPane();

        bp.setCenter(lb);

        Scene sc = new Scene(bp,300,200);

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }
}
