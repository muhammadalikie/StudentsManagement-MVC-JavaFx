package com.company.controller;

import com.company.model.Student;
import com.company.view.MainPage;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPageController {

    private final MainPage mainPage;

    public MainPageController(){

        mainPage = new MainPage();

        addStudentBTN();

        removeStudentBTN();

        exitBTNOnAction();

    }


    private void addStudentBTN(){
        mainPage.getAddBTN().setOnAction(event -> {
            AddStudentController addStudentController = new AddStudentController(this);

            Stage addStudentStage = new Stage();
            addStudentStage.setScene(new Scene(addStudentController.getAddStudentPage()));
            addStudentStage.setWidth(400);
            addStudentStage.setHeight(250);
            addStudentStage.show();
        });
    }

    private void removeStudentBTN(){
        mainPage.getRemoveBTN().setOnAction(event -> {

            Student selectedStudent = mainPage.getStudentTableView().getSelectionModel().getSelectedItem();

            if (selectedStudent != null){
                mainPage.getStudentTableView().getItems().remove(selectedStudent);
            }

        });
    }

    private void exitBTNOnAction(){
        mainPage.getExitBTN().setOnAction(event -> {
            Platform.exit();
        });
    }



    public void addStudentToList(Student student){

        mainPage.getStudentTableView().getItems().add(student);

    }

    public  MainPage getMainPage() {
        return mainPage;
    }
}
