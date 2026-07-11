public class AverageArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int sum = 0;

        for(int x : arr){
            sum += x;
        }

        double average = (double) sum / arr.length;

        System.out.println("Average = " + average);

    }
}
