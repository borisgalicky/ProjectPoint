package sk.akademiasovy.point;

public class Triangle{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter(){
        double sideA=a.getDistanceFromOtherPoint(b);
        double sideB=b.getDistanceFromOtherPoint(c);
        double sideC=c.getDistanceFromOtherPoint(a);
        double perimeter=sideA+sideB+sideC;
        return perimeter;
    }

    public double getArea(){
        double s=(perimeter/2);
        double area=Math.sqrt(s*(s+sideA)+(s+sideB)+(s+sideC));
        return area;
    }
}
