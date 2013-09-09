/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1encapsulated;

/**
 *
 * @author F03 H4MM3R
 */
public class Startup {
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        employee.setFirstName("Dave");
        employee.setLastName("Bond");
        employee.setSsn("222-22-2222");
        employee.completeOrientation();

        System.out.println("The employee's status is: " + employee.getStatus());
    }
}
