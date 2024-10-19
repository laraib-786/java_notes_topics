public class VarArgs {
    public static int sum(int ...arr){
        int sum=0;
        for(int ele: arr){
            sum+=ele;
        }
        return sum;
    }
    public static int sumWithParameter(int val, int ...arr){
        int sum=val;
        for(int ele: arr){
            sum+=ele;
        }
        return sum;
    }


    public static void main(String[] arg){

        System.out.println(sum(1,2,3,4));
        System.out.println(sum());
        System.out.println(sumWithParameter(1,2,3,4));
    }

}
