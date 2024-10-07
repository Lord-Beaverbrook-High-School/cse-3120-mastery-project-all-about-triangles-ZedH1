public class Triangle {
  private double sSide;
  private double mSide;
  private double lSide;

  public Triangle()
  {
    this.sSide = 3;
    this.mSide = 4;
    this.lSide = 5;
    System.out.println("A new triangle is created");
  }

  public Triangle(double s, double m, double l)
  {
    double[] set = {s, m, l};
    for (int f = 0; f < set.length; f++)
    {
      if (set[f] >= s && set[f] >= m && set[f] >= l)
      {
        this.lSide = set[f];
        continue;
      }

      else if (set[f] <= s && set[f] <= m && set[f] <= l)
      {
        this.sSide = set[f];
        continue;
      } else {
        this.mSide = set[f];
      }
    }


    /*this.sSide = s;
    this.mSide = m;
    this.lSide = m;*/
    System.out.println("A new triangle is created");
  }

  public void displayTriangle()
  {
    System.out.println("Smallest Side: " + this.sSide + "\nMedium Side: " + this.mSide + "\nLargest Side: " + this.lSide);
  }

  public boolean isTriangle()
  {
    return this instanceof Triangle;
  }
}

