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
        UserArrayDiazIvan[0]="https://ayudawp.com/wp-content/uploads/2014/02/usuario-registrado.jpg";
        UserArrayDiazIvan[1]="https://image.freepik.com/vector-gratis/usuarios-del-sistema-de-tango_17-329084610.jpg";
        UserArrayDiazIvan[2]="https://luud94.files.wordpress.com/2013/02/usuarios.png";
        UserArrayDiazIvan[3]="https://i0.wp.com/helpmybusinesspos.info/wp-content/uploads/2015/02/Usuario-permisos_mybusinesspos-300x200.png?resize=350%2C200";
        UserArrayDiazIvan[4]="http://3.bp.blogspot.com/-ti-MI9Zl3nM/VWcvaDixo3I/AAAAAAAAAJQ/nI7svyjT5vg/s1600/usuario.png";
        UserArrayDiazIvan[5]="http://www.iaipanama.org/images/img-demo/usuario-registrados.png";
        UserArrayDiazIvan[6]="http://www.doctanet.com/images/img_elearning.jpg";
        UserArrayDiazIvan[7]="https://magazine.joomla.org/media/k2/items/cache/97ff5b5c23c82287559552b36b16e270_XL.jpg";
        UserArrayDiazIvan[8]="http://www.prograweb.com.mx/tallerBD/images/0301Usuario.jpg";
        UserArrayDiazIvan[9]="http://www.managementjournal.net/images/stories/perfilesdeusuarios.jpg";
        int numero = (int) (Math.random() * 9);

        return UserArrayDiazIvan [numero];
    }
}
