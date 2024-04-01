import java.util.ArrayList;
import java.util.List;

public class MusicPlaylist
{
    private List<Song> playlist;

    public MusicPlaylist()
    {
        this.playlist = new ArrayList<>();
    }

    public void addSong(Song song)
    {
        playlist.add(song);
    }

    public SongIterator createIterator()
    {
        return new PlaylistIterator(playlist);
    }
}
