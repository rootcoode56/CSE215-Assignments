public class Q4ii {
    public static void main(String[] args) {
        String str = "NSU";
        try {
            System.out.println(str.charAt(3));
        }catch (Exception e){
            System.out.println("Exception is: "+e.getMessage());
        }
    }
}
