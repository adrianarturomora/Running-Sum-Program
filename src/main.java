import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter n: ");
        num = scan.nextInt();
        int vec[] = new int[num];
        System.out.println("Enter the values one by one: ");
        for(int i = 0; i < num; i+= 1)
        {
            vec[i] = scan.nextInt();
        }
        int vec2[] = new int[num];
        vec2 = array(vec);
        //print the array
        System.out.println("The running sum: ");
        for(int i = 0; i <num; i +=1)
        {
            System.out.println(vec2[i] + "\t");
        }
    }
    public static int[] array(int param[])
    {
        int nr = param.length;
        int ans[] = new int[nr];
        ans[0] = param[0];
        for(int i = 1; i < nr; i += 1)
        {
            ans[i] = ans[i - 1] + param[i];
        }
        return ans;
    }
}
