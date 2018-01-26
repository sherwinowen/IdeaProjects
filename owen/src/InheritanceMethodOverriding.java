class ParentClass{
    //Parent class constructor
    ParentClass(){
        System.out.println("Contructor of Parent");
    }
    void disp(){
        System.out.println("Parent Method");
    }
}

public class InheritanceMethodOverriding extends ParentClass {
    InheritanceMethodOverriding(){
        System.out.println("Constructor of Child");
    }
    void disp(){
        System.out.println("Child Method");
        //Calling the disp() method of parent class
        super.disp();
    }
    public static void main (String args[]){
        //Creating the object of child class
        InheritanceMethodOverriding obj = new InheritanceMethodOverriding();
        obj.disp();
    }
}
