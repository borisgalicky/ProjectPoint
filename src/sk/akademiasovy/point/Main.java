package sk.akademiasovy.point;

/**
 * Created by host on 17.1.2018.
 */
public class Main {
    public static void main(String[] args) {
        Point p1=new Point(8,12);
        System.out.println("Point p1 is in "+p1.getQuadrant()+" quadrant");
        Point p2= new Point();
        p2.generateRandomCoord();
        System.out.println("Point p2 is in "+p2.getQuadrant()+" quadrant");
        p2.print();
        System.out.println("Distance between p1 and p2 is "+p1.getDistanceFromOtherPoint(p2));

        // 3D
        Point3D p31=new Point3D(8,6,-7);
        Point3D p32=new Point3D();
        p32.generateRandomCoord();
        p31.print();
        p32.print();
        System.out.println("Distance between p31 and p32 is "+p31.getDistanceFromOtherPoint(p32));
        Object o1=new Point();
        Point p3=new Point3D(2,8,7);

        System.out.println(p3.getDistance());
        Point3D p33=(Point3D)p3;
        //Point3D p34=new Point();
        ((Point3D) p3).test();  // pretypovanie

        Geometry g1;
        g1=new Point(5,-9);
        ((Point)g1).print();

        Geometry[] arr=new Geometry[10];
        int i;
        for(i=0;i<10;i++){
            Point3D p=new Point3D();
            p.generateRandomCoord();
            arr[i]=p;
        }
        for(Geometry g:arr){
            ((Point3D)g).print();
        }

        Point bod1=new Point(2,5);
        Point bod2=new Point(10,4);
        Line line1=new Line(bod1,bod2);
        Line line2=new Line(1,3,4,6);

        System.out.println("Length of line1 is: "+line1.getLength());
        System.out.println("Middle point of line2 is: "+line2.getMiddleOfLine());

        Triangle triangle1=new Triangle();
        System.out.println("Perimeter of triangle1: "+triangle1.getPerimeter()+"\nArea of triangle1: "+triangle1.getArea());
    }

}
