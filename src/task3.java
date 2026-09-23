public class task3 {public static void main(String[] args) {
    String text = " Java, Python, java, C++, Kotlin, JAVA, Python ".trim();
    String[] words = text.split(",");
    int javaCount = 0, over4 = 0;
    StringBuilder longWords = new StringBuilder();

    for (String w : words) {
        String word = w.trim();
        System.out.println(word + " - " + word.length());
        if (word.equalsIgnoreCase("Java")) javaCount++;
        if (word.length() > 4) over4++;
        if (word.length() >= 5) longWords.append(word).append(" ");
    }
    System.out.printf("Java: %d раз, Слов >4: %d\nСлова от 5 букв: %s\n", javaCount, over4, longWords);
}
}

