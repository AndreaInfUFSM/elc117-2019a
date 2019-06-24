public class WaitNotifyDemo {

  public static void main(String[] args) {

    Data data = new Data();

    Thread t1 = new Thread(() -> {
        System.out.println("T1 is running");
        while (data.getVal() < 12) {
          try {
            Thread.sleep(500);
            data.increment();
            if (data.getVal() >= 10) {
              data.conditionSignal();
            }
            System.out.println(data.getVal());
          } catch (InterruptedException e) {}
        } 
    });

    Thread t2 = new Thread(() -> {

        System.out.println("T2 is running");
        while (data.getVal() < 10) {
          try {
            data.conditionWait();
          } catch (Exception e) {}
        }
        System.out.println(data.getVal());

    });

    t1.start();
    t2.start();
  }

}

class Data {

  private int val = 0;
  public int getVal() {
    return val;
  }
  public synchronized void increment() {
    val++;
  }
  public synchronized void conditionSignal() {
    notifyAll();
  }
  public synchronized void conditionWait() {
    try {
      wait();
    } catch (InterruptedException e) {}
  }

}
