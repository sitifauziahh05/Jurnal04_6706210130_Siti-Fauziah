package com.pau;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Lagu> daftarlagu = new LinkedList<>();

        boolean keluar = false;
        while (!keluar) {
            System.out.println("------menu------");
            System.out.println("1. input Lagu");
            System.out.println("2. hapus Lagu");
            System.out.println("3. mainkan Lagu");
            System.out.println("4. Keluar");
            System.out.println("pilih menu dengan angka: ");
            int select = input.nextInt();
            input.nextLine();
            switch (select) {
                case 1:
                    System.out.println("Masukan judul lagu: ");
                    String judullagu = input.nextLine();
                    System.out.println("Masukan nama penyanyi: ");
                    String namaPenyanyi = input.nextLine();
                    daftarlagu.addLast(new Lagu(judullagu, namaPenyanyi));
                    break;
                case 2:
                    System.out.println("1.Hapus lagu paling terakhir dimasukkan");
                    System.out.println("2. Hapus lagu berdasarkan judul");
                    System.out.println("pilih opsi di atas dengan memasukan angka: ");
                    int rmOption = input.nextInt();
                    input.nextInt();
                    if (rmOption == 1) {
                        daftarlagu.removeLast();
                        System.out.println("Berhasil menghapus lagu!");
                    } else if (rmOption == 2) {
                        System.out.println("Opsi tidak tersedia, silahkan coba lagi!");
                        String rmJudullagu = input.nextLine();
                        removeByTitle(daftarlagu, rmJudullagu);
                        System.out.println("Berhasil menghapus lagu");
                    } else {
                        System.out.println("opsi tidak tersedia, silahkan coba lagi!");
                    }
                    break;
                case 3:
                    daftarmusik(daftarlagu);
                    break;
                case 4:
                    keluar = true;
                    break;
                default:
                    System.out.println("Menu tidak tersedia, silahkan coba lagi!");
            }
        }
    }
        //mencetak
    public static void daftarmusik(LinkedList<Lagu> ob) {
        ListIterator<Lagu> iterator = ob.listIterator();
        while (iterator.hasNext()){
            if (iterator.hasPrevious()) {
                System.out.print("," + iterator.next());
            } else {
                System.out.print(iterator.next());
            }
        }
        iterator.previous();
        while (iterator.hasPrevious()) {
            System.out.print("," + iterator.previous());
        }
        System.out.println();
    }
        //menghapus
    public static void removeByTitle(LinkedList<Lagu> ob, String judullagu) {
        ListIterator<Lagu> iterator = ob.listIterator();

        while (iterator.hasNext()) {
            Lagu current = iterator.next();
            if (current.getJudullagu().equalsIgnoreCase(judullagu)) {
                iterator.remove();
            }
        }
    }
}
