package FunctionsAndData

object q4_1 {
  def main(args:Array[String]){
    
   println("Overdraft - Total Balance - Interest")
   var acc1 = new Account("965426486",500,50000)
   var acc2 = new Account("965426487",501,25000)
   var acc3 = new Account("965426488",502,75000)
   var acc4 = new Account("965426489",503,100000)
   val bank:List[Account]=List(acc1,acc2,acc3,acc4)
   
   //overdraft accounts
   println("Overdraft account numbers :")
   var od = overdraft(bank)
   od.foreach(x=>print(x.acc_number+" "))
  
   //total balance
   var tB=balance(bank);
		println("\nTotal account balance       : "+tB.balance);

  //Account balance after adding Balance-Interest
		println("\nAccount balances + interest : ")
		var intList=interest(bank);
		intList.foreach(x=>print(x+" "));
  }
  
  val overdraft=(list:List[Account])=>list.filter(x=>x.balance<=0);
	val balance=(list:List[Account])=>list.reduce((x,y)=>new Account("S000",1000,x.balance+y.balance));
	val interest=(list:List[Account])=>list.map(x=>(if(x.balance>0) x.balance*1.05d else x.balance*1.01d));
	
  class Account(id:String, n:Int, b:Double){
      val nic : String=id
      val acc_number:Int =n
      var balance :Double=b
  }
  
}