//Concept of method overloading
// class Calculator{
//   public int add(int a, int b){
//     return a+b;
//   }

//   public int add(int a, int b, int c){
//     return a+b+c;
//   }
// }

class Main{
  public static void main(String[] args){
    int arr[] = new int[5];
    arr[0] = 1;arr[1] = 2;arr[2] = 3;arr[3] = 4;
    arr[4] = 5;
    
    for(int i : arr){
      System.out.print( " " + i + " " );
    }
    
  }
}
