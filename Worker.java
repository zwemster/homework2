/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee {
    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double salaryCalculate() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Рабочий:\t%s %s. Среднемесячная заработная плата (фиксированная): %.2f",
                surName, name, salary);
    }
}
