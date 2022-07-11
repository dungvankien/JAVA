public class CombineArray {
    public static void main(String[] args) {
        int[] array_1={1,3,4,5,6,7};
        int[] array_2={2,4,5};
        int[] array_3;
        array_3=new int[(array_1.length+array_2.length)];
        for (int i=0;i< array_1.length;i++){
            array_3[i]=array_1[i];
        }
        int size= array_1.length;
        for(int i=0;i< array_2.length;i++){
            array_3[size]=array_2[i];
            size++;
        }
        System.out.println("\nArray 01");
        for(int item:array_1){
            System.out.print(item+"\t");
        }
        System.out.println("\nArray 02");
        for(int item:array_2){
            System.out.print(item+"\t");
        }
        System.out.println("\nCombine Array");
        for(int item:array_3){
            System.out.print(item+"\t");
        }
    }
}
