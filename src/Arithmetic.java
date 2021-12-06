interface test{
    void square();
}
class Arithmetic implements test{

    @Override
    public void square() {
        System.out.println("This is a Square");
    }
}
class  ToTestInt{
    public static void main(String[] args) {
        Arithmetic obj=new Arithmetic();
        obj.square();
    }
}
