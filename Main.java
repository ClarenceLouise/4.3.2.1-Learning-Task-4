class Main {
  public static void main(String[] args) {
    Order CustOrder = new Order();
    Order studentO = new Student();
    Order coupleO = new Couple();

    CustOrder.cOrder();
    studentO.cOrder();
    coupleO.cOrder();
  }
}