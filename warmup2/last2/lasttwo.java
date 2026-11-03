public class lasttwo {
  public int last2(String str) {

    int count = 0;

    if (str.length() >= 2) {
      String last = str.substring(str.length() - 2, str.length());

      for (int i = 1; i < str.length() - 1; i++) {
        if (str.charAt(i - 1) == last.charAt(0) && str.charAt(i) == last.charAt(1)) {
          count++;
        }

      }
    }
    return count;
  }
}
