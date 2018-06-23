import java.util.*;
import java.io.*;
class TreeSetDemo {
  public static void main(String[] args)throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String s = br.readLine();
  String[] str = s.split(" ");
  Set<String> strSet = new TreeSet<>();
  for(String h:str)
  {
    strSet.add(h);
  }
  for(String h:strSet){
    System.out.println(h);
  }
  }
}
