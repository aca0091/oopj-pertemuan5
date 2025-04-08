/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg5;

/**
 *
 * Ni Kadek Candra Dewi 
 * 2301010091
 * tgl : 8 april 2025
 */
public class Pertemuan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jajan pancong = new jajan();
        //pancong.bentuk = "Kotak";
        pancong.setBentuk ("Kotak");
        pancong.rasa = "Tiramisu cruncy";
        pancong.harga = 12000;
        pancong.warna = "Coklat";
        
        //System.out.println("Bentuknya : "+pancong.bentuk);
        //System.out.println("Rasanya : "+pancong.rasa);
        
        System.out.println("Bentuknya : "+pancong.getBentuk());
    }
    
}