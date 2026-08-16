public class Solution {
    public static void main(String[] args) {
        int n = 4;
        for(char i = 'E'; i>='A'; i--){
            for(char j = 'E'; j>=i; j--){
                System.out.print(j + " ");
            } 
            
            System.out.println(); 
        }
    }
}

