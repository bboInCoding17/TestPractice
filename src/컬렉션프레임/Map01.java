package 컬렉션프레임;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {
            public static void main(String[] args) {
            Map<Integer, String> map = new HashMap<>();
            map.put(22,"김자비");
            map.put(55,"최자비");
            map.put(30,"윤자비");


            //map.get(index)로 정의할 수 없다(순서가 정해지지 않았다)
            //Key는 index가 아니다.


            //모든 데이터 출력 - 어려움
            //1. Map에 저장된 모든 키 정보 조회
            //keySet() : map에 저장되 Key들을 set형태로 반환(중복불가 데이터 뽑아낼 수 있다)
            Set<Integer> keySet = map.keySet();


            // set 전환 후 데이터 모두 출력
            //for - each
            //for -each 문을 key 값 알아낸 뒤 map.get(key)로 value 데이터 뽑아 낸다
            for(int key : keySet){
                System.out.println("key - " + key + " / value = "+ map.get(key));
            }




        }
    }


