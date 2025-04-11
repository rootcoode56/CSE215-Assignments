public class MAIN_CALCULATION {
    public static void main(String[] args) {
        LIGHT Light = new LIGHT("LIGHT",2);
        FAN Fan = new FAN("FAN", 2);
        AC Ac = new AC("AC", 1);

        System.out.println("Total cost of all devices usage: "+(Light.expenditure() + Fan.expenditure() + Ac.expenditur())+" TK");

    }
}
