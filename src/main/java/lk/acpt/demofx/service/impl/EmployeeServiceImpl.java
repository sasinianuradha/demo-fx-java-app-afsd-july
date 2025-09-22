package lk.acpt.demofx.service.impl;

import lk.acpt.demofx.db.Database;
import lk.acpt.demofx.dto.EmployeeDto;
import lk.acpt.demofx.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
    public boolean saveEmployee(EmployeeDto employeeDto) {
        Database.employees.add(new Employee(employeeDto.getIdNo(), employeeDto.getEmployeeName(), employeeDto.getEmployeeAddrees(), employeeDto.getEmployeePosition()));

        return true;


    }

    public void getAll() {
        System.out.println("------Employee List-----");
        for (Employee allEmployrrs : Database.employees) {
            System.out.println(allEmployrrs.getIdNo());
            System.out.println(allEmployrrs.getEmployeeName());
            System.out.println(allEmployrrs.getEmployeeAddrees());
            System.out.println(allEmployrrs.getEmployeePosition());
        }

    }

    public Employee update(EmployeeDto employeeDto) {

        for (Employee updateEmployee : Database.employees) {
            if (updateEmployee.getIdNo() == employeeDto.getIdNo()) {
                updateEmployee.setEmployeeName(employeeDto.getEmployeeName());
                updateEmployee.setEmployeeAddrees(employeeDto.getEmployeeAddrees());
                updateEmployee.setEmployeePosition(employeeDto.getEmployeePosition());

                return updateEmployee;
            }
        }
        return null;

    }

    public boolean delete(EmployeeDto employeeDto) {
        for (Employee deleteEmployee : Database.employees) {
            if (deleteEmployee.getIdNo() == employeeDto.getIdNo()) {
                deleteEmployee.setEmployeeName("null");
                deleteEmployee.setEmployeeAddrees("null");
                deleteEmployee.setEmployeePosition("null");
                System.out.println("delete employee(bug/fix)");

                return true;
            }
        }

        return false;


    }

    public Employee search(EmployeeDto employeeDto) {

        for (Employee searchEmployee : Database.employees) {
            if (searchEmployee.getIdNo() == employeeDto.getIdNo()) {
                employeeDto.setEmployeeName(searchEmployee.getEmployeeName());
                employeeDto.setEmployeeAddrees(searchEmployee.getEmployeeAddrees());
                employeeDto.setEmployeePosition(searchEmployee.getEmployeePosition());

                return searchEmployee;
            }
        }

        return null;
    }

}
