

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
      return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String str = "";
        for(int i = 1; i <= tableSize; i++){
          for(int j = 1; j <= tableSize; j++){
              int number = i * j;
              if(number < 10){
                str+= "  " + number + " |";
              }
              else if(number < 100){
                str+= " " + number + " |";
              }
              else{
                str+= number + " |";
              }

          }
          str += "\n";
        }
        return str;
    }
}
