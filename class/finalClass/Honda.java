//final class Inheritance

final class Base{}  
class Sub extends Base{
    void run(){
        System.out.println("Sub run() is created ");
    }
}

final class Demo{
    public static void main(String[] args) {
        Sub a= new Sub();
        a.run();
    }
}