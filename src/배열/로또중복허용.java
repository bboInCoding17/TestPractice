package 배열;

public class 로또중복허용 {
    public static void main(String[] args) {
        int[] lotto =new int [6];

        System.out.print("로또 번호 : ");
        for(int i =0; i<lotto.length; i++){
            lotto[i] = (int)(Math.random()*45)+1;
        }
        for(int i =0; i<lotto.length; i++){
            System.out.print(lotto[i] + " ");
        }
    }
}
