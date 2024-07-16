import java.util.Scanner;
class Deni{
    public static void main(String args[])
    {
        int a[]=new int[10];
        Scanner stdin=new Scanner(System.in);
        System.out.println("Enter 10 nos ");
        for(int i=0;i<a.length;i++)
            a[i]=stdin.nextInt();
        int s=0;
        for(int i=0;i<a.length;i++)
            s=s+a[i];
        System.out.println("Sum is "+s);
    }
}
