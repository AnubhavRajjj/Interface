interface Outer{
    void display();
}
interface Inner extends Outer{
    void display1();
}
class toTest implements Outer,Inner{

    @Override
    public void display() {
        System.out.println("Hii");

    }

    @Override
    public void display1() {
        System.out.println("Hello");

    }

    public static void main(String[] args) {
        toTest obj= new toTest();
        obj.display();
        obj.display1();
    }
}