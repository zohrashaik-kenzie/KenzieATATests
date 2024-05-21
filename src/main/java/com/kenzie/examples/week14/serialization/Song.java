package com.kenzie.examples.week14.serialization;


import java.io.Serializable;

public class Song implements Serializable {

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    private String SSN;
    private String artist;
    private String songTitle;
    private String albumTitle;
    private int awards;
    //private transient int x;

    public Song() {
    }

    public Song(String artist, String songTitle, String albumTitle, int awards) {
        this.artist = artist;
        this.songTitle = songTitle;
        this.albumTitle = albumTitle;
        this.awards = awards;
    }

    public Song(String SSN, String artist, String songTitle, String albumTitle, int awards) {
        this.artist = artist;
        this.songTitle = songTitle;
        this.albumTitle = albumTitle;
        this.awards = awards;
        this.SSN = SSN;
    }


    public String getArtist() {
        return artist;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public int getAwards() {
        return awards;
    }

    @Override
    public String toString() {
        return "Song{" +
                "SSN='" + SSN + '\'' +
                ", artist='" + artist + '\'' +
                ", songTitle='" + songTitle + '\'' +
                ", albumTitle='" + albumTitle + '\'' +
                ", awards=" + awards +
                '}';
    }
}
