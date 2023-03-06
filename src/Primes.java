// создание класса для проверки простых чисел
public class Primes {
    // главный метод, который выводит значения
    public static void main(String args[]) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i))
                System.out.println(i + " - является простым числом");
        }
    }
    // функция для нахождения простых чисел
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }
}

