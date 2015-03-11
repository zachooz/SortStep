
public class Stopwatch {
  private long start;
  private long stop;
  private long elapsed;
  public void start()
    /* begins keeping track of time */
  {
    start=System.nanoTime();
  }
  public void stop()
    /* stops keeping track of time */
  {
    stop=System.nanoTime();
    elapsed=stop-start;
  }
  public long elapsedTime()
    /* uses System.out to display the elapsed time in seconds */
  {
    // Replace the following line with your code
    return elapsed;
  }
  public void reset()
    /* resets the elapsed time to 0 */
  {
    elapsed=0L;
  }
}

