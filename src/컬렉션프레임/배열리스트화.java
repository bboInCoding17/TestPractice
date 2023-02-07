package 컬렉션프레임;

import java.util.Arrays;
import java.util.List;

public class 배열리스트화 {
    public static void main(String[] args) {
        Integer  [] num = {1,5,6,9,10,21};

        List<Integer> list = Arrays.asList(num);

        for(int i =0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}
