public class Six {
    public static void main(String[] args) {
        patternSix(5);
    }
    static void patternSix(int n){
        for(int i =n;i>=1;i--){
            for(int j=n;j>i;j-- ){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)  
            {  
               System.out.print("*");  
            }  
            System.out.println();
        }
    }
}
