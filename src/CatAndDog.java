public class CatAndDog {
    public static void main(String[] args) {
        Cat.sayHello();
        Dog.sayHello();
        Dog.catchCat(new Cat());
    }
  public static class Dog {
      public static void sayHello() {
          System.out.println("Гав");
      }
      public static void catchCat(Cat cat){
          System.out.println("Кошка поймана");
      }
  }
  public static class Cat {
      public static void sayHello() {
          System.out.println("Мяу");
      }
  }
}
