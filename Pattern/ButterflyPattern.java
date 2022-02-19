package Pattern;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n=5;
        //Spaces = 2*(n-i)

        // Upper half
        for (int i=1;i<=n;i++){
            //1 part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int spaces =  2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd Part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // LOWER HALF
        for (int i=n;i>=1;i--){
            //1 part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int spaces =  2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd Part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
