package Helper;

import java.util.ArrayList;
import java.util.List;

public class Buku {
    private String id;
    private String nama;
    private String penulis;
    private String penerbit;
    private int hargaBuku;
    private int jumlahHalaman;
    private String covered;
    private boolean isAvailable;
    private int jumlahBuku;
    private static List<Buku> listBuku = new ArrayList<>();

    public Buku(String id, String nama, String penulis, String penerbit, int hargaBuku, int jumlahHalaman,
                String covered, boolean isAvailable, int jumlahBuku) {
        this.id = id;
        this.nama = nama;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.hargaBuku = hargaBuku;
        this.jumlahHalaman = jumlahHalaman;
        this.covered = covered;
        this.isAvailable = isAvailable;
        this.jumlahBuku = jumlahBuku;
    }

    public static void addBuku(Buku buku){
        listBuku.add(buku);
    }

    public static List<Buku> updateBuku(Buku buku){
        int i = 0;
        for(Buku x : listBuku){
            if(x.id.equals(buku.id)){
                listBuku.set(i, buku);
            }
        i++;
        }
        return listBuku;
    }

    public static Buku getBukuById(String id){
        Buku buku = null;
        for(int i=0; i<listBuku.size();i++){
            if(listBuku.get(i).id.equals(id)){
                buku = listBuku.get(i);
            }
        }
        return buku;
    }

    public static void showAllBuku(){
        int i = 1;
        for(Buku buku : listBuku){
            System.out.println("\nBuku ke-" + i);
            System.out.println("ID buku: " + buku.id);
            System.out.println("Nama buku: " + buku.nama);
            System.out.println("Penulis buku: " + buku.penulis);
            System.out.println("Penerbit buku: " + buku.penerbit);
            System.out.println("Harga buku: " + buku.hargaBuku);
            System.out.println("Jumlah halaman buku: " + buku.jumlahHalaman);
            System.out.println("Cover buku: " + buku.covered);
            System.out.println("Apakah buku tersedia: " + buku.isAvailable);
            System.out.println("Jumlah buku: " + buku.jumlahBuku);
            i++;
        }
    }

    public static Buku updateBukuById(String id, int hargaBuku, int jumlahBuku){
        Buku buku = getBukuById(id);
        buku.hargaBuku = hargaBuku;
        buku.jumlahBuku = jumlahBuku;
        updateBuku(buku);
        return buku;
    }

    public static void deleteBuku(Buku buku){
        listBuku.remove(buku);
    }

    public static void deleteBukuById(String id){
        Buku buku = getBukuById(id);
        deleteBuku(buku);
    }

}
