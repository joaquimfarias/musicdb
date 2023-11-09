package com.example.musicdb.music;

import javax.xml.crypto.Data;

import com.example.musicdb.album.Album;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;

    private String name ;
    @ManyToOne
    private String band ;
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album ;
    private Data lançamento ;

}
