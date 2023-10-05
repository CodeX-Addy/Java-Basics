class Calculator{
    public int add(int a, int b){
        int r = a + b;
        return r;
    }
}
class Main{
    public static void main(String args[]){
        Calculator c = new Calculator();
        int s = c.add(3,4);
        System.out.println(s);
    }
} 
