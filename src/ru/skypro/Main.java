package ru.skypro;

public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        //task1
        System.out.println("task1");
        int arrSum = 0;
            for (int i = 0; i < arr.length; i++) {
                    arrSum = arrSum + arr[i];
                    }
                    System.out.print("Сумма " + arrSum);
        System.out.println();

        //task2
        int max = arr[0];
        int min = arr[0];
        System.out.println("task2");
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
           if(min>arr[i]) {
               min = arr[i];
           }
       }
        System.out.println("Минимальная сумма трат за день составила "+max+" рублей");
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей");

        //task3
        System.out.println("task3");
        float arrAverageSum = arrSum;
        arrAverageSum = arrAverageSum/(arr.length-1);
        System.out.println("Средняя сумма трат за месяц "+ arrAverageSum);

        //task4
        System.out.println("task4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i=reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
