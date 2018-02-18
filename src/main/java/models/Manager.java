package models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="managers")
public class Manager extends Employee {


    private double budget;
    private Set<Employee> employees;
    private Department department;

    public Manager() {
    }

    public Manager(String firstName, String lastName, int salary, Department department, double budget) {
        super(firstName, lastName, salary, department);
        this.budget = budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}

