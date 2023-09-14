import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[] {"Александр", "Дмитрий", "Иван", "Михаил", "Сергей", "Андрей", "Алексей", "Егор", "Максим", "Никита"};
        String[] surnames = new String[] {"Иванов", "Петров", "Смирнов", "Соколов", "Кузнецов", "Морозов", "Новиков", "Козлов", "Лебедев", "Зайцев"};

        int salaryIndex = random.nextInt(200, 500);
        int type = random.nextInt(2); // 0 для Worker, 1 для Freelancer

        if (type == 0) {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], 100 * salaryIndex);
        } else {
            int hoursWorked = random.nextInt(100, 200); // Примерные случайные значения
            double hourlyRate = random.nextDouble() * 50; // Примерные случайные значения
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], 0, hoursWorked, hourlyRate);
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

        Arrays.sort(employees/*, new SalaryComparator()*/);
        System.out.println("========================================");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
