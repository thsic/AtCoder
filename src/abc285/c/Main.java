package abc285.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        final int SLEN = s.length();
        double sum = .0;
        for(int i=0; i<SLEN; i++){
            //文字を基数に変換
            double cardinals = alphabetToDouble(s.substring(i, i+1));

            //桁の重さ算出
            double weight = Math.pow(26, SLEN - i - 1);

            //sumに加算 (桁の重さ*基数)
            sum += weight * cardinals;
        }
        System.out.printf("%.0f\n", sum);
    }

    public static double alphabetToDouble(String str){
        double ret = -1.0;
        final String alphabets[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
        "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
        "X", "Y", "Z"};

        for(int i=0; i<alphabets.length; i++){
            if(str.equals(alphabets[i])){
                ret = i + 1.0;
            }
        }
        return ret;
    }

}