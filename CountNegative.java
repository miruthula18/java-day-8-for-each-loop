public class CountNegative {
    public static void main(String[] args) {

        int[] arr = {-5,10,-2,15,20,-7};

        int count = 0;

        for(int x : arr){

            if(x < 0){
                count++;
            }

        }

        System.out.println("Negative Count = " + count);

    }
}
