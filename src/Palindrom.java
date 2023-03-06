import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner input = new Scanner(System.in);
        String read = input.nextLine();
        String c[] = read.split(" ");
        for (int i = 0; i < c.length; i++) {
            String s = c[i];
            if (isPalindrome(s)) {
                System.out.println(s + " является палиндромом");
            } else {
                System.out.println(s + " не является палиндромом");
            }
        }
    }

    // метод, который проходит по строке с конца
    public static String reverseString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i>=0; i--) {
            // charAt(i) возвращает символ по указанному индексу
            reverse += s.charAt(i);
        }
        return reverse;
    }
    // проверка на палиндром
    public static boolean isPalindrome(String s) {
        // метод equals для проверки значения равенства
        return s.equals(reverseString(s));
    }

}
