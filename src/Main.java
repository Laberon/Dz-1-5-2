import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println(Arrays.toString(arr));//проверка обозначены ли массивы

        int expenses=0;
        for (int i = 0; i < arr.length; i++) {
            expenses+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+expenses+" рублей");//сумма затрат в месяц

        int expensesMin=0;
        int expensesMax=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > expensesMax) {
                expensesMax = arr[i];
            } else {
                expensesMin=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + expensesMin + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + expensesMax + " рублей");


        double expensesAver = 0;
        /*
        expensesAver = expenses / arr.length;
        }*/
        if (arr.length > 0) {
            double midle=0;
            for (int i = 0; i < arr.length; i++) {
            midle+=arr[i];
        }
            expensesAver=midle/ arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + expensesAver + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        /*
        int begin=0;
        int end=reverseFullName.length-1;
        char temp;
        while(end>begin){
            temp = reverseFullName[begin];
            reverseFullName[begin]=reverseFullName[end];
            reverseFullName[end] = temp;
            end--;
            begin++;
        }
        System.out.println(reverseFullName);
        System.out.println(reverseFullName.reverse);
        /*
        char N;
        int n=reverseFullName1.length;
        for (int i = 0; i < n/2; i++) {
            N=reverseFullName1[n-i-1];
            reverseFullName1[n-i-1]=reverseFullName1[i];
            reverseFullName1[i]=N;

        }
        for (int i = 0; i < reverseFullName1.length; i++) {
            System.out.print(reverseFullName1[i]);
        }*/
    }
}