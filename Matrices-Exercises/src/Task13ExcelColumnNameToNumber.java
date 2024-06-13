public class Task13ExcelColumnNameToNumber {

    public static void main(String[] args) {
        String[] columnNames = {"ABC", "A", "C", "CZ", "MM"};

        for (String columnName : columnNames) {
            System.out.println(columnName + " " + excelColumnToNumber(columnName));
        }
    }

    public static int excelColumnToNumber(String columnName) {
        int result = 0;
        for (int i = 0; i < columnName.length(); i++) {
            result *= 26;
            result += columnName.charAt(i) - 'A' + 1;
        }
        return result;
    }
}
