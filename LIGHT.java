public class LIGHT extends Devices{
    public LIGHT(String name, double hours){
        super(name, hours);
    }
    //Cost for using light TK 1 per hour//
    public double expenditure() {
        return getHours() *1;
    }
}
