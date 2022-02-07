package com.company.controller;

import com.company.Main;
import com.company.view.LoginPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginPageController {

    private final LoginPage loginPage;

    public LoginPageController(){
        loginPage = new LoginPage();

        initLoginBTN();
    }

    private void initLoginBTN(){
        getLoginPage().getLoginBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Main.admin.getUsername().equals(getLoginPage().getUsernameField().getText()) &&
                    Main.admin.getPassword().equals(getLoginPage().getPasswordField().getText())){

                    loginPage.getScene().getWindow().hide();

                    Stage mainPageStage = new Stage();
                    mainPageStage.setScene(new Scene(new MainPageController().getMainPage()));
                    mainPageStage.setWidth(1000);
                    mainPageStage.setHeight(500);
                    mainPageStage.show();

                } else {
                    getLoginPage().getPromptLBL().setTextFill(Color.RED);
                    getLoginPage().getPromptLBL().setText("invalid");
                }
            }
        });
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }
}
