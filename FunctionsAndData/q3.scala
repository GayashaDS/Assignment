package FunctionsAndData

object q3 {
  def main(args:Array[String]){
    
    
  class Account(id:String, n:Int, b:Double){
      val nic : String=id
      val acc_number:Int =n
      var balance :Double=b
      
      override def toString = "["+nic+":"+acc_number +":"+ balance+"]"
      
    def transfer(a:Account, b:Double)=
        {
          this.balance=this.balance-b
          a.balance=a.balance+b
        }
     
  }
  val x = new Account("975654586",3000,50000)
    val y = new Account("985658586",30001,25000)
    
     
    val t = x.transfer(y,500)
    println("New balance of y account is "+y.balance)
    println("New balance of x account is "+x.balance)
  
  } 
  
}