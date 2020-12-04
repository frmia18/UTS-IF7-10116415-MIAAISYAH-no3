/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if7.pkg10116415.miaaisyah.no3;

/**
 * Nama : MIA AISYAH F
 * Kelas: PBO-2
 * NIM  : 10116415
 * Deskripsi Program : Uts Program nomor 2 PROGRAM GENDRE MUSIC
 */
public class HardRock extends Rnb implements PopRock,ProgressiveRock,PsycehedelicRock{

    public void genreHardRock(String artistName) {
        System.out.println(artistName+" adalah musisi HardRock");
    }

    @Override
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName+" adalah musisi PsychedelicRock");
    }

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName+" adalah musisi PopRock");
    }

    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName+" adalah musisi ProgressiveRock");

    }
}