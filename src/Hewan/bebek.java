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
//Inisialisasi class bebek, implements berfungsi agar class Binatang1 
//dapat diimplementasikan ke class bebek
public class bebek implements Binatang1{
    
   
    @Override//menggunakan method yang ada di class Binatang1 
    public void jenis(){//memanggil method jenis dari class Binatang1
       System.out.println("jenis bebek : bebek angsa");//menampilkan variabel jenis bebek yang berada di binatang1
    }
    
    
    @Override
   public void suara(){//memanggil method suara dari class Binatang1
        System.out.println("suara bebek : wekwekwek");//menampilkan variabel suara bebek yang berada di binatang1
    }
    
    
    @Override
    public void habitat(){//memanggil method habitat dari class Binatang1
        System.out.println("habitat bebek : darat laut udara");//menampilkan variabel habitat bebek yang berada di binatang1
    }
}
