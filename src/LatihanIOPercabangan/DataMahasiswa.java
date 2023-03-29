package LatihanIOPercabangan;

//step 1 import lib
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.StringReader;

public class DataMahasiswa {
    public static void main(String[] args){
        //step 3 deklaras class bufferedreader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //step 4 deklarasi variabel
        String nim,nama, prodi;
        int semester, SKSambil;

        //step 2 eror handling

        //try catch
        try{
            //step 5 pengerjaa logika program
            System.out.println("---Data Mahasiswa---");//header
            //input

            //jika string menggunkan "br.readLine();"
            //jika integer menggunkan "Integer.parseInt(br.readLine());"


            System.out.print("NIM: ");
            nim = br.readLine();
            System.out.print("Nama: ");
            nama = br.readLine();
            System.out.print("Prodi: ");
            prodi = br.readLine();
            System.out.print("Semester: ");
            semester = Integer.parseInt(br.readLine());
            System.out.print("Jumlah SKS yang diambil: ");
            SKSambil = Integer.parseInt(br.readLine());


            //output
            System.out.println("--- Data yang sudah diambil ---");
            System.out.println("Nim Mahasiswa \t\t\t: " +nim);
            System.out.println("Nama Mahasiswa \t\t\t: " +nama);
            System.out.println("Prodi Mahasiswa \t\t: " +prodi);
            System.out.println("Semester Mahasiswa \t\t: " +semester);
            System.out.println("Jumlah SKS Mahasiswa \t: " +SKSambil);

        }catch (Exception exp){
           //kondisi ketika ada error, apa yang akan di tampilkan
            System.out.println("Isikan menggunkan angka");
        }
    }
}
