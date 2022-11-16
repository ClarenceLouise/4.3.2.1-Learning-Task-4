class Order {
  public void cOrder() {
    System.out.println("These are what the customers ordered");
    System.out.println("----------------------------------------");
  }
}

class Student extends Order {
  public void cOrder() {
    System.out.println("The Student ordered: Ice cold brew");
  }
}

class Couple extends Order {
  public void cOrder() {
    System.out.println("The Young Couple ordered: 2 Iced Latte and 4 croissants");
  }
}