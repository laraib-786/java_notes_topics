public class MyArray {

    public static int sum(int[] arr){
        int sum =0;
        for(int ele : arr){
            sum+=ele;
        }
        return sum;
    }

    public static void main(String[] arg){
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(arr));
    }
}
