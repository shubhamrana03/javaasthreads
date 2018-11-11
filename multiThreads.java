import java.util.*;
class Thread11 extends Thread
{
  private int start=0;
  private int end=0;
  Thread11(int start,int end)
  {
    this.start=start;
    this.end=end;
  }

  public void run()
  {
    count();
  }
  public synchronized void count()
  {
    for (int j=start;j<end;j++)
    {
      System.out.println(j);
    }
  }
}

class multiThreads
{
  public static void main(String[] args)throws InterruptedException
  {
    Thread11 t1 = new Thread11 (0,500);
    t1.start();
    t1.sleep(10);
    Thread11 t2=new Thread11 (500,1000);
    t2.start();
  }
}