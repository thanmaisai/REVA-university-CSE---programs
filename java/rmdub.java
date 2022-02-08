public class rmdub
{
    public static int removeDublicatesElements( int arr[],int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        int temp[]= new int[n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j+1]=arr[i];
            }
        }
        temp[j+1] = arr[n-1];
        for(int i=0;i<j;i++)
        {
            arr[i]=temp[i];
        }
        return j;
    }
    public static void main(String args[])
    {
        int arr[]={10,20,20,30,30,40,50,50};
        int length=arr.length;
        length = removeDublicatesElements(arr,length);
        for(int i=0;i<length;i=i+2)
        {
            System.out.println(arr[i]);
        }   
    }  
}