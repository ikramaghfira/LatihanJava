package Helper;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
   private String id;
   private String nama;
   private String jenisKelamin;
   private String alamat;
   private String email;
   private String tempatLahir;
   private String tanggalLahir;
   private boolean isActive;
   private String jurusan;
   private int angkatan;
   private static List<Mahasiswa> listMahasiswa = new ArrayList<>();

    public Mahasiswa(String id, String nama, String jenisKelamin, String alamat, String email, String tempatLahir,
                     String tanggalLahir, boolean isActive, String jurusan, int angkatan) {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.email = email;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.isActive = isActive;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    public static void addMahasiswa(Mahasiswa mahasiswa){
        listMahasiswa.add(mahasiswa);
   }

   public static Mahasiswa getMahasiswaById(String id){
       Mahasiswa mahasiswa = null;
       for(int i = 0; i<listMahasiswa.size(); i++){
           if(listMahasiswa.get(i).id.equals(id)){
               mahasiswa = listMahasiswa.get(i);
           }
       }
       return mahasiswa;
   }

   public static void showAllMahasiswa(){
        int i = 0;
        for(Mahasiswa mahasiswa : listMahasiswa){
            System.out.println("\nMahasiswa ke-" + i);
            System.out.println("ID mahasiswa: " + mahasiswa.id);
            System.out.println("Nama mahasiswa: " + mahasiswa.nama);
            System.out.println("Jenis kelamin mahasiswa: " + mahasiswa.jenisKelamin);
            System.out.println("Alamat mahasiswa: " + mahasiswa.alamat);
            System.out.println("Email mahasiswa: " + mahasiswa.email);
            System.out.println("Tempat lahir mahasiswa: " + mahasiswa.tempatLahir);
            System.out.println("Tanggal lahir mahasiswa: " + mahasiswa.tanggalLahir);
            System.out.println("Keaktifan mahasiswa: " + mahasiswa.isActive);
            System.out.println("Jurusan mahasiswa: " + mahasiswa.jurusan);
            System.out.println("Angkatan mahasiswa: " + mahasiswa.angkatan);
            i++;
        }
   }

   public static List<Mahasiswa> updateMahasiswa(Mahasiswa mahasiswa){
        int i = 0;
        for(Mahasiswa x : listMahasiswa){
            if(x.id.equals(mahasiswa.id)){
                listMahasiswa.set(i, mahasiswa);
            }
            i++;
        }
        return listMahasiswa;
   }

   public static Mahasiswa updateMahasiswaById(String id, String alamat, String email){
        Mahasiswa mahasiswa = getMahasiswaById(id);
        mahasiswa.alamat = alamat;
        mahasiswa.email = email;
        updateMahasiswa(mahasiswa);
        return mahasiswa;
   }

   public static void deleteMahasiswa(Mahasiswa mahasiswa){
        listMahasiswa.remove(mahasiswa);
   }

   public static void deleteMahasiswaById(String id){
        Mahasiswa mahasiswa = getMahasiswaById(id);
        deleteMahasiswa(mahasiswa);
   }


}
