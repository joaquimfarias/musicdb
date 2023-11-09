package com.example.musicdb.album;

import java.util.*;

import com.example.musicdb.music.Music;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Album {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private long id ;
        private String nome ;
        private Data lançamento ;
        private List<Music> musicas ;
}
