public class Task1 {
    public static void main(String[] args) {
        int[] scores = {78, 91, 65, 88, 73, 95, 54, 82, 69, 91};
        int min = scores[0], max = scores[0], sum = 0, count80 = 0, even = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + ": " + scores[i]);
            if (scores[i] < min) min = scores[i];
            if (scores[i] > max) max = scores[i];
            sum += scores[i];
            if (scores[i] >= 80) count80++;
            if (scores[i] % 2 == 0) even++;
        }

        System.out.printf("Мин: %d, Макс: %d, Сумма: %d, Среднее: %.1f, 80+: %d, Чётных: %d\n",
                min, max, sum, (double)sum/scores.length, count80, even);
    }
}
