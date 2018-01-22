package sk.akademiasovy.point;

import java.util.Random;

/**
 * Created by host on 18.1.2018.
 */
public class Point3D extends Point{
    private int z;

    public int getZ() {
        return z;
    }

    public Point3D(){
        z=0;
    }

    public Point3D(int x, int y, int z){
        super(x,y); // vola kontruktor rodic a posiela mu 2 parametre
                    // Point : public Point(int x, int y)
        this.z=z;
    }

    @Override
    public double getDistance() {
        return Math.sqrt(getX()*getX()+getY()*getY()+z*z);
    }

    @Override
    public void generateRandomCoord() {
        Random random=new Random();
        this.z=random.nextInt(41)-20;
        super.generateRandomCoord();
    }

    public double getDistanceFromOtherPoint(Point3D other){
        return Math.sqrt(Math.pow(getX()-other.getX(),2)+Math.pow(getY()-other.getY(),2)+Math.pow(z-other.getZ(),2));
    }

    @Override
    public void print(){
        System.out.println("Point3D: ["+getX()+","+getY()+","+z+"] Dist: "+getDistance());
    }

    public void test(){

    }
}
