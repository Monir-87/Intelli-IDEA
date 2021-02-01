package collectionsDemos;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        //int a[]=new int[5]; //declare array with size 5

        //adding values inside the array
       /* a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;*/
       int a[]={100,200,300,400,500}; //declare an array without specifying size
        System.out.println("Length of an array is: " + a.length); //print length/size of an array
        System.out.println(a[2]); //read specific value

        for (int i=0;i<=a.length-1;i++) //i<a.length
        {
            System.out.println(a[i]);
        }
        //read values using enhanced for loop
        for (int i:a)
        {
            System.out.println("using enhanced for loop: " +i);
        }
    }
}
