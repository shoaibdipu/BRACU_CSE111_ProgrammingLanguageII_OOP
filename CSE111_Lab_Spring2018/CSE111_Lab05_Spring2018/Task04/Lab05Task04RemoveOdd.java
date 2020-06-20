public class Lab05Task04RemoveOdd{
    public static int [] removeOdd (int [] input){
       
        int oddC=0;
        
        for(int i=0; i<input.length; i++){
            if(input[i]%2!=0){
                oddC++;
            }
        }
        
        int [] compactArray = new int [input.length-oddC];
        
        int k = 0;
        
        for(int i=0; i<input.length; i++){
            if(input[i]%2!=0){
                continue;
            }else if(input[i]%2==0){
                compactArray[k] = input[i];
                k++;
            }
        }
        return compactArray;
    }
    
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        
        System.out.println();
        
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }    
    }
}

