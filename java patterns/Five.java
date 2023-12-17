public class Five {
    public static void main(String[] args) {
        patternFive(5);
    }
    static void patternFive(int n){
        for (int i = n; i >= 1; i--) { 
  
            
            for (int j = 1; j < i; j++) { 
                System.out.print(" "); 
            } 
  
           
            for (int j = 0; j <= n - i; j++) { 
                System.out.print("*"); 
            } 
  
            
            System.out.println(); 
        } 
 }
}