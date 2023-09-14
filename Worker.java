/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee {
    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double salaryCalculate() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Рабочий:\t%s %s, %d лет. Среднемесячная заработная плата (фиксированная): %.2f",
                surName, name, age, salary);
    }
}
