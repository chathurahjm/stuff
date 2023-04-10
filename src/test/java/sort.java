import org.testng.annotations.Test;

public class sort {

    @Test
    public void bublesort()
    {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    @Test
    public void smalestNumber()
    {
       int [] arr = new int [] {25, 11, 7, 75, 56};
                 //Initialize max with first element of array.
                int max = arr[0];
                 //Loop through the array
               for (int i = 0; i < arr.length; i++) {
                     //Compare elements of array with max
                    if(arr[i] > max)
                           max = arr[i];
                }
              System.out.println("Largest element present in given array: " + max);

    }

    @Test
    public void fibonaki()
    {
        int n1=0, n2=1, n3;
        for (int i =1 ; i <5;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    @Test
    public void triangle()
    {
        int a = 3;
        for (int i = 1; i<10; i++)
        {
            for(int j = 1 ; j<1+i ; j++)
            {
                System.out.print(" "+a);
                a=a+4;
            }
            System.out.println(" ");
        }
    }

    @Test
    public void diamond()
    {

        //int a = 3;
        int i, j, row = 6;

        for (i=0; i<row; i++)
        {

            for (j=row-i; j>1; j--)
            {

                System.out.print(" ");
            }

            for (j=0; j<=i; j++ )
            {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    @Test
    public void tt()
    {
        int a[] = {2, 6, 1, 4, 9};

        int temp;
        for (int i = 0;i<a.length;i++)
        {
            for (int j = 1; j<a.length-1;j++)
            {
                if (a[j-1]>a[j])
                {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;

                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    @Test
    public void ttq() {
        int a[] = {2, 6, 1, 4, 9};

        int temp;
        for (int i=0;i<a.length;i++)
        {
            for (int j = 1; j<a.length-1;j++)
            {
                if(a[j-1]>a[j])
                {
                    temp = a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    @Test
    public void fi()
    {
        int n1=0,n2=1,n3;
        for (int i =1 ;i<10;i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;

        }
    }

}
