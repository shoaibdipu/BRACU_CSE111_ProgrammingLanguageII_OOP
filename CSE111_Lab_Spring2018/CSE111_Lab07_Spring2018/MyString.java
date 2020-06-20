public class MyString {
    
    char [] stringArray;
    String new_string;
    public int size;
    
    public MyString() {
        // TODO: Constructor for an empty string.
        // Initialize the global variables.
    }
    
    public MyString(String new_string){
        stringArray = new_string.toCharArray();
        
        // TODO: Basic constructor where we are taking a string
        // EX: MyString s = new MyString("Hello");
        // Initialize global variables.
    }
    
    public int length() {
        size = stringArray.length;
        return size;
    }
    
    public char charAt(int n){
        char charA = ' ';
        if(n-1==size || n-1<size){
            charA = stringArray[n-1];
            
        }
        return charA;
        // TODO: Print 'invalid index' if n is below 0 or exceeds lenght of string.
        // otherwise return the character at that index.
        // replace line.
    }
    
    public boolean startsWith(String substring){
        int countSS=0;
        int retType=10;
        int lengthOfSubstr = substring.length();
        char [] newCharA = substring.toCharArray();
        if(lengthOfSubstr==size || lengthOfSubstr<size){
            for(int i=0; i<lengthOfSubstr; i++){
                if(stringArray[i]==newCharA[i]){
                    countSS++;
                }
                if(countSS==lengthOfSubstr){
                    retType = 1;
                }
                
            }
        }
        
        else{
            retType = 0;
        }
        if(retType == 1) return true;
        else return false;
    }
    
    
    
    public void replaceFirst(char oldChar, char newChar) {
        
        int len = stringArray.length;
        for(int i=0; i<len; i++){
            if(stringArray[i]==oldChar){
                stringArray[i]=newChar;
                break;
            }
        }
    }
    
    public void replaceAll(char oldChar, char newChar) {
        // TODO: replace all occurance of the old character with the new character.
    }
    
    public void replaceLast(char oldChar, char newChar) {
        // TODO: replace the last occurance of the old character with the new character.
    }
    
    public void toLowerCase() {
        // TODO: Convert all the letters to lower case.
    }
    
    public void toUpperCase() {
        // TODO: Convert all the letters to upper case.
    }
    
    public boolean equals(String new_string){
        // TODO: Return true if the new string is the same as the old string.
        return false;
    }
    
    public boolean equalsIgnoreCase(String new_string){
        // TODO: Return true if the new string is the same as the old string even if case
        // insensitive.
        return false;
    }
    
    public int compareTo() {
        // TODO: Return 0 if the two strings are equal, otherwise return the ascii difference
        // between the two string. If one string is a substring of another, return the difference
        // in length.
        return -1;
    }
    
    public int compareToIgnoreCase() {
        // TODO: Return 0 if the two strings are equal, otherwise return the ascii difference
        // between the two string. If one string is a substring of another, return the difference
        // in length. This method is case insensitive (eg: 'a' and 'A' are same).
        return -1;
    }
    
    public String substring(int start){
        // return a substring starting from the start index.
        return " ";
    }
    
    public String substring(int start, int end){
        // return a substring starting from the start index and ending on end index.
        return " ";
    }
    
    public int indexOf(char mychar) {
        // TODO: return the index of the first occurance of the character mychar. If not found return -1
        return -1;
    }
    
    public int lastIndexOf(char mychar) {
        // TODO: return the index of the last occurance of the character mychar. If not found return -1
        // (Search from right side)
        return -1;
    }
    
    public int indexOf(char mychar, int n) {
        // TODO: return the index of the of the character mychar after index n. If not found return -1
        return -1;
    }
    
    public int lastIndexOf(char mychar, int n) {
        // TODO: return the index of the of the character mychar after index n. If not found return -1
        return -1;
    }
    
    
    public String concat(String new_string) {
        // TODO: Return a new string that's a concatenation of my current string and the new_string.
        return " ";
    } 
}