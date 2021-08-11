//package coding.challenge.jukebox;

import java.util.List;
import java.util.Set;


class CD {

    private List<Song> songs;
   
    // more details about CDs         

    public List<Song> getSongs() {
        return songs;
    }  

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }                
}


class Playlist {
    
    private Song song;
    
    private final List<Song> songs; // or Queue

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }   
    
    public Playlist(Song song, List<Song> songs) {
        this.song = song;
        this.songs = songs;
    }        
    
    protected void addSong(Song song) {}
    protected void removeSong(Song song) {}
    protected void shuffle() {}    
    protected Song getNextSong() { return null; };
    protected Song getPrevSong() { return null; };

    protected Song getSong() {
        return song;
    }

    protected void setSong(Song song) {
        this.song = song;
    }       

    protected List<Song> getSongs() {
        return songs;
    }        
}

class CDPlayer {
        
    private CD cd;
    
    private final Set<CD> cds;  
    private final Playlist playlist;       

    public CDPlayer(Playlist playlist, Set<CD> cds) {
        this.playlist = playlist;
        this.cds = cds;
    }                
            
    protected void playNextSong() {}
    protected void playPrevSong() {}   
    protected void addCD(CD cd) {}
    protected void removeCD(CD cd) {}

    protected Playlist getPlaylist() {
        return playlist;
    }

    protected CD getCd() {
        return cd;
    }                

    protected Set<CD> getCds() {
        return cds;
    }        
}

interface Selector {
    
    public void nextSongBtn();
    public void prevSongBtn();
    public void addSongToPlaylistBtn(Song song);
    public void removeSongFromPlaylistBtn(Song song);
    public void shuffleBtn();
}

class Jukebox implements Selector {

    private final CDPlayer cdPlayer;   

    public Jukebox(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;        
    }            

    @Override
    public void nextSongBtn() {        
        System.out.println("Playing next song ...");             
    }

    @Override
    public void prevSongBtn() {
        System.out.println("Playing previous song ...");
    }

    @Override
    public void addSongToPlaylistBtn(Song song) {}

    @Override
    public void removeSongFromPlaylistBtn(Song song) {}

    @Override
    public void shuffleBtn() {}
}

class Song {
    
    private final String title;
    private final CD cd;        
    
    // more song details            

    public Song(String title, CD cd) {
        this.title = title;
        this.cd = cd;            
    }   

    public CD getCd() {
        return cd;
    }       
    
    public String getTitle() {
        return title;
    }
}
/*
import coding.challenge.jukebox.CD;
import coding.challenge.jukebox.CDPlayer;
import coding.challenge.jukebox.Jukebox;
import coding.challenge.jukebox.Playlist;
import coding.challenge.jukebox.Song;
import coding.challenge.user.User;
import java.util.List;
import java.util.Set;
*/

//package coding.challenge.user;
//import coding.challenge.jukebox.Jukebox;

class User {
    private final Jukebox jukebox;
    public User(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    public Jukebox getJukebox() {
        return jukebox;
    }        
}

public class JukeBoxTest {

    public static void main(String[] args) {        
        
        CD cd1 = new CD();        
        Song s1 = new Song("Song 1", cd1);
        Song s2 = new Song("Song 2", cd1);
        cd1.setSongs(List.of(s1, s2));
        
        CD cd2 = new CD();
        Song s3 = new Song("Song 3", cd2);
        Song s4 = new Song("Song 4", cd2);
        cd2.setSongs(List.of(s3, s4));               
       
        Playlist pl = new Playlist(List.of(s1, s2, s3, s4));
        
        CDPlayer cdp = new CDPlayer(pl, Set.of(cd1, cd2));
        
        Jukebox jb = new Jukebox(cdp);
        
        User user = new User(jb);
        
        user.getJukebox().nextSongBtn();
    }

}
