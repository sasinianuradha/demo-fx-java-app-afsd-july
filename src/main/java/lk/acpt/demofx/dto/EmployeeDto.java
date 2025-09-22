package lk.acpt.demofx.dto;

public class EmployeeDto {

    private int idNo;
    private String employeeName;
    private String employeeAddrees;
    private String employeePosition;

    public EmployeeDto() {

    }

    public EmployeeDto(int idNo, String employeeName, String employeeAddrees, String employeePosition) {
        this.setIdNo(idNo);
        this.setEmployeeName(employeeName);
        this.setEmployeeAddrees(employeeAddrees);
        this.setEmployeePosition(employeePosition);
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddrees() {
        return employeeAddrees;
    }

    public void setEmployeeAddrees(String employeeAddrees) {
        this.employeeAddrees = employeeAddrees;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }
}
