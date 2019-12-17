public class Song extends SongComponent{
    String songName;
    String bandName;
    int releaseYear;

    public Song(String songName, String bandName, int releaseYear){
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }

    public String getSongName(){return songName;}
    public String getBandName(){return bandName;}
    public int getReleaseYear(){return releaseYear;}

    private void output(String display){
        System.out.println(display);
    }

    public void displaySongInfo(){
        output(getSongName() + " was recorded by " + getBandName() + " and released " + getReleaseYear() + "\n");
    }
}
