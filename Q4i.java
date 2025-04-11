public class Q4i {
    public static void main(String[] args) {
        try {
            System.out.println(9/0);
        }catch (Exception e){
            System.out.println("The exception is: "+e.getMessage());
        }
    }
}
