package Bai1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListManagement {
    private ArrayList<Bai1.Student> listManagement;

    public ListManagement() {
        this.listManagement = new ArrayList<Bai1.Student>();
    }

    public ListManagement(ArrayList<Bai1.Student> listManagement) {
        this.listManagement = listManagement;
    }

    public void addStudent(Bai1.Student sv){
        this.listManagement.add(sv);
    }

    public void showList(){
        for(Bai1.Student sv : listManagement) {
            System.out.println(sv);
        }
    }
    public void searchSv(String o){
        int check=0;
        for(Bai1.Student sv: listManagement){
            if(o.equalsIgnoreCase(sv.getIdSv())){
                System.out.println(sv);
                sv.paySchoolFees();
                check++;
                break;
            }
        }
        if (check==0) System.out.println("Không tồn tại sinh viên có mã sinh viên cần tìm");
    }
    public void deleteSv(String o){
        int check=0;
        Iterator<Bai1.Student> iterator = listManagement.iterator();
        while (iterator.hasNext()) {
            Bai1.Student sv = iterator.next();
            if(o.equalsIgnoreCase(sv.getIdSv())){
                iterator.remove();
                check++;
                break;
            }
        }
        if (check==0) System.out.println("Không tồn tại sinh viên có mã sinh viên cần xóa");
        else System.out.println("Đã xóa sinh viên ra khỏi danh sách");

    }
}
