package com.company.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginPage extends VBox {

    private TextField usernameField;
    private PasswordField passwordField;
    private Label promptLBL;
    private Button loginBTN;

    public LoginPage(){
        Label usernameLBL = new Label("username: ");
        setUsernameField(new TextField());
        HBox usernameRow = new HBox(usernameLBL, getUsernameField());
        usernameRow.setAlignment(Pos.CENTER);

        Label passwordLBL = new Label("password: ");
        setPasswordField(new PasswordField());
        HBox passwordRow = new HBox(passwordLBL, getPasswordField());
        passwordRow.setAlignment(Pos.CENTER);

        setPromptLBL(new Label(""));
        setLoginBTN(new Button("Login"));

        this.setAlignment(Pos.CENTER);
        this.setSpacing(5);
        this.getChildren().addAll(usernameRow, passwordRow, getPromptLBL(), getLoginBTN());

    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public Label getPromptLBL() {
        return promptLBL;
    }

    public void setPromptLBL(Label promptLBL) {
        this.promptLBL = promptLBL;
    }

    public Button getLoginBTN() {
        return loginBTN;
    }

    public void setLoginBTN(Button loginBTN) {
        this.loginBTN = loginBTN;
    }
}
