package Bai1;

import java.util.ArrayList;
import java.util.Iterator;

public class Danhsach {
    private ArrayList<Bai1.Student> danhSach;

    public Danhsach() {
        this.danhSach = new ArrayList<Bai1.Student>();
    }

    public Danhsach(ArrayList<Bai1.Student> danhSach) {
        this.danhSach = danhSach;
    }

    public void addStudent(Bai1.Student sv){
        this.danhSach.add(sv);
    }

    public void showList(){
        for(Bai1.Student sv : danhSach) {
            System.out.println(sv);
        }
    }
    public void searchSv(Bai1.Student o){
        int check=0;
        for(Bai1.Student sv: danhSach){
            if(sv.compareTo(o)==0){
                System.out.println(sv);
                check++;
            }
        }
        if (check==0) System.out.println("Không tồn tại sinh viên có mã sinh viên cần tìm");
    }
    public void deleteSv(Bai1.Student sv){
        int check=0;
        Iterator<Bai1.Student> iterator = danhSach.iterator();
        while (iterator.hasNext()) {
            Bai1.Student o = iterator.next();
            if(sv.compareTo(o)==0){
                iterator.remove();
                check++;
            }
        }
        if (check==0) System.out.println("Không tồn tại sinh viên có mã sinh viên cần xóa");
        else System.out.println("Đã xóa sinh viên ra khỏi danh sách");

    }
}
