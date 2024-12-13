public class garden {
  int apple_price=20;
  int apple_count=5;
  void total_money()
  {
    int total=apple_count*apple_price;
    System.out.println("Total Money : "+total);
  }

  public static void main(String args[])
  {
    garden price=new garden();
    price.total_money();
  }
}
