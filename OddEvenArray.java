import java.util.*;
class OddEvenArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=0;
    n=sc.nextInt();
    int[] num = new int[n];
    for(int i=0;i<n;i++)
    {
      num[i] = sc.nextInt();
    }
    int[] numSort = new int[n];
    int j =0;
    int k = 0;
    for(int i = 0 ; i<n; i++)
    {
      if(num[i]%2==1)
      {
        numSort[j] = num[i];
        j++;
      }
    }
    for(int i = 0;i<n;i++)
    {
      if(num[i]%2==0)
      {
        numSort[j+k] = num[i];
        k++;
      }
    }
    System.out.println(Arrays.toString(numSort));
  }
}
