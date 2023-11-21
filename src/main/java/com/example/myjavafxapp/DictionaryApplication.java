package com.example.myjavafxapp;

import com.example.myjavafxapp.controller.Scene1Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DictionaryApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Parent root = loader.load();

        Scene1Controller scene1Controller = loader.getController();
        scene1Controller.setPrimaryStage(primaryStage);

        Scene scene = new Scene(root);
        primaryStage.setResizable(false); // Thiết lập cố định cửa sổ
//      scene.getStylesheets().add(getClass().getResource("/graphic/css/scene1.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Scene");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}


//public class DictionaryApplication extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//
//        FXMLLoader fxmlLoader = new FXMLLoader(DictionaryApplication.class.getResource("home-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1280, 800);
//        // Áp dụng CSS
//        scene.getStylesheets().add(getClass().getResource("/graphic/css/Dictionary.css").toExternalForm());
//        stage.setTitle("Dictionary Application!");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//}