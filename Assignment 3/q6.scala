package assignment_3

object q6 {
  def main(args:Array[String]){
    println(fibonacci_seq(10))
    
  }
  
  def fibonacci(x:Int):Int={
    x match{
      case x if x==0 => 0
      case x if x==1 =>1
      case x => fibonacci(x-1) + fibonacci(x-2)
    }
  }
  
  def fibonacci_seq(n : Int):Unit = {
		if(n>0) fibonacci_seq(n-1)
		println(fibonacci(n));
	}
}