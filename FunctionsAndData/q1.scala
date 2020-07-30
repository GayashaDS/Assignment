package FunctionsAndData

object q1 {
  def main(args:Array[String]){
    
    val r = new Rational(2,3)
    println(r)
    println(r.neg)
    
    }
  class Rational(x:Int, y:Int){
      def numer = x
      def denom = y
      
      def neg = new Rational(-this.numer,this.denom)
      
      override def toString = numer + "/" + denom
      
    }
}

