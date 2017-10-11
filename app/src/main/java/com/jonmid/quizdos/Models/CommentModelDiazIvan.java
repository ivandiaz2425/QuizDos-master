package com.jonmid.quizdos.Models;

/**
 * Created by IVANCHO on 10/10/2017.
 */

public class CommentModelDiazIvan {

    public String email;
    public String name;
    public String body;
    private  String[] CommentArrayDiazIvan;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String CommentArrayDiazIvan() {
        CommentArrayDiazIvan = new String[10];
        CommentArrayDiazIvan[0]="https://i.pinimg.com/originals/bb/7e/d4/bb7ed4855b6d0df8305e10247b726cbd.jpg";
        CommentArrayDiazIvan[1]="https://k38.kn3.net/taringa/2/4/3/0/6/6/13/soyluuchoox/A1D.jpg?1843";
        CommentArrayDiazIvan[2]="https://fossbytes.com/wp-content/uploads/2017/01/arch-linux.png";
        CommentArrayDiazIvan[3]="https://i0.wp.com/opensourceforu.com/wp-content/uploads/2016/12/Ubuntu.jpg?resize=750%2C460";
        CommentArrayDiazIvan[4]="https://webalia.com/uploads/contenidos_usrs/391576_electro_house_dance_20100913113111.jpg";
        CommentArrayDiazIvan[5]="http://static2.refinery29.com/bin/entry/dfb/x/424377/electro.jpg";
        CommentArrayDiazIvan[6]="https://pbs.twimg.com/media/CKSwB1nWcAASMLa.jpg:large";
        CommentArrayDiazIvan[7]="http://www.noroeste.com.mx/files/tinymce/CuidarComida_(8)2.JPG";
        CommentArrayDiazIvan[8]="https://professor-falken.com/wp-content/uploads/2016/11/Como-formatear-un-pendrive-o-memoria-USB-desde-el-Terminal-de-Linux-professor-falken.com_.jpg";
        CommentArrayDiazIvan[9]="http://www.bluent.co.in/blog/images/002.jpg";
        int numero = (int) (Math.random() * 9);

        return CommentArrayDiazIvan [numero];
    }
}
