import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[] {"Александр", "Дмитрий", "Иван", "Михаил", "Сергей", "Андрей", "Алексей", "Егор", "Максим", "Никита"};
        String[] surnames = new String[] {"Иванов", "Петров", "Смирнов", "Соколов", "Кузнецов", "Морозов", "Новиков", "Козлов", "Лебедев", "Зайцев"};

        int salaryIndex = random.nextInt(200, 500);
        int type = random.nextInt(2); // 0 для Worker, 1 для Freelancer
        int age = random.nextInt(18, 65); // Случайный возраст от 18 до 64 лет

        if (type == 0) {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], 100 * salaryIndex, age);
        } else {
            int hoursWorked = random.nextInt(100, 200); // Примерные случайные значения
            double hourlyRate = random.nextDouble() * 50; // Примерные случайные значения
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], 0, hoursWorked, hourlyRate, age);
        }
    }


    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {
        Employee[] employees = generateEmployees(12);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees);
        System.out.println("\nСортировка по фамилиям:\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());
        System.out.println("\nСортировка по возрасту:\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
