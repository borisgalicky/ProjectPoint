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
        double A = getsideA();
        double B = getsideB();
        double C = getsideC();
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
        double A = getsideA();
        double B = getsideB();
        double C = getsideC();
        if(A==B){
            return true;
        }
        if(A==C){
            return true;
        }
        if(C==B){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isEquilateral() {
        double A = getsideA();
        double B = getsideB();
        double C = getsideC();
        if((A==B)&&(B==C)){
            return true;
        }
        else{
            return false;
        }
    }
}
