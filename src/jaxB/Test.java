package jaxB;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Test {
/**
 * we take a context and put it to marsheller which will convert elements to XML
 * @param args
 * @throws JAXBException
 */
    public static void main(final String[] args) throws JAXBException {
        // TODO Auto-generated method stub

        Employee employee = new Employee();
        employee.setEmpNo(10); employee.setName("monir"); employee.setSalary(100.40);


            JAXBContext context = JAXBContext.newInstance(Employee.class);

             Marshaller marshaller = context.createMarshaller();

             File file = new File("khan.xml");

             marshaller.marshal(employee, System.out);
             marshaller.marshal(employee, file);

             StringWriter writer = new StringWriter(); // Ideal for web service
             marshaller.marshal(employee, writer);
             System.out.println(writer);
    }

}
