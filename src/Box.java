public class Box {
    double length ;
    double breadth ;
    double height ;
    double area;
    double volume;

    Box(double length, double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public void AreaOfBox(){
        area= 2*(length*breadth + length*height + height*breadth);
        System.out.println(area);
    }
    public void VolumeOfBox(){
        volume=(length*breadth*height);
        System.out.println(volume);
    }
}
class Box3d extends Box{

    Box3d(double length, double breadth,double height){
        super(length, breadth, height);

    }
    public void AreaOfBox(){
        super.AreaOfBox();
    }


    public void VolumeOfBox() {
        super.VolumeOfBox();
    }

    public static void main(String[] args) {
        Box3d obj = new Box3d(5.0,3.2,4.5);
        obj.AreaOfBox();
        obj.VolumeOfBox();
    }
}
