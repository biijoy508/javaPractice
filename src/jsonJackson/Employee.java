package jsonJackson;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder
(value = {"name", "empNo", "salary"})

public class Employee implements Serializable{

    private int empNo;
    private String name;
    @JsonIgnore
    private double salary;
    public int getEmpNo() {
        return empNo;
    }
    public void setEmpNo(final int empNo) {
        this.empNo = empNo;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(final double salary) {
        this.salary = salary;
    }

}
