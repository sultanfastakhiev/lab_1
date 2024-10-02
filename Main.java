import static java.lang.Math.*;

public class Main {
    public static double calcElement(short z, float x){
        if (z == 15){
            return cos(cos(sin(x)));
        }
        if (z == 7 || z == 11 || z == 17 || z == 21 || z == 23){
            return asin(exp(-cbrt(-abs(x))));
        }
        return cos((1 - cos(tan(x))) / (sin(atan((x - 0.5) / 7))));
    }

    public static void outPutResponseArray(double[][] z1) {
        for (var i = 0; i < 11; i++) {
            for (var j = 0; j < 12; j++){
                System.out.print("|");
                System.out.printf("%.5f", z1[i][j]);
                if (j == 11) {
                    System.out.println("");
                }
            }
        }

    }

    public static void main(String[] args){
        short[] z = new short[11];
        short value = 23;
        for (var i = 0; i < z.length; i++) {
            z[i] = value;
            value -= 2;
        }

        float[] x = new float[12];
        for (var i = 0; i < x.length; i++) {
            double doubleRandom = -4.0f + random() * (3.0f - -4.0f);
            x[i] = (float) doubleRandom;
        }

        double[][] z1 = new double[11][12];
        for (var i = 0; i < z.length; i++){
            for (var j = 0; j < x.length; j++) {
            z1[i][j] = calcElement(z[i], x[j]);
        }
        }
        outPutResponseArray(z1);
}
}
