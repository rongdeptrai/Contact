package com.hoanglong_322.contact;

public class Contact {
    int img_avata;
    String ten;
    String sdt;

    public Contact(int img_avata, String ten, String sdt) {
        this.img_avata = img_avata;
        this.ten = ten;
        this.sdt = sdt;
    }

    public int getImg_avata() {
        return img_avata;
    }

    public void setImg_avata(int img_avata) {
        this.img_avata = img_avata;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
