import java.util.ArrayList;

/**
 * Write a description of class Dictionary here.
 * 
 * @author (Josh Ross) 
 */
public class Dictionary
{
    private ArrayList<String> words;    // will store all the words that we read in
    // above declares a field called words. Recall that fields exist throughout the entire class. 
    
    /**
     * This is the constructor of the Dictionary class. 
     * Initializes the words ArrayList
     * @param filename loads in a pre-created list of English words.
     */
    public Dictionary(String filename)
    {
        // this is the constructor of the Dictionary class. The purpose of a constructor is to
        // properly initialize all fields of the class. 
        
        // constructors are always automatically called when the class is instantiated (e.g. when an
        // object of this class is created).
        
        words = new ArrayList<String>();    // initializes the words ArrayList
        
        FileInput.loadWords(filename, words); // loads in a pre-created list of English words from
                                                    // the specified file, that ought to be located
                                                    // in the project folder.
    }

    /**
     * Prints out all the words whose length is the specified number of characters. The words
     * printed out must retain their ORIGINAL case.
     * @param len The word length you are searching for.
     */
    public void wordsOfSpecifiedLength(int len)
    {
        // you must provide the implementation for this method
        for (int i = 0; i < words.size(); i++)
        {
            String currentWord = words.get(i);
            if (currentWord.length() == len)
            {
                System.out.println(currentWord);
            }
        }
    }
  
    /**
     * Prints out all the words that contain at least two adjacent e's. The adjacent e's do
     * NOT need to be of the same case (e.g. Ee counts as two adjacent e's). The words printed
     * out must retain their ORIGINAL case.
     */
    public void wordsWithAdjacentEs()
    {
        // you must provide the implementation for this method
        for (int i = 0;  i < words.size(); i++)
        {
            String testWord = words.get(i);
            if (testWord.indexOf("ee") != -1)
            {
                System.out.println(testWord);
            }
            
            if (testWord.indexOf("eE") != -1)
            {
                System.out.println(testWord);
            }
            
            if (testWord.indexOf("Ee") != -1)
            {
                System.out.println(testWord);
            }
            
            if (testWord.indexOf("EE") != -1)
            {
                System.out.println(testWord);
            }
        }
    }
    
    /**
     * Prints out all the words that contain every vowel (a, e, i, o, and u). Y doesn't count.
     * Uppercase vowels should also be considered vowels. The words printed out must retain
     * their ORIGINAL case.
     */
    public void wordsWithAllVowels()
    {
        for (int i = 0; i < words.size(); i++)
        {
            String testWord = words.get(i);
            testWord = testWord.toUpperCase();
            if (testWord.indexOf("A") != -1 && testWord.indexOf("E") != -1 && testWord.indexOf("I") != -1 && testWord.indexOf("O") != -1
            && testWord.indexOf("U") != -1)
            {
                System.out.println(words.get(i));
            }
        }
    }
}

