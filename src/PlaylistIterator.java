import java.util.List;

public class PlaylistIterator implements ISongIterator
{
    private List<Song> playlist;
    private int position;

    public PlaylistIterator(List<Song> playlist)
    {
        this.playlist = playlist;
        this.position = 0;
    }

    @Override
    public boolean hasNext()
    {
        return position < playlist.size();
    }

    @Override
    public Song next()
    {
        if (!hasNext())
        {
            throw new IndexOutOfBoundsException("No more songs available");
        }
        return playlist.get(position++);
    }
}
