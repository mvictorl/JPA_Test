package com.mvictorl.test;

import com.mvictorl.entity.EmployeeEntity;
import com.mvictorl.utilites.Util;
import org.hibernate.Session;

/**
 * Created by MVictorL on 12.07.2017.
 */
public class test {

    public static void main(String[] args) {
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();

        // Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("email@test.org");
        emp.setFirstName("Victor");
        emp.setLastName("Mog");

        session.save(emp);

        session.getTransaction().commit();
        Util.shutdown();
    }
}
