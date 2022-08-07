package demergingQueue;

import java.util.*;

public class ListEmployment {
    Employment employment=new Employment();
    private ArrayList<Employment> danhSach;

    public ListEmployment() {
        this.danhSach = new ArrayList<Employment>();
    }

    public ListEmployment(ArrayList<Employment> danhSach) {
        this.danhSach = danhSach;
    }

    public void themNhanVien(Employment nhanVien) {
        this.danhSach.add(nhanVien);
    }
    public void sapXepNhanVienTheoNgayThanhNam(){
        Collections.sort(danhSach, new Comparator<Employment>() {
            @Override
            public int compare(Employment employment1, Employment employment2) {
                if(employment1.getNgayThangNamSinh().compareTo(employment2.getNgayThangNamSinh())>0){
                    return 1;
                } else if(employment1.getNgayThangNamSinh().compareTo(employment2.getNgayThangNamSinh())<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
    public Employment newList(){
        Queue<Employment> danhSachNam=new LinkedList<>();
        Queue<Employment>danhSachNu=new LinkedList<>();
        Queue<Employment>tongDanhSach=new LinkedList<>();
        for (Employment nhanVien:danhSach) {
           if(nhanVien.getGioiTinh()=="Nam"){
               danhSachNam.add(nhanVien);
           } else {
               danhSachNu.add(nhanVien);
           }
        }
        while (danhSachNu!=null){
            tongDanhSach.add(danhSachNu.poll());
        }
        while (danhSachNam!=null){
            tongDanhSach.add(danhSachNam.poll());
        }
        return (Employment) tongDanhSach;
    }
}
