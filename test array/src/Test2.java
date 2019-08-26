public class Test2{
  public static void main(String[] a){
    int[] b=new int[]{111,77,88,44,32,11,13,25,8,9,7,5,58,45,78};
    b=swapValues(b);
   for(int i=0;i<b.length;i++)
   System.out.print(b[i]+" ");
  }
  static int[] swapValues(int[] b){
   int temp;
   for(int i=0;i<=b.length-2;i++){
      for(int j=i+1;j<=i+1;j++){
        temp=b[i];
        b[i]=b[j];
        b[j]=temp;
      }
      i=i+1;
    }
    return b;
  }
}
