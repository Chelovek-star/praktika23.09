public class task4 {
    public static void main(String[] args) {
        int count = 10, sum = 786, max = 95, min = 54, count80 = 5; // Данные из Задания 1

        StringBuilder report = new StringBuilder();
        report.append("ОТЧЁТ ПО ГРУППЕ\n")
                .append("Количество: ").append(count).append("\n")
                .append("Средний балл: ").append((double)sum/count).append("\n")
                .append("Максимум: ").append(max).append("\n")
                .append("Минимум: ").append(min).append("\n")
                .append("Студенты 80+: ").append(count80);

        System.out.println(report.toString());
    }
}

