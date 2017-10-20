package jaxB;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Employee")
public class Employee implements Serializable {

private int empNo;
private String name;
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
