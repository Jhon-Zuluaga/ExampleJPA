/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejpa.test;

import co.edu.sena.examplejpa.model.Employee;
import co.edu.sena.examplejpa.model.EmployeeType;
import co.edu.sena.examplejpa.controller.EmployeeController;
import co.edu.sena.examplejpa.controller.EmployeeTypeController;
import co.edu.sena.examplejpa.controller.IEmployeeController;
import co.edu.sena.examplejpa.controller.IEmployeeTypeController;
import co.edu.sena.examplejpa.persistence.DAOFactory;
import co.edu.sena.examplejpa.utils.MessageUtils;
import java.util.List;

/**
 *Fecha: 22/04/2025
 * @author Jhon Zuluaga
 * Objetivo; probar el controlador empleado
 */
public class TestEmployee {
    
    public void insert()
    {
        try {
            Employee employee = new Employee(1120L, "ROBER", "Trv 12", "232");
            IEmployeeTypeController typeController = new EmployeeTypeController();
            EmployeeType type = typeController.findById(1);
            employee.setTypeId(type); // FK
          
            IEmployeeController controller = new EmployeeController();
            controller.insert(employee);
            MessageUtils.ShowInfoMessage("Empleado creado exitosamente");
                    
        } catch (Exception e) {
            MessageUtils.ShowErrorMessage(e.getMessage());
        }
    }
    
    public void update()
    {
        try {
             Employee employee = new Employee(1120L, "ALBERTO", "Trv 12", "666");
            IEmployeeTypeController typeController = new EmployeeTypeController();
            EmployeeType type = typeController.findById(2);
            employee.setTypeId(type); // FK
          
            IEmployeeController controller = new EmployeeController();
            controller.update(employee);
            MessageUtils.ShowInfoMessage("Empleado modificado exitosamente");
        } catch (Exception e) {
        }
    }
    
    public void delete()
    {
        try {
             IEmployeeController controller = new EmployeeController();
             Employee employee = controller.findById(1120L);
             controller.delete(employee.getDocument());
            MessageUtils.ShowInfoMessage("Empleado eliminado exitosamente");
        } catch (Exception e) {
            MessageUtils.ShowErrorMessage(e.getMessage());
        }
    }
    
     public void findAll() {
        try {
            IEmployeeController controller = new EmployeeController();
            List<Employee> employees = controller.findAll();
            String message = "";
            for (Employee e : employees) {
                message += "document: "+ e.getDocument() +" Nombre: " + e.getFullname() +" Dirección: " + e.getDireccion()+ e.getTelefono() + "Teléfono: "+ e.getTelefono() +" Tipo: " + e.getTypeId().getDescript() + "\n";

            }
            MessageUtils.ShowInfoMessage(message);
        } catch (Exception e) {
            MessageUtils.ShowErrorMessage(e.getMessage());
        }
    }
//     public void findbyId(long document)) {
//        try {
//            // CONSULTAR POR ID
//            System.out.println("******************");
//            EmployeeType employeeType1 = DAOFactory.getEmployeeDAO().findById(1115);
//            if (employeeType1 != null) {
//                System.out.println("id: " + employeeType1.getId() + " / Descript: " + employeeType1.getDescript());
//            } else {
//                System.out.println("No existe el EmployeeType con ese id...");
//            }
//        } catch (Exception e) {
//            MessageUtils.ShowErrorMessage("Error al consultar por id el tipo de empleado" + e.getMessage());
//        }
//    }
    public static void main(String[] args) {
        TestEmployee test = new TestEmployee();
//        test.insert();
//        test.update();
//        test.delete();
//        test.findAll();
    }
}
