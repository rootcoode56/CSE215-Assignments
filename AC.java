public class AC extends Devices{
    public AC(String name, double hours){
        super(name, hours);
    }
    //Cost for using AC TK 5 per hour//
    public double expenditur() {
        return getHours() * 5;
    }
}
