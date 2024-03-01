public class Timecomplexity
{
public static void main(String[] args) {

  complexity(2, 4, 6 , 8);

  }


  public static void complexity(int i, int n, int j, int k)
  {
      // n = 100 n = input size
      i = n;
      // This while loop is O(log n) because it is dividing by 2
      while (i > 1) {
          j = i;
          // This while loop is O(log n) because it is multiplied by 2
          while (j < n) {
              k = 0;
              // This while loop is O(n)
              while (k < n) {
                  k = k + 2;
              }
              j = j * 2;
          }
          i = i / 2;


      }
      System.out.println(" i=" + i + " n=" + n + " k=" + k + " j=" + j);

  }

}
