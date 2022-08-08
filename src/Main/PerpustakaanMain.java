package Main;

import Helper.Buku;
import Helper.Mahasiswa;
import Helper.Pustakawan;

import java.util.Scanner;

public class PerpustakaanMain {
    public static void main(String[] args) {
        boolean isTrue = true;
        int pilihan = 0;
        int fungsi = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Selamat Datang di Perpustakaan\n" +
                            "Silakan Pilih Salah Satu Menu Berikut:");
        System.out.println( "1. Buku\n" +
                            "2. Mahasiswa\n" +
                            "3. Pustakawan\n" +
                            "4. Exit");
        System.out.println("Masukkan pilihan: ");
        pilihan = scanner.nextInt();

        while(isTrue){
            switch (pilihan){
                case 1:
                    System.out.println("Berikut adalah fungsi yang terdapat dalam menu \"Buku\"");
                    System.out.println( "1. Menambahkan Buku\n"+
                                        "2. Menampilkan Daftar Buku\n" +
                                        "3. Memperbaharui Buku dengan ID\n" +
                                        "4. Menghapus Buku dengan ID\n" +
                                        "5. Meminjam buku\n" +
                                        "6. Mengembalikan buku\n" +
                                        "7. Membeli buku\n" +
                                        "8. Keluar");
                    System.out.println("Masukkan fungsi yang dipilih: ");
                    fungsi = scanner.nextInt();
                    switch (fungsi){
                        case 1:
                            System.out.println("Ini adalah fungsi untuk menambahkan buku");
                            System.out.println("Input ID buku: ");
                            String idBuku = scanner.next();
                            System.out.println("Input nama buku: ");
                            String namaBuku = scanner.next();
                            System.out.println("Input penulis buku: ");
                            String penulisBuku = scanner.next();
                            System.out.println("Input penerbit buku: ");
                            String penerbitBuku = scanner.next();
                            System.out.println("Input harga buku: ");
                            int hargaBuku = scanner.nextInt();
                            System.out.println("Input jumlah halaman: ");
                            int jumlahHalaman = scanner.nextInt();
                            System.out.println("Input jumlah buku: ");
                            int jumlahBuku = scanner.nextInt();
                            System.out.println("Input cover: ");
                            String coveredBuku = scanner.next();
                            boolean isAvailable = true;
                            Buku buku = new Buku(idBuku, namaBuku, penulisBuku, penerbitBuku, hargaBuku, jumlahHalaman
                                                , coveredBuku, isAvailable, jumlahBuku);
                            Buku.addBuku(buku);
                            System.out.println("Buku berhasil ditambahkan ke sistem");
                            break;
                        case 2:
                            System.out.println("Menampilkan semua buku di sistem");
                            Buku.showAllBuku();
                            break;
                        case 3:
                            System.out.println("Ini adalah fungsi untuk memperbarui informasi buku");
                            System.out.println("Masukkan ID buku: ");
                            idBuku = scanner.next();
                            System.out.println("Masukkan harga buku: ");
                            hargaBuku = scanner.nextInt();
                            System.out.println("Masukkan jumlah buku: ");
                            jumlahBuku = scanner.nextInt();
                            Buku.updateBukuById(idBuku, hargaBuku, jumlahBuku);
                            System.out.println("Buku berhasil diperbaharui");
                            break;
                        case 4:
                            System.out.println("Ini adalah fungsi untuk menghapus buku");
                            System.out.println("Masukkan ID buku: ");
                            idBuku = scanner.next();
                            Buku.deleteBukuById(idBuku);
                            System.out.println("Buku berhasil dihapus dari sistem");
                            break;
                        case 8:
                            isTrue = false;
                            break;
                    }
                case 2:
                    System.out.println("Berikut adalah fungsi yang terdapat dalam menu \"Mahasiswa\"");
                    System.out.println( "1. Menambahkan Mahasiswa\n" +
                                        "2. Menampilkan Daftar Mahasiswa\n" +
                                        "3. Memperbaharui Informasi Mahasiswa\n" +
                                        "4. Menghapus Mahasiswa\n" +
                                        "5. Keluar");
                    System.out.println("Masukkan fungsi yang dipilih: ");
                    fungsi = scanner.nextInt();
                    switch (fungsi){
                        case 1:
                            System.out.println("Ini adalah fungsi untuk menambahkan mahasiswa");
                            System.out.println("Input ID mahasiswa: ");
                            String idMahasiswa = scanner.next();
                            System.out.println("Input nama mahasiswa: ");
                            String namaMahasiswa = scanner.next();
                            System.out.println("Input jenis kelamin mahasiswa: ");
                            String jenisKelaminMahasiswa = scanner.next();
                            System.out.println("Input alamat mahasiswa: ");
                            String alamatMahasiswa = scanner.next();
                            System.out.println("Input email mahasiswa: ");
                            String emailMahasiswa = scanner.next();
                            System.out.println("Input tanggal lahir mahasiswa: ");
                            String tanggalLahirMhs = scanner.next();
                            System.out.println("Input tempat lahir mahasiswa: ");
                            String tempatLahirMhs = scanner.next();
                            System.out.println("Input jurusan mahasiswa: ");
                            String jurusanMahasiswa = scanner.next();
                            System.out.println("Input angkatan mahasiswa: ");
                            int angkatanMahasiswa = scanner.nextInt();
                            boolean isActive = true;
                            Mahasiswa mahasiswa = new Mahasiswa(idMahasiswa, namaMahasiswa, jenisKelaminMahasiswa,
                                                alamatMahasiswa, emailMahasiswa, tempatLahirMhs, tanggalLahirMhs,
                                                isActive, jurusanMahasiswa, angkatanMahasiswa);
                            Mahasiswa.addMahasiswa(mahasiswa);
                            System.out.println("Mahasiswa telah berhasil ditambahkan ke anggota perpustakaan");
                            break;
                        case 2:
                            System.out.println("Menampilkan daftar mahasiswa");
                            Mahasiswa.showAllMahasiswa();
                            break;
                        case 3:
                            System.out.println("Ini fungsi untuk memperbarui informasi mahasiswaa");
                            System.out.println("Masukkan ID mahasiswa: ");
                            idMahasiswa = scanner.next();
                            System.out.println("Masukkan alamat: ");
                            alamatMahasiswa = scanner.next();
                            System.out.println("Masukkan email: ");
                            emailMahasiswa = scanner.next();
                            Mahasiswa.updateMahasiswaById(idMahasiswa,alamatMahasiswa,emailMahasiswa);
                            System.out.println("Informasi mahasiswa berhasil diperbaharui");
                            break;
                        case 4:
                            System.out.println("Ini adalah fungsi untuk menghapus mahasiswa");
                            System.out.println("Masukkan ID mahasiswa: ");
                            idMahasiswa = scanner.next();
                            Mahasiswa.deleteMahasiswaById(idMahasiswa);
                            System.out.println("Informasi mahasiswa berhasil dihapus");
                            break;
                        case 5:
                            isTrue = false;
                            break;
                    }
                case 3:
                    System.out.println("Berikut adalah fungsi yang terdapat dalam menu \"Pustakawan\"");
                    System.out.println( "1. Menambahkan Pustakawan\n" +
                                        "2. Menampilkan Daftar Pustakawan\n" +
                                        "3. Memperbaharui Informasi Pustakawan\n" +
                                        "4. Menghapus Pustakawan\n" +
                                        "5. Keluar");
                    System.out.println("Masukkan fungsi yang dipilih: ");
                    fungsi = scanner.nextInt();
                    switch (fungsi) {
                        case 1:
                            System.out.println("Ini adalah fungsi untuk menambahkan pustakawan");
                            System.out.println("Input ID pustakawan: ");
                            String idPustakawan = scanner.next();
                            System.out.println("Input nama pustakawan: ");
                            String namaPustakawan = scanner.next();
                            System.out.println("Input jenis kelamin pustakawan: ");
                            String jenisKelaminPustakawan = scanner.next();
                            System.out.println("Input alamat pustakawan: ");
                            String alamatPustakawan = scanner.next();
                            System.out.println("Input email pustakawan: ");
                            String emailPustakawan = scanner.next();
                            System.out.println("Input tanggal lahir pustakawan: ");
                            String tanggalLahirPstwn = scanner.next();
                            System.out.println("Input tempat lahir pustakawan: ");
                            String tempatLahirPstwn = scanner.next();
                            boolean isActive = true;
                            Pustakawan pustakawan = new Pustakawan(idPustakawan, namaPustakawan, jenisKelaminPustakawan,
                                                    alamatPustakawan, emailPustakawan, tempatLahirPstwn,
                                                    tanggalLahirPstwn, isActive);
                            Pustakawan.addPustakawan(pustakawan);
                            System.out.println("Pustakawan telah berhasil ditambahkan ke perpustakaan");
                            break;
                        case 2:
                            System.out.println("Menampilkan daftar pustakawan");
                            Pustakawan.showAllPustakawan();
                            break;
                        case 3:
                            System.out.println("Ini fungsi untuk memperbarui informasi pustakawan");
                            System.out.println("Masukkan ID pustakawan: ");
                            idPustakawan = scanner.next();
                            System.out.println("Masukkan alamat: ");
                            alamatPustakawan = scanner.next();
                            System.out.println("Masukkan email: ");
                            emailPustakawan = scanner.next();
                            Pustakawan.updatePustakawanById(idPustakawan, alamatPustakawan, emailPustakawan);
                            System.out.println("Informasi pustakawan berhasil diperbaharui");
                            break;
                        case 4:
                            System.out.println("Ini adalah fungsi untuk menghapus pustakawan");
                            System.out.println("Masukkan ID pustakawan: ");
                            idPustakawan = scanner.next();
                            Pustakawan.getPustakawanById(idPustakawan);
                            System.out.println("Informasi pustakawan berhasil dihapus");
                            break;
                        case 5:
                            isTrue = false;
                            break;
                    }
                case 4:
                    isTrue = false;
                    break;
            }
        }
    }
}
