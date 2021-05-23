package t1.lab3;

public class WTCalculator {
    public static void main(String[] args) {
        double Twc;
        double Tf=31.4,v=20;
        if(v<2||(Tf<-51&&Tf>41))
            System.out.println("Input data can not be solved");
        else{
            Twc=35.74+0.6215*Tf-35.75*Math.pow(v,0.16)+0.4275*Tf*Math.pow(v,0.16);
            System.out.println("Twc= "+(double) 5/9*(Twc-32)+"℃");
        }
    }
}
