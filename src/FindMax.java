public class FindMax {
    public static double findMax(double arr[]){
        double max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if ( arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }




    public static void main(String[] args) {
        double [] arr = { 0.1,3.4,4.1,5.4,67,7};
        double max = findMax(arr);
        System.out.println(max);

    }
}
