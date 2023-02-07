package 메소드;

import java.util.Scanner;

public class 문자열반복 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        String text;

        System.out.print("원하는 글자를 입력하세요 : ");
        text=sc.next();
        System.out.print("원하는 정수를 입력하세요 : ");
        num=sc.nextInt();

        test1_19(text, num);
    }

    //"abc",3 -> "abcabcabc"
    public static void test1_19(String str, int num){
        String result ="";
        for(int i=0; i<num; i++){
            result += str;
        }
        System.out.println(result);
    }
}


