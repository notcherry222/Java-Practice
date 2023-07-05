package D1;

public class DiagonalLine {
    public static void main(String[] args) {
        String[][] str = new String[5][5] ;

        for (int i = 0; i<str.length; i++){
            for (int k = 0; k<str[i].length ;k++){
                if(i == k ){
                    str[i][k] = "#";
                }else {str[i][k] = "+"; }
                System.out.printf(str[i][k]);
            }
            System.out.println();
        }
    }
}
