class Currentthreaddemo
{
 public static void main(String Args[])
 {
  Thread t=Thread.currentthread();
  System.out.println("Current thread"+t);
  t.setname("My thread");
  System.out.println("After name change"+t);
  try
  {
   for(int n=5;n>0;n--)
   {
    System.out.println(n);
    Thread.sleep(1000);
   }
  }
  catch(InterruptException e)
  {
   System.out.println("Main thread interrupted");
}
}
}