package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public String toString() {
        return id +
                ", " +
                name +
                ", " +
                String.format("%.2f", salary);
    }

    public void increaseSalary(double percent){
        salary *= percent / 100 + 1;
    }

    public Integer getId() {
        return (int)id;
    }
}
