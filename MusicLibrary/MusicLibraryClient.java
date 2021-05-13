
/**
 * Write a description of class MusicLibraryClient here.
 *
 * @Daniel McElroy
 * @4/30/21
 */
public class MusicLibraryClient
{
    public static void main(String[] args){
        MusicLibrary myLibrary = new MusicLibrary();
        
        Album a1 = new Album("Whole lotta red", "Playboi Carti", 24, 62.12);
        Album a2 = new Album("First", "one Guy", 10, 42.5);
        Album a3 = new Album("This Music", "Some Band", 9, 36);
        Album a4 = new Album("Play", "People", 12, 39.1);
        
        System.out.println("Testing library: ");
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("Testing add method");
        myLibrary.add(a1);
        myLibrary.add(a2);
        System.out.println(myLibrary);
        
        System.out.println("Testing remove method: ");
        myLibrary.remove(a1, 0);
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("Testing double capacity method: ");
        myLibrary.doubleCapacity();
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");    
        
        System.out.println("Testing alphabetical name sorting method: ");
        myLibrary.add(a1);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.sortByNameAlpha();
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        
        System.out.println("Testing binary title search method: ");
        System.out.println(myLibrary.binarySearchTitle("First"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        
        System.out.println("Testing binary artist search method: ");
        System.out.println(myLibrary.binarySearchArtist("People"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("Testing linear title search method: ");
        System.out.println(myLibrary.linearSearchTitle("First"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        
        System.out.println("Testing linear artist search method: ");
        System.out.println(myLibrary.linearSearchArtist("People"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        
        System.out.println("Testing sort by duration method: ");
        myLibrary.sortByDuration();
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        
                
        
        System.out.println("Test complete.");
    }
}
