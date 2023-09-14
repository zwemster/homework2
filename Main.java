import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static Worker generateWorker() {
        String[] names = new String[] {"Александр", "Дмитрий", "Иван", "Михаил", "Сергей", "Андрей", "Алексей", "Егор", "Максим", "Никита"};
        String[] surnames = new String[] {"Иванов", "Петров", "Смирнов", "Соколов", "Кузнецов", "Морозов", "Новиков", "Козлов", "Лебедев", "Зайцев"};

        int salaryIndex = random.nextInt(200, 500);

        return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], 100 * salaryIndex);
    }

    public static Worker[] generateWorkers(int count) {
        Worker[] workers = new Worker[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateWorker();
        }
        return workers;
    }

    public static void main(String[] args) {
        Worker[] workers = generateWorkers(12);
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        Arrays.sort(workers/*, new SalaryComparator()*/);
        System.out.println("========================================");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
