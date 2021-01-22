public class Main{

    public static void main(String[] args) {
        replace_variables();
        filling_the_array();
        replace_variables2();
        diagonals();
        min_max();
        int[] task6 = {1, 2, 2, 2, 2, 1};
        System.out.println(checkBalance(task6));
        //int[] task7 = {1, 2, 3, 4, 5};
        //shift(task7, 2);


    }

    public static void replace_variables() {
        System.out.println(" Задание 1: ");
        int[] task1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int r = 0; r < task1.length; r++) {
            if (task1[r] == 0) {
                System.out.print(1 + " ");
            } else System.out.print(0 + " ");
        }
        System.out.println();
    }

    public static void filling_the_array() {
        System.out.println(" Задание 2: ");
        int[] task2 = new int[8];
        int c = -3;
        for (int r = 0; r < task2.length; r++) {
            c += 3;
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void replace_variables2() {
        System.out.println(" Задание 3: ");
        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i;
        for (int r = 0; r < task3.length; r++) {
            if (task3[r] < 6) {
                i = task3[r] * 2;
                System.out.print(i + " ");
            } else System.out.print(task3[r] + " ");
        }
        System.out.println();
    }

    public static void diagonals() {
        System.out.println(" Задание 4: ");
        int[][] task4 = new int[4][4];
        for (int r = 0; r < task4.length; r++) {
            for (int i = 0, y = task4[r].length; i < task4[r].length; i++, y--) {
                if (r == i || r == (y - 1)) task4[r][i] = 1;
                System.out.print(task4[r][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void min_max() {
        System.out.println(" Задание 5: ");
        int[] task5 = {7, 16, 45, 1, -2, 9, 3, 11, 22, 4};
        int min = task5[0], max = task5[0];
        for (int r = 0; r < task5.length; r++) {
            if (task5[r] < min) {
                min = task5[r];
            }
            if (task5[r] > max) {
                max = task5[r];
            }
        }
        System.out.println(" Минимальный элемент имеет значение = " + min);
        System.out.println(" Макcимальный элемент имеет значение = " + max);
    }

    public static boolean checkBalance(int[] task6) {
        System.out.println(" Задание 6: ");
        int leftSum = task6[0] + task6[1];
        int rightSum = 0;

        for (int r = 2; r < task6.length; r++) {
            rightSum += task6[r];
        }
        if (leftSum == rightSum) {
            return true;
        }
        for (int r = 0; r < task6.length - 4; r++) {
            leftSum += task6[r + 2];
            rightSum -= task6[r + 2];
            if (leftSum == rightSum) return true;
        }
        return false;

    }
}

//    public static void shift(int[] task7, int n) {
//        System.out.println(" Задание 7: ");
//        int r = 0;
//        if (n > 0) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < task7.length - 1; j++){
//                        r = task7[j + 1];
//                        task7[j + 1] = task7[0];
//                        task7[0] = r;
//                    System.out.print(r);
//                    }
//
//                }
//            }
//        }
//    }
