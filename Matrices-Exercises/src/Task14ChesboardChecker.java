public class Task14ChesboardChecker {
    //Given a chessboard representation where empty squares are 0 and queens are 1,
    //determine if either two queens threaten each other.
    // 0 1 2 3
    // 1
    // 2
    // 3
    public static void main(String[] args) {
        int[][] arr = {
                {0,0,0,0},
                {0,0,1,0},
                {1,0,0,0},
                {0,1,0,0}
        };
        boolean isTreaten=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==1) {
                    isTreaten = checkRow(i, j, arr);
                    if (isTreaten) {
                        break;
                    }
                    isTreaten = checkColl(i, j, arr);
                    if (isTreaten) {
                        break;
                    }
                    isTreaten = checkLeft(i, j, arr);
                    if (isTreaten) {
                        break;
                    }
                    isTreaten = checkRight(i, j, arr);

                    if (isTreaten) {
                        break;
                    }
                }
            }
            if(isTreaten){
                break;
            }
        }
        System.out.println(isTreaten);
    }

    public static boolean checkRow(int i,int j,int[][] arr){
        boolean treaten=false;
        for (int k = j+1; k <arr[i].length ; k++) {
            if(arr[i][k]==1){
               treaten=true;
               break;
            }
        }
        return treaten;
    }
    public static boolean checkColl(int i,int j,int[][] arr){
        boolean threaten=false;
        for (int k = i+1; k <arr.length ; k++) {
            if(arr[k][j]==1){
                threaten=true;
                break;
            }
        }
        return threaten;
    }
    public static boolean checkLeft(int i,int j,int[][] arr) {
        boolean treaten = false;
        if (i + j <= arr.length - 1) {
            for (int k = 0; k < i + j; k++) {
            if ((j - 1 - k)>=0 &&  arr[i + 1 + k][j - 1 - k] == 1) {
                    treaten = true;
                    break;
                }
            }
        } else {
            for (int k = 1; k < i + j - (2 * k); k++) {
                if ((i + k<i + j - (2 * k)) && arr[i + k][j - k] == 1) {
                    treaten = true;
                    break;
                }
            }
        }
        return treaten;
    }

    public static boolean checkRight(int i,int j,int[][]arr){
        boolean treaten=false;
        if(j<=i) {
            for (int k = 0; k < arr.length-i-1; k++) {
                if ((j + 1+k )< arr.length-1 && arr[i + 1+k ][j + 1+k ] == 1 ) {
                    treaten = true;
                    break;
                }
            }
        }else {
            for (int k = 0; k < arr.length-1-j; k++) {
                if ((j + 1+k )< arr.length-1 && arr[i + 1 +k][j + 1+k ] == 1) {
                    treaten = true;
                    System.out.println("In checkRight");
                    System.out.println(i + 1 );
                    System.out.println(j + 1 );
                    break;
                }
            }
        }
        return treaten;
    }
}
