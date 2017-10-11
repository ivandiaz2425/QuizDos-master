package com.jonmid.quizdos.Models;

/**
 * Created by IVANCHO on 10/10/2017.
 */

public class UserModelDiazIvan {

    public String name;
    public String username;
    public String email;
    public String phone;
    public String address;
    public String company;
    private  String[] UserArrayDiazIvan;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUserArrayDiazIvan() {
        UserArrayDiazIvan = new String[10];
        UserArrayDiazIvan[0]="https://i.pinimg.com/originals/bb/7e/d4/bb7ed4855b6d0df8305e10247b726cbd.jpg";
        UserArrayDiazIvan[1]="https://k38.kn3.net/taringa/2/4/3/0/6/6/13/soyluuchoox/A1D.jpg?1843";
        UserArrayDiazIvan[2]="https://fossbytes.com/wp-content/uploads/2017/01/arch-linux.png";
        UserArrayDiazIvan[3]="https://i0.wp.com/opensourceforu.com/wp-content/uploads/2016/12/Ubuntu.jpg?resize=750%2C460";
        UserArrayDiazIvan[4]="https://webalia.com/uploads/contenidos_usrs/391576_electro_house_dance_20100913113111.jpg";
        UserArrayDiazIvan[5]="http://static2.refinery29.com/bin/entry/dfb/x/424377/electro.jpg";
        UserArrayDiazIvan[6]="https://pbs.twimg.com/media/CKSwB1nWcAASMLa.jpg:large";
        UserArrayDiazIvan[7]="http://www.noroeste.com.mx/files/tinymce/CuidarComida_(8)2.JPG";
        UserArrayDiazIvan[8]="https://professor-falken.com/wp-content/uploads/2016/11/Como-formatear-un-pendrive-o-memoria-USB-desde-el-Terminal-de-Linux-professor-falken.com_.jpg";
        UserArrayDiazIvan[9]="http://www.bluent.co.in/blog/images/002.jpg";
        int numero = (int) (Math.random() * 9);

        return UserArrayDiazIvan [numero];
    }
}
