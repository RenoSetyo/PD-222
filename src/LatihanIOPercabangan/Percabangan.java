package LatihanIOPercabangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));{


        //if else
        //cek syarat pembuatan KTP
//        int usia=0;
//        System.out.print("Masukan usia anda: ");
//        usia = Integer.parseInt(br.readLine());
//        if (usia >= 17)
//            System.out.println("Sudah memenuhi syarat");
//        else {
//            System.out.println("Belum memenuhi syarat");
//        }

//        String nim;
//        int nilaiUAS;
//            System.out.print("Masukan nim anda: ");
//            nim = br.readLine();
//            System.out.print("Masukan nilai UAS anda: ");
//            nilaiUAS = Integer.parseInt(br.readLine());
//
//            //jika nilai 80,70,65 = lulus, di bawah 65 tidak lullus
//            if (nim.equalsIgnoreCase("22410100043")
//                && nilaiUAS == 80) {
//                System.out.println("LULUS");
//
//            }else if (nim.equalsIgnoreCase("22410100043")
//                && nilaiUAS == 70) {
//                System.out.println("LULUS");
//
//            }else if (nim.equalsIgnoreCase("22410100043")
//                && nilaiUAS ==65) {
//                System.out.println("TIDAK LULUS");
//
//            }else {
//                System.out.println("NILAI TIDAK DITEMUKAN");





            }

            //nested if : if bertingkat
            //cek menu yang dipilih (makanan/minuman)
            //makanan = snack, nasi bungkus
            //minuman = kopi, teh, air mineral

            String menu, jenis;
            System.out.println("Masukan menu (makanan/minuman) : ");
            menu = br.readLine();
            System.out.println("Masukan jenis menu \nMakanan snack, Nasi bungkus\n" + "Minuman: kopi, teh, air mineral. \npilih :");
            jenis = br.readLine();

            if (menu.equalsIgnoreCase("makanan")){
                if (jenis.equalsIgnoreCase("snack")) {
                    System.out.println("harga 2000");
                }else {
                    System.out.println("harga 5000");
                }
            }else if(menu.equalsIgnoreCase("minuman")){
                if (jenis.equalsIgnoreCase("kopi")) {
                    System.out.println("harga 3000");
                }else {
                    if (jenis.equalsIgnoreCase("teh")) {
                        System.out.println("harga 2500");
                    }else {
                        if (jenis.equalsIgnoreCase("air mineral")){
                            System.out.println("harga 3000");
                        }
                }
            }

        }

    }
}
