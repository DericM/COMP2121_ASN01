
public class Qfour {

    public static void main (String args[]){
        int n = 50;
        int counter = 200;
        System.out.println(counter);
        
        for(int i = 2;i <= n+4;i++){
            counter = counter + 5;
            for(int j = i+1;j < n+4;j++){
                for(int k = j+1;k < n+4;k++){
                    counter = counter + 10;
                    System.out.println(i + "|" + j + "|" + k);
                }
            }
        }
        System.out.println(counter);
    }
}
