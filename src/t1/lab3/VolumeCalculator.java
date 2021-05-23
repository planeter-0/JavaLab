package t1.lab3;

public class VolumeCalculator {
    public static void main(String[] args) {
        double[]r={23.5,17.39,4.39};
        double[]h={24.3293,23.16,31,20,11.9999};
        double Vsum1=0,Vsum2=0,Vsum;
        Vsum1=vCy(r[0],h[0])+vCy(r[1],h[2])+vCy(r[2],h[4]);
        Vsum2=vCo(r[0],r[1],h[1])+vCo(r[1],r[2],h[3]);
        Vsum=Vsum1+Vsum2;
        System.out.println("Vsum= "+Vsum);
    }
    public static double vCy(double r,double h){
        return Math.PI*r*r*h;
    }
    public static double vCo(double rb,double rt,double h){
        return Math.PI/3*(rb*rb+rb*rt+rt*rt)*h;
    }
}

