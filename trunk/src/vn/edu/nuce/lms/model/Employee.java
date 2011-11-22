/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.lms.model;

import java.io.Serializable;

/**
 *
 * @author TRAN VIE CUONG
 */
public class Employee implements Serializable {
    private String idEmployee;
    private String name;

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
