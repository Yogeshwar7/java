class diagonal {
    public static void main(String args[])
    {
    int i,j,n=3;
    int right=0,left=0;
    int Rightdiagonal=0,leftdiagonal=0,Difference=0;
    {
        int arr[][]={ {2,4,8},{16,32,64},{128,256,512} };
        for (i=0;i<3;i++)
        {
            
            for( j=0;j<3;j++)
            {
                if(i==j)
                {
                     Rightdiagonal=arr[i][j];
                     if(i+j==2)
                     {
                     leftdiagonal=arr[i][j];
                     }
                }
                else if(i+j==n-1)
                {
                     leftdiagonal=arr[i][j];
                }
            }
            Rightdiagonal= right+Rightdiagonal;
            right=Rightdiagonal;
            leftdiagonal=left+leftdiagonal;
            left=leftdiagonal;
        }  
        Difference=Rightdiagonal - leftdiagonal;
        System.out.print(Difference);
    }
    }
}