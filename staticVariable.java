//Concept of static variable and method in java

class Mobile{
  String name;
  static int price;//Static variable
  String brand;

  public void show(){
    System.out.println(name + " : " + price + " : " + brand);
  }
  //Static method
  public static void show1(Mobile obj){
    System.out.println(obj.name + " : " + price + " : " + obj.brand);
  }
}


class Main{
  public static void main(String[] args){
    Mobile obj1 = new Mobile();
    obj1.name = "IPhone13";
    obj1.brand = "Apple";
    //obj1.price = 1500;

    Mobile obj2 = new Mobile();
    obj2.name = "GalaxyS98";
    obj2.brand = "Samsung";
    //obj2.price = 1400;

    Mobile.price = 1600;

    obj1.show();
    //obj2.show();

    Mobile.show1(obj2);
    
  }
}
