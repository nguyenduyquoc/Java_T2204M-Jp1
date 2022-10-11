package session1;

public class Tamgiac {
    int canh_a;
    int canh_b;
    int canh_c;

    public int getCanh_a() {
        return canh_a;
    }

    public void setCanh_a(int canh_a) {
        this.canh_a = canh_a;
    }

    public int getCanh_b() {
        return canh_b;
    }

    public void setCanh_b(int canh_b) {
        this.canh_b = canh_b;
    }

    public int getCanh_c() {
        return canh_c;
    }

    public void setCanh_c(int canh_c) {
        this.canh_c = canh_c;
    }

    public int TinhChuVi(){
        return canh_a + canh_b + canh_c;
    }
    public double TinhDienTich(){
        double p = (double)TinhChuVi()/2;
        return Math.sqrt(p*(p-canh_c)* (p-canh_a)*(p-canh_c));
    }
}
