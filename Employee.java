/**
 * Класс Работник
 */
public abstract class Employee implements Comparable<Employee>{
    /**
     * Имя сотрудника
     */
    protected String name;
    /**
     * Фамилия сотрудника
     */
    protected String surName;
    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Возраст сотрудника
     */
    protected int age;

    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчёт среднемесячной заработной платы
     * @return
     */
    public abstract double salaryCalculate();

    @Override
    public String toString() {
        return String.format("%s %s",surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0) {
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}