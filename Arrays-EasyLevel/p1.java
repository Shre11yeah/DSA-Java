class shreya
{
    public static void main(String args[])
    {
    int arr[] = {1,8,7,56,90};
    int max=arr[0];
    System.out.print("The array elements are:");
    for(int i=0 ; i<arr.length ; i++)
    {
        System.out.print(arr[i]+" ");
    }
    for(int j=0 ; j<arr.length ; j++)
    {
        if(arr[j]>max)
        {
        max = arr[j];
        }
    }
    System.out.print("The largest element of given array is"+max);
    }
}
