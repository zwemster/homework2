public class Freelancer extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public Freelancer(String name, String surName, double salary, int hoursWorked, double hourlyRate, int age) {
        super(name, surName, salary, age);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double salaryCalculate() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("Фрилансер:\t%s %s, %d лет. Среднемесячная заработная плата (почасовая): %.2f",
                surName, name, age, salaryCalculate());
    }
}
