import java.util.Scanner;

public class Main {

    public static void num1(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите размер массива");
        int n = sc.nextInt();
        int[] s = new int[n];
        System.out.printf("Заполняйте массив");
        int sum=0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            sum+=s[i];
        }
        System.out.println(sum);
        System.out.println(sum/n);
    }

    public static void num2(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите размер массива");
        int n = sc.nextInt();
        int[] s = new int[n];
        System.out.printf("Заполняйте массив");
        int sum=0;
        int i=0;

        int max =0;
        int min =0;
        while (i<n){
            s[i] = sc.nextInt();
            sum+=s[i];

            if(i==0){
                max =s[0];
                min =s[0];
            }
            else{
                if (max<s[i]){
                    max=s[i];
                }
                if (min>s[i]){
                    min=s[i];
                }
            }

            i++;
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
    }

    public static void num3(String[] args){
        for (int i = 0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }

    public static void num4(){
        for (double i = 1; i<=10; i++){
            System.out.print(String.format("%s ", 1/i));
        }
    }

    public static int factorial(int n){
        int fact = 1;
        if (n!=0){
            for (int i = 1; i<=n;i++){
                fact*=i;
            }
        }
        return fact;
    }
    public static void num5(){
        if ((factorial(0)==1) && (factorial(1)==1) && (factorial(3)==6)){
            System.out.println("Метод работает верно");
        }
        else{
            System.out.println("Метод работает НЕ верно");
        }
    }

    public static void main(String[] args) {
        //num1();
        //num2();
        //num3(args);
        //num4();
        num5();
    }
}