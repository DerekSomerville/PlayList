public class Player {

    SongComponent songList;

    public Player(SongComponent songList){
        this.songList = songList;
    }

    public void displaySongInfo(){
        songList.displaySongInfo();
    }
}
