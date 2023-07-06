package homework;

public class Main {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");

        // Print last char
        char lastChar = getLastChar(str);
        System.out.println("Последний символ: " + lastChar);

        // Check if string contains "Java"
        boolean containsJava = checkSubstring(str, "Java");
        System.out.println("Содержит подстроку 'Java': " + containsJava);

        // replace symbols "а" > "о"
        String replacedStr = replaceCharacters(str, 'a', 'o');
        System.out.println("Замененная строка: " + replacedStr);

        // change lower to upper
        String uppercaseStr = toUpperCase(str);
        System.out.println("Строка в верхнем регистре: " + uppercaseStr);

        // change upper to lower
        String lowercaseStr = toLowerCase(str);
        System.out.println("Строка в нижнем регистре: " + lowercaseStr);

        // cut "Java"
        String substring = extractSubstring(str, "Java");
        System.out.println("Вырезанная подстрока: " + substring);
    }

    // method for last char
    public static char getLastChar(String str) {
        int lastIndex = str.length() - 1;
        return str.charAt(lastIndex);
    }

    // method for substring in the string
    public static boolean checkSubstring(String str, String substring) {
        return str.contains(substring);
    }

    // method for char replace
    public static String replaceCharacters(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    // method for lower to upper
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // method for upper to lower
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    // method for cutting
    public static String extractSubstring(String str, String substring) {
        int startIndex = str.indexOf(substring);
        int endIndex = startIndex + substring.length();
        return str.substring(startIndex, endIndex);
    }
}
