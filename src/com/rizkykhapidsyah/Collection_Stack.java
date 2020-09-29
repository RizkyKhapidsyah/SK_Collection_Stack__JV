package com.rizkykhapidsyah;

/* Created by Rizky Khapidsyah */

import java.util.Iterator;
import java.util.Stack;

public class Collection_Stack {
    public static void main(String[] args) {
        Stack S = new Stack();

        S.push(2);
        S.push(10);
        S.push(1);

        /* Mengambil Data Pertama */
        Object ElemenPertama = S.firstElement();
        System.out.println("Elemen Pertama = " + ElemenPertama);

        /* Mengambil Data Berdasarkan Index */
        Object oi = S.get(1);
        System.out.println("Data = " + oi);

        Iterator i = S.iterator();

        while (i.hasNext()) {
            Integer item = (Integer) i.next();
            System.out.println("Data Iterator = " + item);
        }

        /* Mengambil Data Terakhir Yang Masuk */
        Object DataTerakhir = S.pop();
        System.out.println("Data pop = " + DataTerakhir);

        /* Hapus Data Berdasarkan Index */
        Object HapusObjek = S.remove(0);
        System.out.println("Objek Index 0 Yang Dihapus  : " + HapusObjek);

        /* Hapus Data Berdasarkan Data : 10 */
        Boolean Dihapus = S.remove((Object) 10);
        System.out.println("Objek 10 Yang Dihapus  = " + Dihapus);

        /* Menghapus Semua Objek */
        S.removeAllElements();
    }
}