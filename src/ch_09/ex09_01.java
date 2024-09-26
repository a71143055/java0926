package ch_09;

import java.util.Scanner;

public class ex09_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("학번 : ");
        int number = sc.nextInt();
        System.out.print("학점 : ");
        double grade = sc.nextDouble();
        System.out.printf("[%s]님의 학번은 %d이면, 학점은 %.2f 입니다.", name, number, grade);
    }
}
