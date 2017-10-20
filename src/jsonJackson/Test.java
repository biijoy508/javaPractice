package jsonJackson;

public class Test {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        Employee employee = new Employee();
        employee.setName("Monoir"); employee.setEmpNo(100); employee.setSalary(1000);
        String val = JsonUtil.convertJavaToJson(employee);
        System.out.println(val);
        Employee employee2 = JsonUtil.convertJsonToJava(val, Employee.class);
        System.out.println(employee2.getName() + employee2.getSalary());
    }

}


