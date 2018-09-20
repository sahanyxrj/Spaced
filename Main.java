public class Main {

    public static void main(String[] args) {
	// write your code here
       float x1=5;
       float x2=4;
       float x3=-3;
       float y1=2;
       float y2=9;
       float y3=2;
       float z1=-5;
       float z2=2;
       float z3=6;

       // calculate the distance between 1 and 2
       double a = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)+Math.pow(z1-z2,2));

        // calculate the distance between 1 and 3
        double b = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2)+Math.pow(z1-z3,2));

        // calculate the distance between 2 and 3
        double c = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2)+Math.pow(z2-z3,2));

        //Calculate the max and min
        double max = Math.max(a,Math.max(b,c));
        double min = Math.min(a,Math.min(b,c));
        System.out.print("\n"+max);
        System.out.print("\n"+min);


    }
}
