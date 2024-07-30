package Bai1;

import java.util.HashMap;
import java.util.Map;

public class HashMapManagement {
    Map<String,Student> listManagement = new HashMap<>();

//    public void setListManagement(Map<String, Student> listManagement) {
//        this.listManagement = listManagement;
//    }
//
//    public Map<String, Student> getListManagement() {
//        return listManagement;
//    }

    public void addStudent(String o, Student sv){
        listManagement.put(o,sv);
    }

    public void printList(){
        System.out.println("Danh sách sinh viên:\n");
        for (String key : listManagement.keySet()) {
            System.out.println(listManagement.get(key));
        }
    }

    public void searchStudent(String o){
        if(listManagement.containsKey(o)){
            System.out.println("Thông tin sinh viên bạn muốn");
            System.out.println(listManagement.get(o));
        }else System.out.println("Sinh viên không có trong danh sách");
    }

    public void deleteStudent(String o){
        if(listManagement.containsKey(o)){
            System.out.println("Đã xóa sinh viên ra khỏi danh sách");
            listManagement.remove(o);
        }else System.out.println("Sinh viên không có trong danh sách");
    }
}
