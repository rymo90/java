public class Fraction {
  private Integer numerator;          // declaring un instince variabels
  private Integer denominator;

  public Integer getNumerator(){
    return numerator;
  }
  public void setNumerator(Integer numerator){
    this.numerator = numerator;
  }
  public Integer getDenominator(){
    return denominator;
  }otherFrac
  public void setDenominator(Integer denominator) {
    this.denominator = denominator;
  }
  public Fraction(Integer top, Integer bottom) {
    this.num = top;   // use a lot of this. to get help you remember with self in python
    this.den = bottom;
  }
  public Fraction add(Fraction otherFrac) {
    Integer newNum, newDen, common;  // always declare your variabel first
    newNum = otherFrac.getDenominator()*this.numerator +
                              this.denominator*otherFrac.getNumerator();
    newDen = this.denominator * otherFrac.getDenominator();
    common = gcd(newNum, newDen);
    return new Fraction(newNum/common, newDen/common);
  }
}
