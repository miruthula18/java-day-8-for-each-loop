public class SearchElement {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int target = 30;

        boolean found = false;

        for(int x : arr){

            if(x == target){
                found = true;
                break;
            }

        }

        System.out.println(found);

    }
}
