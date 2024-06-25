//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] array = {56000, 78000, 89465, 58078, 90877};
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2");
        int[ ] payTwo = array;
        int maxPay = payTwo[0];
        for(int i = 0; i < payTwo.length; i++) {
            if (payTwo[i] > maxPay);
            {
                maxPay = payTwo[i];
            }
        }
        int minPay = payTwo[0];
        for(int i = 0; i > payTwo.length; i++) {
            if (minPay > payTwo[i]);
            {
                minPay = payTwo[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей. Максимальная сумма трат за неделю составила " + maxPay + " рублей");

    System.out.println("Задание 3");
    float middlePay = sum / 5;
    System.out.println("Средняя сумма трат за месяц составила " + middlePay + " рублей");

    System.out.println("Задание 4");
    char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    char a = 0;
    for (int i = reverseFullName.length - 1; i >= 0; i--) {
        System.out.print(reverseFullName[i]);
    }
    }

}