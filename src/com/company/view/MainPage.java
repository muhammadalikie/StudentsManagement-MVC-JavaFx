package com.company.view;

import com.company.model.Student;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class MainPage extends BorderPane {

    private TableView<Student> studentTableView;
    private Button addBTN;
    private Button removeBTN;
    private Button exitBTN;

    public MainPage(){

        createTable();

        TableColumn<Student, String> studentNameCOL = new TableColumn<>("Name");
        TableColumn<Student, String> studentLastCOL = new TableColumn<>("LastName");
        TableColumn<Student, String> studentIdCOL = new TableColumn<>("Id");

        studentNameCOL.setCellValueFactory(new PropertyValueFactory<>("name"));
        studentLastCOL.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        studentIdCOL.setCellValueFactory(new PropertyValueFactory<>("studentId"));

        studentTableView.getColumns().addAll(studentNameCOL, studentLastCOL, studentIdCOL);
        studentTableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);


        VBox vBox = new VBox();

        vBox.getChildren().addAll(addBTN, removeBTN, exitBTN);
        vBox.setSpacing(5);
        vBox.setAlignment(Pos.BOTTOM_CENTER);

        this.setCenter(studentTableView);
        this.setRight(vBox);


    }

    private void createTable(){
        studentTableView = new TableView<>();
        addBTN = new Button("Add Student");
        removeBTN = new Button("Remove Student");
        exitBTN = new Button("Exit");

        addBTN.setMaxWidth(Double.MAX_VALUE);
        removeBTN.setMaxWidth(Double.MAX_VALUE);
        exitBTN.setMaxWidth(Double.MAX_VALUE);
    }

    public TableView<Student> getStudentTableView() {
        return studentTableView;
    }

    public void setStudentTableView(TableView<Student> studentTableView) {
        this.studentTableView = studentTableView;
    }

    public Button getAddBTN() {
        return addBTN;
    }

    public void setAddBTN(Button addBTN) {
        this.addBTN = addBTN;
    }

    public Button getRemoveBTN() {
        return removeBTN;
    }

    public void setRemoveBTN(Button removeBTN) {
        this.removeBTN = removeBTN;
    }

    public Button getExitBTN() {
        return exitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        this.exitBTN = exitBTN;
    }
}
