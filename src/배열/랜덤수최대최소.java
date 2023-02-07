package 배열;

public class 랜덤수최대최소 {
    public static void main(String[] args) {
       int[] arr = new int[10];
       int max = arr[0];
       int min = arr[0];

        System.out.print("랜덤한 숫자는 : ");
       //랜덤 기능 num에 넣기
        for(int i =0; i<arr.length; i++){
            arr[i] = ((int)(Math.random()*100)+1);
        }

        //arr요소 출력
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //for each 로 최대 최소 값 구하기

        for(int num : arr) {
            if (max < num) {
                max = num;
            }

            if(min > num){
                min = num;
            }
        }


        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min );

    }
}
