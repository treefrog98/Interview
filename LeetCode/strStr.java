public class strStr {

  public static void main(String[] args) {



  }
  public static int strStr(String needle, String haystack) {
    if(needle.length() == 0){
          return 0;
      }
      if(needle.length() > haystack.length()){
          return -1;
      }
      if(needle.equals(haystack)){
          return 0;
      }
      int index = -1;
      String temp = "";
      for(int i = 0; i < haystack.length(); i++){
         if((i+needle.length())-1 <= haystack.length()-1){
              temp = haystack.substring(i,i+needle.length());
              if(temp.equals(needle)){
                  index = i;
                  break;
              }
         }

      }
      return index;
  }
}
