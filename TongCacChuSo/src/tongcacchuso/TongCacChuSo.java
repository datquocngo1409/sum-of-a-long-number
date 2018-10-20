package tongcacchuso;

import java.util.Scanner;

public class TongCacChuSo {

    static int size(long n){
        int i=10;
        int count=0;
        while(n>=1){
            n=(int)n/i;
            count++;
        }
        return count;
    }
    
    static int Sum(long n){
        int sum=0;
        int size = size(n);
        for(int i=0;i<size;i++){
            int x =(int) (n%10);
            sum+=x;
            n=(int)n/10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        long n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextLong();
        System.out.println("Sum of N is: "+Sum(n));
    }
    
}
