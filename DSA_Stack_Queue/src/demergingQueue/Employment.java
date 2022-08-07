package demergingQueue;

public class Employment {
    private String hoTen;
    private String gioiTinh;
    private String ngayThangNamSinh;

    public Employment() {
    }

    public Employment(String hoTen, String gioiTinh, String ngayThangNamSinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }
}
