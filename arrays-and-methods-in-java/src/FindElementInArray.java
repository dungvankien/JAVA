import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students={"Sang","Truc","Huy","Nhat","Kien"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String InputName=scanner.nextLine();
        boolean flag=false;
        for(int i=0;i< students.length;i++){
            if(students[i].equals(InputName)){
                System.out.println("Position of the student in the list"+InputName+"is: "+i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Not found"+InputName+"in the list.");
        }
    }
}
