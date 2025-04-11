public class FAN extends Devices{
    public FAN(String name, double hours){
        super(name, hours);
    }
    //Cost for using fan TK 1.5 per hour//
    public double expenditure() {
        return getHours() *1.5;
    }
}
