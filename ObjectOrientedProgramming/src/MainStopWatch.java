public class MainStopWatch {
    public static void main(String[] args) {
        long[] myArray=new long[100000];
        for(int i=0;i<100000;i++){
            myArray[i]= (long) (Math.random()*1000);
        }
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        selectionSort(myArray);
        stopWatch.stop();
        System.out.println("Run time Selection Sort for 100 000 element: "+stopWatch.getElapsedTime()+" milisecond");
    }
    public static void selectionSort(long[] array){
        for(int i=0;i< array.length-1;i++){
            long min=array[i];
            int index=i;
            for(int j=i+1;j< array.length;j++){
                if(min>array[j]){
                    min=array[j];
                    index=j;
                }
            }
            array[index]=array[i];
            array[i]=min;
        }
    }
}
