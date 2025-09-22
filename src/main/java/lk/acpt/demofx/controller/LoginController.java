package lk.acpt.demofx.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lk.acpt.demofx.db.Database;
import lk.acpt.demofx.dto.EmployeeDto;
import lk.acpt.demofx.entity.Employee;
import lk.acpt.demofx.service.impl.EmployeeService;
import lk.acpt.demofx.service.impl.EmployeeServiceImpl;

public class LoginController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNumber;

    @FXML
    private TextField txtPosition;

    @FXML
    void save(ActionEvent event) {
        int idNo =Integer.parseInt(txtNumber.getText());
        String employeename =txtName.getText();
        String employeeaddrees =txtAddress.getText();
        String employeeposition =txtPosition.getText();
        EmployeeService service=new EmployeeServiceImpl();
        boolean saved = service.saveEmployee(new EmployeeDto(idNo,employeename, employeeaddrees, employeeposition));
        if(saved){
            System.out.println("Saved Success.........!");
        }else {
            System.out.println("Save Failed....!");
        }


    }

    @FXML
    void getAll(ActionEvent event) {
        EmployeeService service=new EmployeeServiceImpl();
        service.getAll();
    }



    @FXML
    void search(ActionEvent event) {
        int number =Integer.parseInt(txtNumber.getText());

        String name =txtName.getText();

        String addrees =txtAddress.getText();

        String position =txtPosition.getText();

        EmployeeService service=new EmployeeServiceImpl();

        Employee searched = service.search(new EmployeeDto(number,name,addrees,position));
        if (searched != null) {
            System.out.println(searched.getIdNo());
            System.out.println(searched.getEmployeeName());
            System.out.println(searched.getEmployeeAddrees());
            System.out.println(searched.getEmployeePosition());

        }else {
            System.out.println("Employee not found");

        }

    }

    @FXML
    void update(ActionEvent event) {
        int number =Integer.parseInt(txtNumber.getText());

        String name =txtName.getText();

        String addrees =txtAddress.getText();

        String position =txtPosition.getText();

        EmployeeService service=new EmployeeServiceImpl();

        Employee updated = service.update(new EmployeeDto(number,name,addrees,position));
        if (updated != null) {
            System.out.println("Updated : "+ updated.getIdNo());
            System.out.println(updated.getEmployeeName());
            System.out.println(updated.getEmployeeAddrees());
            System.out.println(updated.getEmployeePosition());


        }else {
            System.out.println("Employee not found");
            System.out.println("Can't update");
        }
    }

    @FXML
    void delete(ActionEvent event) {
        int number =Integer.parseInt(txtNumber.getText());
        String name =txtName.getText();

        String addrees =txtAddress.getText();

        String position =txtPosition.getText();


        EmployeeService service=new EmployeeServiceImpl();

        boolean deleted = service.delete(new EmployeeDto(number,name,addrees,position));
        if ( deleted) {
            System.out.println("this employee is deleted");


        }else {
            System.out.println("Employee not found");

        }
    }

}
