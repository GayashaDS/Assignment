package assignment_3

object q4 {
  def main(args:Array[String]){
    println(isEven(4))
}
  
  def isEven(n:Int):Boolean={
    n match{
      case 0 => true
      case _ => isOdd(n-1)
    }    
  }
  
  def isOdd(n:Int):Boolean={
    return !(isEven(n))
  }
}