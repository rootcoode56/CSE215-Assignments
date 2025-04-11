public class Q4 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("The exception is: "+e.getMessage());
        }
    }
}
