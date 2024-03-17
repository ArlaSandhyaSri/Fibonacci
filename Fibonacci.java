import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number_of_terms = sc.nextInt();
        int i1=0;
        int i2=1;
        System.out.print(i1+" "+i2+" ");
        for(int i=2;i<number_of_terms;i++){
            int sum = i1+i2;
            System.out.print(sum+" ");
            i1=i2;
            i2=sum;
        }

    }
}