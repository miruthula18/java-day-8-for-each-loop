public class MinimumElement {
    public static void main(String[] args) {

        int[] arr = {12,45,8,90,23};

        int min = arr[0];

        for(int x : arr){

            if(x < min){
                min = x;
            }

        }

        System.out.println("Minimum = " + min);

    }
}
