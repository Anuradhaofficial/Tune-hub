package com.example.demo.services;

import java.util.List;
import com.example.demo.entities.Song;
import java.util.List;
import com.example.demo.services.SongService;

public interface SongService {


public void addSong(Song song);

public List<Song> fetchAllSongs();

public boolean songExists(String name);

public void updateSong(Song song);



}
