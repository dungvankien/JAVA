import java.util.Scanner;

public class FindMinValueArray {
    public static void main(String[] args) {
        int size;
        int[] myArray;
        int min,index=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array size:  ");
        size= input.nextInt();
        myArray=new int[size];
        System.out.println("Enter the value into the array:");
        for(int i=0;i< myArray.length;i++){
            System.out.print("Enter element "+i+": ");
            myArray[i]=input.nextInt();
        }
        System.out.println("Array");
        for(int item:myArray){
            System.out.print(item+"\t");
        }
        min=myArray[0];
        for(int i =1;i<myArray.length;i++){
            if(min>myArray[i]){
                min=myArray[i];
                index=i;
            }
        }
        System.out.println("\nSmallest element in array: "+min+" index: "+index);
    }
}
