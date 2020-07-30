package FunctionsAndData

object q2 {
  def main(args:Array[String]){
    
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
    println(x)
    println(y)
    println(z)
    println(x.sub(y).sub(z))
    
    }
  class Rational(x:Int, y:Int){
      def numer = x/gcd(x,y)
      def denom = y/gcd(x,y)
      
      private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b,a%b)
      def sub(r:Rational) = new Rational(this.numer*r.denom-r.numer*this.denom, this.denom*r.denom)
      
      override def toString = numer + "/" + denom
      
    }
}