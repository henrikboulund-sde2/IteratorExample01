public class Main
{
    public static void main(String[] args)
    {
        // Test the implementation
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.addSong(new Song("Shape of You", "Ed Sheeran", 234));
        playlist.addSong(new Song("Someone Like You", "Adele", 278));
        playlist.addSong(new Song("Billie Jean", "Michael Jackson", 312));

        SongIterator iterator = playlist.createIterator();

        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist() + " (" + song.getDuration() + " seconds)");
        }
    }
}
