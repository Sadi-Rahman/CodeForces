import java.util.Scanner;
class nextRound {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n, k, sum=0;
    n=sc.nextInt();
    k=sc.nextInt()-1;
    
    int arr[]=new int [n];
    
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(arr[i]=arr[k] && arr[k]!= 0){
        sum++;
      }
      System.out.println(sum);
    }
  }
}
