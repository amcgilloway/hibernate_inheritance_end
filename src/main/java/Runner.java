import db.DBHelper;
import models.Department;
import models.Engineer;
import models.Manager;

public class Runner {

    public static void main(String[] args) {
        DBHelper.deleteAll("Engineer");
        DBHelper.deleteAll("Employee");
        DBHelper.deleteAll("Manager");
        DBHelper.deleteAll("Department");


        Department department = new Department("Hr");
        DBHelper.save(department);
        Manager manager = new Manager("Peter", "Griffin", 40000,department, 100000 );
        DBHelper.save(manager);
        Engineer engineer1 = new Engineer("Lois", "Griffin", 29000, department);
        DBHelper.save(engineer1);
        Engineer engineer2 = new Engineer("Stewie", "Griffin", 27000, department);
        DBHelper.save(engineer2);

        Engineer found = DBHelper.find(engineer1.getId(), "Engineer");
        Manager foundManager = DBHelper.findManagerForDept(department.getId());
        System.out.println();
    }
}
