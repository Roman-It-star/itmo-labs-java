package labs.java.lab5;

public class Censor {

    /**
     * Заменяет в тексте все вхождения слова target на replacement.
     *
     * @param text        исходный текст (не null)
     * @param target      слово для замены (не null)
     * @param replacement строка-замена (не null)
     * @return текст с произведёнными заменами
     * @throws IllegalArgumentException если любой из аргументов == null
     */
    public static String censor(String text, String target, String replacement) {
        if (text == null || target == null || replacement == null) {
            throw new IllegalArgumentException("text, target и replacement не могут быть null");
        }
        return text.replace(target, replacement);
    }
}
