public class Task13LoopsExcelColumnNameToNumber {
    //In Excel, columns are represented by letters, starting from A for the 1st column, B for the
    //2nd, and so on. After Z, the columns are represented by two letters, like AA, AB, etc.
    //Write a program that converts an Excel column name to its corresponding column
    //number.
    //Input Output
    //sirma.com
    //AB 28
    //A 1
    //C 3
    //CZ 104
    //MM 351
    public static void main(String[] args) {
        int numInAlphabet = 26;
        String searched = "AB";
        int twoCount = 26;
        int treeCount = 26;
        int countNum = 0;
        boolean isFoundNum = false;

        String txtValue = "";
        for (int i = 0; i < numInAlphabet; i++) {
            char ch1 = (char) (i + 65);
            countNum++;
            txtValue = String.valueOf(ch1);

            if (isFound(txtValue, searched, countNum)) {
                isFoundNum = true;
                break;
            }
            for (int j = 0; j < numInAlphabet; j++) {
                String twoChars = "";
                char ch2 = (char) (j + 65);
                twoCount++;
                twoChars = txtValue.concat(String.valueOf(ch2));

                if (isFound(twoChars, searched, twoCount)) {
                    isFoundNum = true;
                    break;
                }
                for (int k = 0; k < numInAlphabet; k++) {
                    String treeChars = "";
                    char ch3 = (char) (k + 65);
                    treeCount++;
                    treeChars = twoChars.concat(String.valueOf(ch3));
                    if (isFound(treeChars, searched, treeCount)) {
                        isFoundNum = true;
                        break;
                    }
                }
                if (isFoundNum) {
                    break;
                }
            }
            if (isFoundNum) {
                break;
            }
        }
    }

    public static boolean isFound(String searched,String temp,int countNum){
        boolean isFound=false;
        if(temp.equals(searched)){
            isFound=true;
            System.out.println(temp+":"+countNum);
        }
        return isFound;
    }
}
