package Assignment2

object q2 {
  def main(args:Array[String]){
    println("Enter the ticket price ")
    var price :Int = scala.io.StdIn.readInt()
    var profit1 =profit(price:Int):Int
    println("profit =  " + profit1)
  }
  
  def attendees(price:Int):Int={
   return 120+(15-price)/5*20
  }
  
  def revenue(price:Int):Int={
    return attendees(price)*price
  }
  
  def cost(price:Int):Int={
    return 500 +3*attendees(price)
  }
  
  def profit(price:Int):Int={
    return revenue(price) - cost(price)
  }
  
}
