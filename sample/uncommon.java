import java.util.*;
public class uncommon
{
    static int n=26;

    static void uncommon(String s1,String s2)
    {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=0;
        }

        int l1=s1.length();
        int l2=s2.length();

        for(int i=0;i<l1;i++)
        {
            arr[s1.charAt(i)-'a']=1;
        }

        for(int i=0;i<l2;i++)
        {
            if(arr[s2.charAt(i)-'a']==1 || arr[s2.charAt(i)-'a']==-1)
            {
                arr[s2.charAt(i)-'a']=-1 ;
            }
            else
            {
                arr[s2.charAt(i)-'a']=2 ;
            }
        }

        for (int i=0; i<n;i++) 
        { 
            if (arr[i]==1 || arr[i]==2)  
            { 
                System.out.print((char) (i+'a')+""); 
            } 
        } 
    } 
    public static void main(String[] args)  
    {   Scanner sc=new Scanner(System.in);      
        String s1=sc.nextLine();  
        String s2=sc.nextLine(); 
        uncommon(s1,s2); 
    } 
} 
    