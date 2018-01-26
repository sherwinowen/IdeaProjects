class SingleInheritance {
    public void methodA()
    {
        System.out.println("Base clas method");
    }
}

class B extends SingleInheritance
{
    public void methodB()
    {
        System.out.println("Child Class method");
    }
    public static void main (String args[])
    {
        B obj = new B();
        obj.methodA();//calling super class method
        obj.methodB();//
    }
}
