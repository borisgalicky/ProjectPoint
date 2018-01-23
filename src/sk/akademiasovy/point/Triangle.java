package sk.akademiasovy.point;

public class Triangle implements InterfaceTriangle{
    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getsideA(){
        return b.getDistanceFromOtherPoint(c);
    }
    public double getsideB(){
        return a.getDistanceFromOtherPoint(c);
    }
    public double getsideC(){
        return a.getDistanceFromOtherPoint(b);
    }

    public double getTrianglePerimeter(){
        return getsideA()+getsideB()+getsideC();
    }

    @Override
    public double getArea(){
        double s=getTrianglePerimeter()/2;
        double area=Math.sqrt(s*(s-getsideA())*(s-getsideB())*(s-getsideC()));
        return area;
    }

    @Override
    public boolean isRectangular(){
        double A = c.getDistanceFromOtherPoint(b);
        double B = a.getDistanceFromOtherPoint(c);
        double C = a.getDistanceFromOtherPoint(b);
        if((C*C)==(A*A)+(B*B)){
                return true;
        }
        if((B*B)==(A*A)+(C*C)){
            return true;
        }
        if((A*A)==(C*C)+(B*B)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isIsosceles(){
        double sideA = c.getDistanceFromOtherPoint(b);
        double sideB = a.getDistanceFromOtherPoint(c);
        double sideC = a.getDistanceFromOtherPoint(b);
        if(sideA==sideB){
            return true;
        }
        if(sideA==sideC){
            return true;
        }
        if(sideC==sideB){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isEquilateral() {
        double sideA = c.getDistanceFromOtherPoint(b);
        double sideB = a.getDistanceFromOtherPoint(c);
        double sideC = a.getDistanceFromOtherPoint(b);
        if((sideA==sideB)&&(sideB==sideC)){
            return true;
        }
        else{
            return false;
        }
    }
}
