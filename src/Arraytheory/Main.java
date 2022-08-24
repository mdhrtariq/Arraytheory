package Arraytheory;
public class Main {
    public static void main(String[] args)
    {
         int a[]={1,2,3,4,5,6,7,8,9,10};
         int b[]={2,4,6,8,10,};
         int c[]={1,3,5,7,9,11};
         int e[]={1,4,9,16,25,36,49};

         int d[][]={a,b,c,e};
        for (int i =0;i<d.length;i++)
        {
            for (int j=0;j<d[i].length;j++)
            {
                System.out.print(" " + d[i][j]);
        }

    {
        System.out.println();
    }
}
}
}
