package cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    //полета -> характеристики
    private String name;
    private int capacity;
    private List<Employee> employees;

    //методи -> поведение
    //конструктор

    public Cafe(String name, int capacity) {
        //нов празен обект
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        //мога да добавям ако текущия брой < капацитета
        //не мога да добавям текущия брой >= капацитета
        if (this.employees.size() < this.capacity) {
            this.employees.add(employee);
        }
    }

    public boolean removeEmployee(String name) {
        for (Employee employee : this.employees) {
            if (employee.getName().equals(name)) {
                this.employees.remove(employee);
                return true;
            }
        }
        //преминали сме през всички служители и не сме намерили служител с даденото име
        return false;
    }

    public Employee getOldestEmployee() {
        //1 начин
        return this.employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();

        //2 начин
        /*Employee oldestEmployee = new Employee("", 0, ""); //най-възрастния служител
        for (Employee employee : this.employees) {
            if (employee.getAge() > oldestEmployee.getAge()) {
                oldestEmployee = employee;
            }
        }
        return oldestEmployee;*/
    }

    public Employee getEmployee(String name) {
        for (Employee employee : this.employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }

        //преминали през всички служители и не сме намерили служител с даденото име
        return null;
    }

    public int getCount() {
        return this.employees.size();
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Employees working at Cafe " + this.name + ":").append(System.lineSeparator());
        this.employees.forEach(e -> stringBuilder.append(e.toString()).append(System.lineSeparator()));
        return stringBuilder.toString();
    }
}
