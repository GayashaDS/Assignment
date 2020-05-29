package Assignment2

object q1 {
  def main(args:Array[String]){
    var h1=40
    var h2=20
    var takeHome = takehome(h1:Int,h2:Int):Double
    println("Take home salary is "+ takeHome)
  }
  
  def wage(h1:Int):Int={                    //h1 normal hours
    return h1*150
  }
  
  def ot(h2:Int):Int={                       //h2 ot hours
    return h2*75
  }
  
  def income(h1:Int, h2:Int):Int={
    return wage(h1) + ot(h2)
  }
  
  def tax(income:Int):Double={
    return income * 0.1
  }
  
  def takehome(h1:Int,h2:Int):Double={
    return income(h1,h2)-tax(income(h1,h2))
  }
}