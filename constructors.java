class Human{
  private int age;
  private String name;

  public Human(){
    System.out.println("Hey I am a constructor");
    age = 20;
    name = "Aditya";
  }

  public int getAge(){
    return age;
  }

  public String getName(){
    return name;
  }
}

class Main{
  public static void main(String args[]){
    Human obj = new Human();
    System.out.println(obj.getName() + " : " + obj.getAge());
  }
}
