class Superclass {
    int num = 100;
    int num1 = 100;
}
//Child class or subclass or derived class
class Subclass extends Superclass
{
    /* The same variable num is declared in the Subclass
    * which is already present in the Superclass
    */
    int num = 110;
    void printNumber(){
        System.out.println(num);
    }
    int num1 = 110;
    void printNumber1(){
        System.out.println(super.num1);
    }
    public static void main (String args[]){
        Subclass obj = new Subclass();
        obj.printNumber();
        obj.printNumber1();

    }
}
