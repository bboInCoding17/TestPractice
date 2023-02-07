package 컬렉션프레임;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberManage {

    Scanner sc = new Scanner(System.in);
    List<Member1> member1List = new ArrayList<>();

    //1. 키보드로 1번 누르면 정보 등록 한다.
    private Member1 scInfo(){
        System.out.print("아이디 :");
        String id = sc.next();
        System.out.print("회원이름 :");
        String name = sc.next();
        System.out.print("비밀번호 :");
        String pw = sc.next();

        Member1 member1 = new Member1(id, name ,pw);

        return member1;
    }

    public void regMember(){
        member1List.add(scInfo());
    }

    //2. 회원 정보 조회









}
