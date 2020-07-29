package com.example.university_data_sheet;

public class OurDataSet {

    String  headofdepertment;
    String depertment;
    String  employee;
    String student;
    String university;

    public OurDataSet(String headofdepertment, String depertment, String employee, String student,String university) {
        this.headofdepertment = headofdepertment;
        this.depertment = depertment;
        this.employee = employee;
        this.student = student;
        this.university = university;
    }


    public String getHeadofdepertment() {
        return headofdepertment;
    }

    public void setHeadofdepertment(String headofdepertment) {
        this.headofdepertment = headofdepertment;
    }

    public String getDepertment() {
        return depertment;
    }

    public void setDepertment(String depertment) {
        this.depertment = depertment;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public OurDataSet() {
    }
}
