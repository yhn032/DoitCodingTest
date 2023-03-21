package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bak_11720 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String su = br.readLine();

        String temp[] = su.split("");

        int sum = 0;
        for(String s : temp){
            if(s.equals("0")) continue;
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }


}
