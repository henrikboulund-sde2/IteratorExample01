import java.util.ArrayList;
import java.util.List;

public class MusicPlaylist implements IPlaylist
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

    @Override
    public ISongIterator createIterator()
    {
        return new PlaylistIterator(playlist);
    }
}
