import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rev=0;
        int n=sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
    }
}