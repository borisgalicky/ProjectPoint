package sk.akademiasovy.point;

import java.util.Random;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point{
    private int x;
    private int y;

    public Point(int x, int y){//konštruktor, ktorý vkladá do premenných x,y hodnoty, ktoré prijíma
        this.x=x;
        this.y=y;
    }

    public Point(){
        this(0,0);//zavolá sa predošlý konšktruktor a odošlú sa mu hodnoty 0,0
    }

    public int getX(){//vygenerovaný getter ktorý vracia hodnotu "x"
        return x;
    }

    public int getY(){
        return y;
    }

    public int getQuadrant(){
        if((x>0)&&(y>0)){
            return 1;
        }
        else if((x<0)&&(y>0)){
            return 2;
        }
        else if((x<0)&&(y<0)){
            return 3;
        }
        else if((x>0)&&(y<0)){
            return 4;
        }
        else{
            return 0;
        }
    }

    public void generateRandomCoordinates(){//generuje náhodnjé súradnice
        Random random = new Random();
        this.x=random.nextInt(41)-20;
        this.y=random.nextInt(42)-20;
    }

    public double getDistance(){//zistí vzdialenosť bodu od stredu súradnocovej sústavy
        return sqrt((x*x)+(y*y));
    }

    public void printInfo(){//vypíše zatiaľ zistené info o bode
        System.out.println("Point P1 info:\nCoordinates: ["+x+","+y+"]\nQuadrant: "+getQuadrant()+"\nDistance from center: "+getDistance()+" cm");
    }

    public double getDistanceFromOtherPoint(Point other){
        return sqrt(pow(x-other.getX(),2)+pow(y-other.getY(),2));
    }
}



