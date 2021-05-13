/**
 * This class is the constructor for album objects
 *
 * @Daniel McElroy
 * @4/30/21
 */
public class Album
{
    public String name;
    public String artist;
    public int numTracks;
    public double duration;
    
    public Album(String name, String artist, int numTracks, double duration){
        this.name = name;
        this.artist = artist;
        this.numTracks = numTracks;
        this.duration = duration;
    }
    public String name(){
        return name;
    }
    public String artist(){
        return artist;
    }
    public int numTracks(){
        return numTracks;
    }
    public double duration(){
        return duration;
    }
    public String toString(){
        String result = "Title: " + name + "\n"
        + "Artist: " + artist + "\n" 
        + "Number of tracks: " + numTracks + "\n" 
        + "Playtime: " + duration + "\n";
        return result;
    }
}