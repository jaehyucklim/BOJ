package Day3;

import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 1; j < 10; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }
}
