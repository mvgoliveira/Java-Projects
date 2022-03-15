public class Quadrado {
  private double alt;
  private double larg;

  public Quadrado(double alt, double larg) {
    setAlt(alt);
    setLarg(larg);
  }
  
  public double getAlt() {
    return alt;
  }

  public void setAlt(double alt) {
    this.alt = alt;
  }

  public double getLarg() {
    return larg;
  }

  public void setLarg(double larg) {
    this.larg = larg;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Quadrado other = (Quadrado) obj;
    if (Double.doubleToLongBits(alt) != Double.doubleToLongBits(other.alt))
      return false;
    if (Double.doubleToLongBits(larg) != Double.doubleToLongBits(other.larg))
      return false;
    return true;
  }

  
}
