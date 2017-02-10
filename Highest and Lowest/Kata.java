import java.util.Arrays;

public class Kata {
  public static String HighAndLow(String numbers) {
    String[] splited = numbers.split(" ");
    int[] intarray =  Arrays.stream(splited).mapToInt(Integer::parseInt).sorted().toArray();
    if(intarray.length == 1)
      return String.valueOf(intarray[0]) + " " + String.valueOf(intarray[0]);
    else
      return String.valueOf(intarray[intarray.length-1]) + " " + String.valueOf(intarray[0]);
  }
}
