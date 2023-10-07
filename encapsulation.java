class Human{
  private int age;
  private String name;

  void setAge(int a){
    age = a;
  }
  int getAge(){
    return age;
  }

  void setName(String a){
    name = a;
  }
  String getName(){
    return name;
  }
}

class Main{
  public static void main(String arg[]){
    Human obj = new Human();
    obj.setAge(20);
    obj.setName("Aditya");

    System.out.println(obj.getName() + " : " + obj.getAge());
 
  }
}
