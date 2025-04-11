public class Q4iv {
    public static void main(String[] args) {
        try {
            Object obj = new Object();
            String s = (String)obj;
        }catch (Exception e){
            System.out.println("Exception is: "+e.getMessage());
        }
    }
}
