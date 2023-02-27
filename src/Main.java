import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("задача 2");
        int[] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        for (int i = 0; i < 2; i++) {
            System.out.print(massive[i] + ", ");
        }
        System.out.print(massive[2]);
        System.out.println();
        double[] massive1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 2; i++) {
            System.out.print(massive1[i] + ", ");
        }
        System.out.print(massive1[2]);
        System.out.println();
        int[] year = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int index = 0; index < 11; index++) {
            System.out.print(year[index] + ", ");
        }
        System.out.print(year[11]);
        System.out.println();
        System.out.println("Задача 3");
        for (int i = 2; i > 0; i--) {
            System.out.print(massive[i] + ", ");
        }
        System.out.print(massive[0]);
        System.out.println();
        for (int i = 2; i > 0; i--) {
            System.out.print(massive1[i] + ", ");
        }
        System.out.print(massive1[0]);
        System.out.println();
        for (int index = 11; index > 0; index--) {
            System.out.print(year[index] + ", ");
        }
        System.out.print(year[0]);
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < 3; i++) {
            if (massive[i] % 2 != 0) {
                massive[i] = massive[i] + 1;
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}