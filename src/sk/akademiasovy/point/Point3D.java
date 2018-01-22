package sk.akademiasovy.point;

public class Point3D extends Point2D{
    private int z;

    public int getZ(){
        return z;
    }

    public Point3D(){
        x=0;
    }

    public Point3D(int x, int y, int z){
        super(x,y);//volá konštruktor rodiča a posiela mu dva parametre
        this.z=z;
    }

    public double getDistance(){
        return Math.sqrt(getX()*getY()+getY()*getY());
    }
    @Override
    public double generateRandomCoordinates(){
        Random random=new Random;
        this.z=random.nextInt(41)-20;
        super.generateRandomCoordinates();
    }

    public void getDistanceFromOtherPoint(){

    }
}
