import java.math.BigInteger;
public class BaseConverter {

    public static BigInteger convertAsBaseToDec(int[] arr, int base) {
        BigInteger val[] = new BigInteger[arr.length];
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(base);
        int arrRev[] = reverseArr(arr);

        for (int i = 0; i < arrRev.length; i++) {

            BigInteger x = BigInteger.valueOf(arrRev[i]);
            BigInteger re = x.multiply(b.pow(i));
            val[i] = re;
        }
        for (int l = 0; l < val.length; l++) {
            sum = sum.add(val[l]);
        }
        return sum;
    }

    public static int[] convertDecToBase(BigInteger inp, int base) {
        BigInteger val = inp;
        BigInteger test = BigInteger.valueOf(base);
        int comp1 = 0;
        int pow;
        BigInteger subtr;
        BigInteger hasil;
        int i = 0;
        int j = 0;
        int[] digits;
        for (int ii = 0; comp1 >= 0; ii++) {

            subtr = test.pow(ii);
            hasil = val.subtract(subtr);
            comp1 = hasil.compareTo(BigInteger.valueOf(0));
            i = ii;
        }

        digits = new int[i];
        --i;
        BigInteger hasil2 = val;
        BigInteger sum;
        BigInteger hasil3 = BigInteger.valueOf(0);
        for (int jj = 0; i >= jj; jj++) {

            int k = 0;
            BigInteger powered;
            powered = test.pow(i - jj);
            int comp2 = 0;

            for (int kk = 1; comp2 > -1; kk++) {
                //comp2 = 0;
                BigInteger subtr2;
                subtr2 = powered.multiply(BigInteger.valueOf(kk));
                comp2 = hasil2.subtract(subtr2).compareTo(BigInteger.valueOf(0));
                
                if(comp2!=-1) {
                    
                    sum = hasil2.subtract(subtr2);
                    hasil3 = sum;
                    k = kk;

                }
                else break;

            }
            hasil2 = hasil3;
            digits[jj] = k;
        }

        return digits;
    }
    public  static int[] reverseArr(int[] arrIn)
    {
        int lengthVal= arrIn.length ;
        int[] revArr = new int[lengthVal];
        int j = lengthVal;
        for (int i = 0; i < lengthVal; i++) {
            revArr[j - 1] = arrIn[i];
            j--;
        }
        return revArr;
    }

}
