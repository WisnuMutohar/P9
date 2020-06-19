/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author E3N Computer
 */
//Inisialisasi class anjing, extends berfungsi agar class Binatang 
//dapat mewariskan property atau method ke class anjing
public class anjing extends Binatang {
    
    @Override//menggunakan method yang ada di class Binatang 
    void jenis(){//memanggil method jenis dari class Binatang
       String jenis = "jenis anjing : cihuahua";//membuat variabel jenis anjing 'cihuahua' dengan nilai string
       System.out.println(jenis);//berfungsi menampilkan variabel jenis
    }
    
    @Override
    void suara(){//memanggil method suara dari class Binatang
        String suara = "suara anjing : gukguk";//membuat variabel suara anjing 'gukguk' dengan nilai string
        System.out.println(suara);//berfungsi menampilkan variabel suara
    }
    
    @Override
    void habitat(){//memanggil method habitat dari class Binatang
        String habitat = "habitat anjing : kosan farhan";//membuat variabel habitat anjing 'gukguk' dengan nilai string
        System.out.println(habitat);//berfungsi menampilkan variabel habitat
    }
}
