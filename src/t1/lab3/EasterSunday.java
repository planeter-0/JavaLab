package t1.lab3;

public class EasterSunday {
    public static void main(String[] args) {
        int year=2020;
        int q1,r1,q2,r2,q3,r3,q4,r5,q6,r6,q7,r8,q9,r10;
        q1=year/19;
        r1=year%19;

        q2=year/100;
        r2=year%100;

        q3= q2/4;
        r3=q2%4;

        q4=(8*q2+13)/25;

        r5=(19*r1+q2-q3-q4+15)%30;

        q6=r2/4;
        r6=r2%4;

        q7=(r1+14*r5)/319;

        r8=(2*r3+2*q6-r6-r5+q7+32)%7;

        q9=(r5-q7+r8+90)/25;

        r10=(r5-q7+r8+q9+19)%32;
        System.out.print("Month: "+q9+"\nDay: "+r10);
    }
}
