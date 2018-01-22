package sk.akademiasovy.point;

public class Main{
    public static void main(String[] args) {
        Point2D p1=new Point2D(8,12);
        System.out.println("Point P1 is in "+p1.getQuadrant()+". quadrant.");
        Point2D p2=new Point2D();
        p2.generateRandomCoordinates();
        System.out.println("Point P2 is in "+p2.getQuadrant()+". quadrant.");
        System.out.println("Point P1 is "+p1.getDistance()+" cm away from center.");
        p1.printInfo();
        System.out.println("Distance between points P1 and P2 is: "+p1.getDistanceFromOtherPoint(p2)+" cm.");
    }
}
