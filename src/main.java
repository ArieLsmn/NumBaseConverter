import java.math.BigInteger;
public class main {
    public static void main(String[] args){
        BigInteger inp = new BigInteger("1000");


        int test[]=BaseConverter.convertDecToBase(inp,16);
        int testbin[]=BaseConverter.convertDecToBase(inp,2);

        for (int i=0;i<test.length;i++) {
            System.out.print(test[i]);
            System.out.print(',');
        }
        System.out.println();
        for (int i=0;i<testbin.length;i++) {
            System.out.print(testbin[i]);
            System.out.print(',');
        }

        System.out.println();
        int inp2[] = {3,14,8};
        BigInteger test2=BaseConverter.convertAsBaseToDec(inp2,16);
        System.out.println();
        System.out.println(test2);
    }
}
