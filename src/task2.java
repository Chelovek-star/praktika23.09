public class task2 {
    public static void main(String[] args) {
        int[][] grades = {{78, 91, 88}, {65, 72, 70}, {90, 94, 89}, {81, 76, 85}};
        double bestAvg = 0; int bestSt = 0, maxG = grades[0][0], maxR = 0, maxC = 0;

        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + "\t");
                sum += grades[i][j];
                if (grades[i][j] > maxG) { maxG = grades[i][j]; maxR = i; maxC = j; }
            }
            double avg = (double) sum / grades[i].length;
            if (avg > bestAvg) { bestAvg = avg; bestSt = i; }
            System.out.println("| Среднее: " + avg);
        }

        for (int j = 0; j < grades[0].length; j++) {
            int sum = 0;
            for (int[] row : grades) sum += row[j];
            System.out.println("Среднее предмета " + j + ": " + (double) sum / grades.length);
        }
        System.out.printf("Лучший студент: %d, Макс элемент: %d [%d][%d]\n", bestSt, maxG, maxR, maxC);
    }
}

