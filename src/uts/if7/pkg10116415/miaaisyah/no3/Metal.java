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
public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artistName) {
        System.out.println(artistName+" adalah musisi Metal");
    }

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName+" adalah musisi Heavy Metal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName+" adalah musisi Punk");
    }

    public void genreGrunge(String artistName) {
        System.out.println(artistName+" adalah musisi Grunge");
    
    }
}
