package ex1;

import java.math.BigInteger;

public class MyMath {
    public MyMath() {
    }

    public static double cos(double a){
        double sum=1;
        double temp=1;
        for(int i=1;i<100;i++){
            temp*=-Math.pow(a,2)/(i*2)/(i*2-1);
            sum+=temp;
        }
        return sum;
    }
    public static double exp(double a){
        double sum=1;
        double temp=1;
        for(int i=1;i<100;i++){
            temp*=a/i;
            sum+=temp;
        }
        return sum;
    }
    public static String toDecimal(String number, int inRadix){
        if (inRadix< 0 || inRadix < 2 || inRadix> 16 ) {
            return "";
        }
        BigInteger sum= new BigInteger("0");
        number=number.toUpperCase();
        char[] list_char= number.toCharArray();
        int size=list_char.length;
        for (char c: list_char
             ) {
            size--;
            if (Character.isAlphabetic(c)){
                BigInteger temp= new BigInteger(String.valueOf(inRadix));
                temp=temp.pow(size);
                temp=temp.multiply(BigInteger.valueOf((int) c-55));
                sum=sum.add(temp);
            }else {
                BigInteger temp= new BigInteger(String.valueOf(inRadix));
                temp=temp.pow(size);
                int temp1=Integer.parseInt(String.valueOf(c));
                temp=temp.multiply(BigInteger.valueOf(temp1));
                sum=sum.add(temp);
            }
        }
        String str= String.valueOf(sum);
        return sum.toString();
    }
    public static String decimalTo(String number, int outRadix){
        if (outRadix< 0 || outRadix < 2 || outRadix> 16 ) {
            return "";
        }
        char char_55=55;
        StringBuilder sb = new StringBuilder();
        int m;
        BigInteger remainder = new BigInteger(number);

        while (remainder.compareTo(BigInteger.valueOf(0))>0) {
            BigInteger temp=remainder.divide(BigInteger.valueOf(outRadix));
            m = Integer.parseInt(remainder.subtract(temp.multiply(BigInteger.valueOf(outRadix))).toString());
            if (outRadix > 10) {

                if (m >= 10) {
                    sb.append((char) ( char_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(m);
            }
            remainder = temp;
        }
        return sb.reverse().toString();
    }

    public static String toRadix(String number, int inRadix, int outRadix ){
        return decimalTo(toDecimal(number,inRadix),outRadix);
    }

    public static void main(String[] args) {
//        System.out.println(decimalTo("15",2));
//        System.out.println(toDecimal("1111",2));
//        System.out.println(toDecimal("123456789123456789",13));
        System.out.println(Math.pow(Math.E,4)*cos(9));
        System.out.println(toRadix("123456789123456789",13,8));
    }

}
