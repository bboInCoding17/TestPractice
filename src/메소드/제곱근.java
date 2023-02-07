package 메소드;

import java.util.Scanner;

public class 제곱근 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        System.out.print("원하는 정수를 입력하세요: ");
        num = sc.nextDouble();

        System.out.println(squre(num));

    }
    public static double squre(double num){
        Scanner sc = new Scanner(System.in);
        int squreNum;
        double result=1;

        System.out.print("제곱할 횟수를 입력하세요 : ");
        squreNum=sc.nextInt();

        for(int i=0; i<squreNum; i++){
            result*=num;
        }
        return result;
    }
}

