/**
 * 
 * this class is used to get familiar with random variables.
 * 
 * 
 * @author Haijin He
 *
 */
public class Random
{
  public static int bionomial()
  {
    double r = Math.random();
    if (r > 0.5)
      return 1;
    else
      return 0;
  }

  
  
  /**
   * sums 100 varible ~ U(0,1), then average 
   * @return
   */
  public static double gaussian()
  {
    double result = 0;
   
    for (int i = 0; i < 100; i++)
    {
      double r = Math.random();
      result = result + r;
    }
    result = result / 100;
    return result;

  }

  public static double mean(double[] m)
  {
    double result = 0;
    for (int i = 0; i < m.length; i++)
      result = result + m[i];
    return result / m.length;

  }

  public static double sd(double[] m)
  {
    double average = mean(m);
    double result = 0;
    for (int i = 0; i < m.length; i++)
    {
      result = result + (m[i] - average) * (m[i] - average);

    }
    result = result / (m.length - 1);
    return Math.sqrt(result);

  }
  
//
  /**
   * Generates a gaussian random variable mean 0, sd 1.
   * from java source code. the original one generates 2 random Gaussian.
   * @return a random variable with gaussian distribution(mean 0, sd 1)
   */
  synchronized static public double nextGaussian() {
      // See Knuth, ACP, Section 3.4.1 Algorithm C.    
          double v1, v2, s;
          do {
              v1 = 2 * Math.random() - 1; // between -1 and 1
              v2 = 2 * Math.random() - 1; // between -1 and 1
              s = v1 * v1 + v2 * v2;
          } while (s >= 1 || s == 0);
          
          double multiplier = StrictMath.sqrt(-2 * StrictMath.log(s)/s);

          return v1 * multiplier;
      
  }

  

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
   double time[]={153,101,99};
   System.out.println(mean(time));
   System.out.println(sd(time));    
  

  }

}
