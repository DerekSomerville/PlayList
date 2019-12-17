public class SongGenerator {

    private static SongComponent generate(){
        SongComponent allMusic = new PlayList("All Music","All Music");
        SongComponent ninetiesDance = new PlayList("Nineties Dance","Dance music from the 90s");
        SongComponent dance = new PlayList("Dance Music","Dance music");
        SongComponent twoThusandDance = new PlayList("2000 Dance","Dance music from the 00s");

        allMusic.add(dance);
        dance.add(ninetiesDance);
        dance.add(twoThusandDance);
        Song stepOn = new Song("Step On", "Happy Mondays", 1990);
        Song foolsGold = new Song("Fools Gold", "Stone Roses", 1989);
        ninetiesDance.add(stepOn);
        ninetiesDance.add(foolsGold);
        Song crazy = new Song("Crazy", "Gnarls Barkley", 2006);
        twoThusandDance.add(crazy);
        Song requiem = new Song("Requiem", "Mozart", 1791);
        allMusic.add(requiem);

        return allMusic;
    }
    public static void main(String[] args) {
        SongComponent allMusic = generate();
        Player player = new Player(allMusic);
        player.displaySongInfo();

    }

}
