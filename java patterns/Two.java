public class Two {
    public static void main(String[] args) {
        patternTwo(5);
    }
    static void  patternTwo(int n){
       for(int i = 1;i<=n;i++){
        for(int j = n-i;j>=0;j--){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}
