
public class Main {
    static double calcElement(short z, float x){
        if (z == 15){
            return Math.cos(Math.cos(Math.sin(x)));
        }
        if (z == 7 || z == 11 || z == 17 || z == 21 || z == 23){
            return Math.asin(Math.exp(Math.cbrt(-Math.abs(x))));
        }
        return Math.cos((1 - Math.cos(Math.tan(x))) / (Math.sin(Math.atan((x - 0.5) / 7))));
    }

    static void outPutResponseArray(double[][] z1) {
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
            double doubleRandom = -4.0 + Math.random() * (3.0 - -4.0);
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
