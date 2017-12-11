package com.example.yang.recyclerviewtest;

/**
 * Created by Yang on 2017/12/6.
 */

public class Song {
    private int idImage;
    private String SongDetail;

    public Song(int idImage,String SongDetail){
        this.idImage = idImage;
        this.SongDetail = SongDetail;
    }

    public int getIdImage(){
        return  idImage;
    }

    public String getSongDetail(){
        return  SongDetail;
    }
}
