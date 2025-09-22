package lk.acpt.demofx.service.impl;

import lk.acpt.demofx.dto.EmployeeDto;
import lk.acpt.demofx.entity.Employee;

public interface EmployeeService {
    boolean saveEmployee(EmployeeDto employeeDto);
    void getAll();
    Employee search(EmployeeDto employeeDto);
    Employee update(EmployeeDto employeeDto);
    boolean delete(EmployeeDto employeeDto);
}
