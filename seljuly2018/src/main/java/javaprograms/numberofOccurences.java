package javaprograms;

class NoOfOccurenceOfCharacters {
   
    public void getOccuringChar(String str)
    { 
    	int MAX_CHAR = 256;
        // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
 
        
        int len = str.length();
        System.out.println("The reverse of string is");
        for(int j=len-1;j>=0;j--) {
        	System.out.println(str.charAt(j));
        }
 
        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;  // for next itteration the 
 
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j]) 
                    find++;                
            }
 
            if (find == 1) 
                System.out.println("Number of Occurrence of " +
                 str.charAt(i) + " is:" + count[str.charAt(i)]);            
        }
    }
    
}