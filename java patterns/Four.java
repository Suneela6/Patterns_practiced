public class Four {
    public static void main(String[] args) {
        patternFour(4);
    }
    static void patternFour(int n){
        for(int i = 0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<=n-1;i++){
            for(int j =n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
