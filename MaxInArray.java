public class MaxInArray
{
    public static void main(String[] args)
    {
        int[] num={3,7,2,9,4};
        int maxi=num[0];
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>maxi)
            {
                maxi=num[i];
            }
        }
        System.out.println(maxi);
    }
}