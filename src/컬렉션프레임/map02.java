package 컬렉션프레임;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class map02 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(11, "홍길동");
        map.put(23, "김길동");
        map.put(65, "박길동");

        //map에 저장된 key 값을 찾기 위해서 set을 이용한다.

        Set<Integer> keySet = map.keySet();

        for(int key : keySet){
            System.out.println("key : "+ key +" / value: "+ map.get(key));

        }









    }
}
