package com.company;

import com.company.controller.LoginPageController;
import com.company.model.Admin;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Admin admin = new Admin("admin", "123");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setScene(new Scene(new LoginPageController().getLoginPage()));
        primaryStage.setHeight(200);
        primaryStage.setWidth(400);
        primaryStage.show();
    }
}
