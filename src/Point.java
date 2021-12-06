public class Point {
    private int x;
    private int y;

    public Point(){
        x=10;
        y=14;
}
     Point(int x,int y){
        this.x=x;
        this.y=y;

     }
      public void setX(int x){
        this.x=x;
          System.out.println(x);


      }
      public void setY(int y){
        this.y=y;
          System.out.println(y);
      }
      public void setXY(int x, int y){
        this.x=x;
        this.y=y;
          System.out.println(x+" "+y);

      }

    public static void main(String[] args) {
        Point obj=new Point(15,780);
        obj.setX(11);
        obj.setY(45);
        obj.setXY(23,63);

    }
}
