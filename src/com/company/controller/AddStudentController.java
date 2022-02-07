package com.company.controller;

import com.company.model.Student;
import com.company.view.AddStudentPage;

public class AddStudentController {

    private final AddStudentPage addStudentPage;
    private final MainPageController mainPageController;

    public AddStudentController(MainPageController mainPageController){

        addStudentPage = new AddStudentPage();

        this.mainPageController = mainPageController;

        addStudentBTN();
    }


    private void addStudentBTN(){
        addStudentPage.getAddBTN().setOnAction(event -> {
            String name = addStudentPage.getNameField().getText();
            String lastName = addStudentPage.getLastNameField().getText();
            String id = addStudentPage.getIdField().getText();

            Student student = new Student(name, lastName, id);

            mainPageController.addStudentToList(student);
        });
    }

    public AddStudentPage getAddStudentPage() {
        return addStudentPage;
    }
}
