public class CountOdd {
    public static void main(String[] args) {

        int[] arr = {2,5,8,11,14,19};

        int count = 0;

        for(int x : arr){

            if(x % 2 != 0){
                count++;
            }

        }

        System.out.println("Odd Count = " + count);

    }
}
