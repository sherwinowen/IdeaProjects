class StaticMethodNonStaticMethod {
    static int i = 100;
    static String s = "BeginnersBook";
    //Static Method
    static void display(){
        System.out.println("i :"+i);
        System.out.println("s :"+s);
    }
    //Non-Static Method
    void funcn(){
        //Static method called in non-static method
        display();
    }
    //statis method
    public static void main (String args[]){
        StaticMethodNonStaticMethod obj = new StaticMethodNonStaticMethod();
        //You need to have object to call this non-statis method
        obj.funcn();
        //Static Method called in another static method
        display();
    }
}
