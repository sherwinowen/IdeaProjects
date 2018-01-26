class AggregationExample {
    int streetNum;
    String city;
    String state;
    String country;
    AggregationExample(int street, String c, String st, String coun)
    {
        this.streetNum=street;
        this.city=c;
        this.state=st;
        this.country=coun;
    }
}
class StudentClass
{
    int rollNum;
    String studentName;
    //Creating HAS-A relationship with AggregationExample class
    AggregationExample studenAddr;
    StudentClass(int roll, String name, AggregationExample addr){
        this.rollNum=roll;
        this.studentName=name;
        this.studenAddr=addr;
    }
    public static void main (String args[]){
        AggregationExample ad = new AggregationExample(55, "Agra", "UP", "India");
        StudentClass obj = new StudentClass(123,"Chaitanya",ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studenAddr.streetNum);
        System.out.println(obj.studenAddr.city);
        System.out.println(obj.studenAddr.state);
        System.out.println(obj.studenAddr.country);
    }
}

