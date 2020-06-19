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
public class mainbinatang {//inisialisasi class dengan nama mainbianatang
    public static void main(String[] args){//membuat method main

//membuat inisialisasi class kucing dengan variabel k, bebek dengan anjing dengan variabel a, dan bebek variabel b
//dan membuat method serta atribut didalamamnya pada class kucing,anjing dan bebek dapat digunakan
        kucing k = new kucing();
        anjing a = new anjing();
        bebek b  = new bebek();
        
        System.out.println("kucing");//menampilkan output kucing
        //membuat inisialisasi untuk memanggil method jenis,suara, dan habitat dari class kucing untuk dapat menampilkan atribut didalamnya
        k.jenis();
        k.suara();
        k.habitat();
        
        System.out.println("anjing");//menampilkan output anjing
        //membuat inisialisasi untuk memanggil method jenis,suara, dan habitat dari class anjing untuk dapat menampilkan atribut didalamnya
        a.jenis();
        a.suara();
        a.habitat();
        
        System.out.println("bebek");//menampilkan output bebek
        //membuat inisialisasi untuk memanggil method jenis,suara, dan habitat dari class bebek untuk dapat menampilkan atribut didalamnya
        b.jenis();
        b.suara();
        b.habitat();
    }
}
