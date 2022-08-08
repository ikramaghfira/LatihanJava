package Helper;

import java.util.ArrayList;
import java.util.List;

public class Pustakawan {
    private String id;
    private String nama;
    private String jenisKelamin;
    private String alamat;
    private String email;
    private String tempatLahir;
    private String tanggalLahir;
    private boolean isActive;
    private static List<Pustakawan> listPustakawan = new ArrayList<>();

    public Pustakawan(String id, String nama, String jenisKelamin, String alamat, String email, String tempatLahir,
                      String tanggalLahir, boolean isActive) {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.email = email;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.isActive = isActive;
    }

    public static void addPustakawan(Pustakawan pustakawan){
        //cara nge add ke list
        listPustakawan.add(pustakawan);
    }

    public static Pustakawan getPustakawanById(String id){
        //buat nampung hasil pencarian berdasarkan id
        Pustakawan pustakawan = null;
        // looping ini buat cari di indeks ke berapa ada id yang sama dengan id inputan
        for(int i = 0; i<listPustakawan.size(); i++){
            //kalau id dari indeks ke-1 sama dengan id inputan
           if(listPustakawan.get(i).id.equals(id)){
               //variabel tampungan nyimpen list dengan indeks yang ditargetkan itu
               pustakawan = listPustakawan.get(i);
           }
       }
       return pustakawan;
    }

    public static void showAllPustakawan(){
        int i = 0;
        for(Pustakawan pustakawan : listPustakawan){
            System.out.println("\nPustakawan ke-"+i);
            System.out.println("ID pustakawan: " + pustakawan.id);
            System.out.println("Nama pustakawan: " + pustakawan.nama);
            System.out.println("Jenis kelamin pustakawan: " + pustakawan.jenisKelamin);
            System.out.println("Alamat pustakawan: " + pustakawan.alamat);
            System.out.println("Email pustakawan: " + pustakawan.email);
            System.out.println("Tempat lahir pustakawan: " + pustakawan.tempatLahir);
            System.out.println("Tanggal lahir pustakawan: " + pustakawan.tanggalLahir);
            System.out.println("Keaktifan pustakawan: " + pustakawan.isActive + "\n");
            i++;
        }
    }
    public static List<Pustakawan> updatePustakawan(Pustakawan pustakawan){
        int i = 0;
        for(Pustakawan x : listPustakawan){
            if(x.id.equals(pustakawan.id)){
                listPustakawan.set(i, pustakawan);
            }
            i++;
        }
        return listPustakawan;
    }

    public static Pustakawan updatePustakawanById(String id, String alamat, String email){
        Pustakawan pustakawan = getPustakawanById(id);
        pustakawan.alamat = alamat;
        pustakawan.email = email;
        updatePustakawan(pustakawan);
        return pustakawan;
    }

    public static void deletePustakawan(Pustakawan pustakawan){
        listPustakawan.remove(pustakawan);
    }

    public static void deletePustakawanById(String id){
        Pustakawan pustakawan = getPustakawanById(id);
        deletePustakawan(pustakawan);
    }

}
