package expFolderAndFile;

import java.io.File;
import java.io.IOException;

public class Vidu {
    public static void main(String[] args) {
        File folder1 = new File("C:\\codegym\\JAVA\\String And Regex\\src\\expFolderAndFile");
        File folder2 = new File("C:\\codegym\\JAVA\\String And Regex\\src\\Folfer2");
        System.out.println("kiêm tra folder1 có tồn tại không: "+folder1.exists());
        System.out.println("Kiem tra folder2 có tồn tại không: "+folder2.exists());
        // Tạo thư mục:
        // Phương thức mkdir();>>>> tao 1 thu mục
        File d1 = new File("C:\\codegym\\JAVA\\String And Regex\\src\\expFolderAndFile\\Direcrory");
        d1.mkdir();
        // Phương thức mkdirs()>>> tạo nhiều thư mục cùng 1 lúc
        File d2 = new File("C:\\codegym\\JAVA\\String And Regex\\src\\expFolderAndFile\\Direcrory\\Directory1\\Directory2");
        d2.mkdirs();
        // tạo tập tin có phần mở rộng phía sau:
        File file1=new File("C:\\codegym\\JAVA\\String And Regex\\src\\expFolderAndFile\\tets1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            // không có quyền tạo tập tin
            //ổ cứng bị full disk
            //đường dẫn bị sai
            e.printStackTrace();
        }
    }
}
