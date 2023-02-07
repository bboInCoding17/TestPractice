package 배열;

public class 최대최소 {
    public static void main(String[] args) {
        int[] arr = {1,10,3,27,99};
        int max = arr[0];
        int min = arr[0];

        //for each
        for(int num : arr){
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }

        System.out.println("최대값 : "+ max);
        System.out.println("최소값 : "+ min);

    }
}
