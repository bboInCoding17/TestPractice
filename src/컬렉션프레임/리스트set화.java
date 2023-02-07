package 컬렉션프레임;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 리스트set화 {
    public static void main(String[] args) {
        //List를 Set으로 변경
        List<Double> list = new ArrayList<>();
        list.add(5.5);
        list.add(17.2);
        list.add(20.3);
        list.add(12.5);
        list.add(1.7);
        list.add(1.7);


        //중복 제거를 위해, 생성자에 List 객체 넣어준다.
        Set<Double> set = new HashSet<>(list);


        for(Double e: set){
            System.out.println(e);//중복 제거된다.
        }
        //중복 제거 후 데이터를 List화
        list = new ArrayList<>(set);
    }
}
