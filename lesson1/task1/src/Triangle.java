public class Triangle {

  // initialize 3 instance variables, smallest, medium and largest sides of triangle
  private double sSide;
  private double mSide;
  private double lSide;

  /** Precondition:  Default triangle constructed
   * Postcondition:
   *  - Returns default constructor variables for a triangle
   * - Smallest = 3, Medium = 4, Largest = 5
   *  - Print out that a new triangle has been constructed
   * param none
   * return triangle object
   */
  public Triangle()
  {
    sSide = 3;
    mSide = 4;
    lSide = 5;
    System.out.println("A new triangle is created");
  }

  /** Precondition: Construct triangle with given parameters
   * Postcondition:
   *  - Constructs triangle with given parameters
   * - Smallest = double s, Medium = double m, Largest  = double l
   *  - Print out that a new triangle has been constructucted
   * param double s the smallest double, double m the medium double, double l the largest double
   * return triangle object
   */
  public Triangle(double s, double m, double l)
  {
    double[] set = {s, m, l};
    for (int f = 0; f < set.length; f++)
    {
      if (set[f] >= s && set[f] >= m && set[f] >= l)
      {
        if (lSide == set[f])
        {
          mSide = set[f];
          continue;
        }
        lSide = set[f];
      }

      else if (set[f] <= s && set[f] <= m && set[f] <= l)
      {
        if (sSide == set[f])
        {
          mSide = set[f];
          continue;
        }
        sSide = set[f];
      } else {
        mSide = set[f];
      }
    }

    System.out.println("A new triangle is created");
  }

  // SETTERS

  /** Precondition: Set largest side of triangle to given parameter
   * Postcondition:
   *  - takes in new largest side parameter
   * - declare triangle largest side is new large side
   * param double newLSide new largest side
   * return largest side = new largest side
   */
  public void setLarge(double newLSide)
  {
    lSide = newLSide;
  }

  /** Precondition: Set medium side of triangle to given parameter
   * Postcondition:
   *  - takes in new largest side parameter
   * - declare triangle medium side is new medium side
   * param double newMSide new medium side
   * return medium side = new medium side
   */
  public void setMedium(double newMSide)
  {
    mSide = newMSide;
  }

  /** Precondition: Set smallest side of triangle to given parameter
   * Postcondition:
   *  - takes in new smallest side parameter
   * - declare triangle smallest side is new smallest side
   * param double newSSide new smallest side
   * return smallest side = new smallest side
   */
  public void setSmall(double newSSide)
  {
    sSide = newSSide;
  }

  // GETTERS


  // displayTriangle() that outputs the contents the triangle object in the form
  /** Precondition: Print triangle sides
   * Postcondition:
   *  - prints smallest, medium and large sides
   * param none
   * return none
   */
  public void displayTriangle()
  {
    System.out.println("Smallest Side: " + sSide + "\nMedium Side: " + mSide + "\nLargest Side: " + lSide);
  }

  /** Precondition: Returns the smallest side of the triangle
   * Postcondition:
   *  - returns smallest side
   * param none
   * return double sSide, smallest side of triangle
   */
  public double getSmall()
  {
    return sSide;
  }

  /** Precondition: Returns the medium side of the triangle
   * Postcondition:
   *  - returns medium side
   * param none
   * return double MSide, medium side of triangle
   */
  public double getMedium()
  {
    return mSide;
  }

  /** Precondition: Returns the largest side of the triangle
   * Postcondition:
   *  - returns largest side
   * param none
   * return double lSide, largest side of triangle
   */
  public double getLarge()
  {
    return lSide;
  }

  // perimeter() that returns the perimeter of the triangle
  /** Precondition: Returns the perimeter of the triangle
   * Postcondition:
   *  - adds all sides up (smallest, medium, largest)
   *  - returns sum of all sides of the triangle
   * param none
   * return double perimeter, lSide + mSide = sSide
   */
  public double perimeter()
  {
    return lSide + mSide + sSide;
  }

  // area() that returns the area of the triangle using Heron's formula
  /** Precondition: Returns the area of the triangle
   * Postcondition:
   *  - adds all sides up (smallest, medium, largest) then divide by two
   *  - Use Heron's formula in order to calculate find area of triangle
   *    without the use of height or base
   *  - return product of sum using Heron's formula for the area
   * param none
   * return double area, area of triangle
   */
  public double area()
  {
    double s = (mSide + sSide + lSide) / 2;
    return Math.sqrt(s * (s - sSide) * (s - mSide) * (s - lSide));
  }

  // isRightTriangle() that returns true if a² + b² = c² with double tolerance
  /** Precondition: Returns whether the triangle is a right triangle
   * Postcondition:
   *  - Create offset for rounding
   *  - take square of small side & square of medium side
   *  - take square of large side
   *  - Take absolute of the subtraction between the square of the small & medium side
   *    And the square of the large side
   *  - Check whether the difference is less than the offset
   * param none
   * return whether both sides are equal, use offset to solve precise problem
   */
  public boolean isRightTriangle()
  {
    // + Math.pow(mSide,mSide) + Math.pow(lSide, lSide)
    double offset = 0.1;
    double compare1 = (sSide * sSide) + (mSide * mSide);
    double compare2 = (lSide * lSide);

    return Math.abs(compare1 - compare2) <= offset;
  }

  // isTriangle() that returns true if a + b > c
  /** Precondition: Returns whether the triangle is a right triangle
   * Postcondition:
   *  - Add both small and medium side
   *  - Check if the sum is greater than the large side
   *  -
   * param none
   * return whether the sides form a possible triangle
   */
  public boolean isTriangle()
  {
    return ((sSide + mSide) > lSide);
  }
}

