package labs.java.lab5;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        String text1 = InputReader.readLine("Введите текст для поиска самого длинного слова:");
        System.out.println("Самое длинное слово: " + LongestWordFinder.find(text1));

        // Задача 2
        String word = InputReader.readLine("Введите слово для проверки палиндрома:");
        System.out.println("Палиндром: " + PalindromeChecker.isPalindrome(word));

        // Задача 3
        String text3       = InputReader.readLine("Введите текст для цензуры:");
        String target      = InputReader.readLine("Введите слово для замены:");
        String replacement = InputReader.readLine("Введите строку-замену:");
        System.out.println("Результат: " + Censor.censor(text3, target, replacement));
        // Задача 4
        String mainStr = InputReader.readLine("Введите основную строку:");
        String subStr = InputReader.readLine("Введите подстроку для поиска вхождений:");
        System.out.println("Вхождений: " + SubstringCounter.count(mainStr, subStr));

        // Задача 5
        String text5 = InputReader.readLine("Введите строку для инвертирования слов:");
        System.out.println("Результат: " + WordReverser.reverse(text5));
    }
}
