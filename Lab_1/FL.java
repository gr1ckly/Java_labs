public class FL
{
    public static void main(String[] args)
    {
        final int len_1=15, len_2=18;
        double ratio;
        long[] c = new long[len_1];
        for (int i = len_1+1; i>=2; i--){
            c[len_1-i+1]=i;
        };
        double[] x = new double[len_2];
        for (int i=0; i<len_2; i++){       
            ratio = Math.random();
            x[i] = ratio*16 - 8;
        }
        double[][] c_1 = new double[len_1][len_2];
        for (int i=0; i<len_1; i++){
            for (int j=0; j<len_2; j++){
                if (c[i]==6){
                    c_1[i][j] = Math.tan(Math.pow(Math.pow(Math.E, x[j]), Math.pow(x[j], 1.0/3.0)));
                }
                else if(c[i]==2||c[i]==5||c[i]==9||c[i]==13||c[i]==14||c[i]==15||c[i]==16){
                    c_1[i][j] = Math.pow(Math.pow(2*Math.pow(Math.E, x[j]), 2), 1.0/3.0);
                }
                else{
                    c_1[i][j] = Math.pow(((1/4.0)/((Math.pow(Math.pow(Math.E, Math.pow((x[j]/4.0), x[j])), 1.0/3.0)) - 1.0)),2);
                }
            }
        };
        for (int i=0; i<len_1; i++){
            for (int j=0; j<len_2; j++){
                System.out.printf("%10.4f", c_1[i][j]);
            }
            System.out.print("\n");
        };
    }
}