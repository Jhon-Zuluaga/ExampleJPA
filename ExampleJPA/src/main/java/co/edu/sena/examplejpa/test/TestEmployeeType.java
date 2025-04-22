/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejpa.test;

import co.edu.sena.examplejpa.model.EmployeeType;
import co.edu.sena.examplejpa.controller.EmployeeTypeController;
import co.edu.sena.examplejpa.controller.IEmployeeTypeController;
import co.edu.sena.examplejpa.persistence.DAOFactory;
import co.edu.sena.examplejpa.utils.MessageUtils;
import java.util.List;

/**
 * Fecha: 22/04/2025
 *
 * @author Jhon Zuluaga Objetivo: probar el controlador tipo de empleado
 */
public class TestEmployeeType {

    public void insert() {
        try {
            EmployeeType employeeType = new EmployeeType();
            employeeType.setDescript("NUEVO TIPO");

            IEmployeeTypeController controller = new EmployeeTypeController();
            controller.insert(employeeType);
            MessageUtils.ShowInfoMessage("Tipo de empleado creado exitosamente");

        } catch (Exception e) {
            MessageUtils.ShowErrorMessage(e.getMessage());

        }
    }

    public void update() {
        try {
            EmployeeType employeeType = DAOFactory.getEmployeeTypeDAO().findById(15);
            employeeType.setDescript("NUEVO TIPO ACTUALIZADO");

            IEmployeeTypeController controller = new EmployeeTypeController();
            controller.update(employeeType);
            MessageUtils.ShowInfoMessage("Tipo de empleado modificado exitosamente");
        } catch (Exception e) {
            MessageUtils.ShowErrorMessage(e.getMessage());
        }
    }

    public void delete() {
        try {
            EmployeeType employeeType = DAOFactory.getEmployeeTypeDAO().findById(5);

            IEmployeeTypeController controller = new EmployeeTypeController();
            controller.delete(employeeType.getId());
            MessageUtils.ShowInfoMessage("Tipo de empleado eliminado exitosamente");
        } catch (Exception e) {
            MessageUtils.ShowErrorMessage(e.getMessage());
        }
    }

    public void findAll() {
        try {
            IEmployeeTypeController controller = new EmployeeTypeController();
            List<EmployeeType> types = controller.findAll();
            String message = "";
            for (EmployeeType type : types) {
                message += "Id: " + type.getId() + "Descripción: " + type.getDescript() + "\n";

            }
            MessageUtils.ShowInfoMessage(message);
        } catch (Exception e) {
            MessageUtils.ShowErrorMessage(e.getMessage());
        }
    }

    public void findbyId() {
        try {
            // CONSULTAR POR ID
            System.out.println("******************");
            EmployeeType employeeType1 = DAOFactory.getEmployeeTypeDAO().findById(3);
            if (employeeType1 != null) {
                System.out.println("id: " + employeeType1.getId() + " / Descript: " + employeeType1.getDescript());
            } else {
                System.out.println("No existe el EmployeeType con ese id...");
            }
        } catch (Exception e) {
            MessageUtils.ShowErrorMessage("Error al consultar por id el tipo de empleado" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        TestEmployeeType test = new TestEmployeeType();
        //test.insert();
        //test.update();
       // test.delete();
        //test.findAll();
        test.findbyId();
    }
}
