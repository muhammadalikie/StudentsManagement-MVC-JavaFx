package com.company.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AddStudentPage extends VBox {

    private TextField nameField;
    private TextField lastNameField;
    private TextField idField;
    private Button addBTN;

    public AddStudentPage(){

        Label nameLBL = new Label("Student Name: ");
        setNameField(new TextField());

        Label lastNameLBL = new Label("Student LastName: ");
        setLastNameField(new TextField());


        Label idLBL = new Label("Student Id: ");
        setIdField(new TextField());

        setAddBTN(new Button("Add Student"));

        VBox fieldCol = new VBox(nameField, lastNameField, idField);
        fieldCol.setAlignment(Pos.CENTER);


        VBox labelCol = new VBox(nameLBL, lastNameLBL, idLBL);
        labelCol.setAlignment(Pos.CENTER_LEFT);
        labelCol.setSpacing(12);

        HBox topElements = new HBox(labelCol, fieldCol);
        topElements.setAlignment(Pos.CENTER);


        this.getChildren().addAll(topElements, addBTN);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);




    }

    public TextField getNameField() {
        return nameField;
    }

    public void setNameField(TextField nameField) {
        this.nameField = nameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(TextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public TextField getIdField() {
        return idField;
    }

    public void setIdField(TextField idField) {
        this.idField = idField;
    }

    public Button getAddBTN() {
        return addBTN;
    }

    public void setAddBTN(Button addBTN) {
        this.addBTN = addBTN;
    }
}
