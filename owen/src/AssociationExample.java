class AssociationExample {
    String canName;
    int carId;
    AssociationExample(String name, int id)
    {
        this.canName = name;
        this.carId = id;
    }
}
class Driver extends AssociationExample{
    String driverName;
    Driver(String name, String cname, int cid){
        super(cname,cid);
        this.driverName=name;
    }
}
class TransportCompany{
    public static void main (String args[])
    {
        Driver obj =new Driver("Andy","Ford",9988);
        System.out.println(obj.driverName+" is a driver of car Id: "+obj.carId);
    }
}
