package 컬렉션프레임;

import java.util.Scanner;

public class MemberTest2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int option = sc.nextInt();
       MemberManage manage = new MemberManage();

        while(true){
            System.out.print("회원등록 <1> 회원정보조회<2> 모든회원정보조회 <3> 회원삭제<4> 회원비밀번호 변경<5>");
            switch (option){
                case 1 :
                    manage.regMember();
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :









            }
        }
    }
}
