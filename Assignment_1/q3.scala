package Assignment_1

object q3 {
  def main(args:Array[String]){
    var cover_price:Double=24.95;
    var first_fifty:Double=3.0;
    var additional_cost:Double=0.75;
    var discount:Double=0.4;
    var cost=cover_price+50*first_fifty+10*additional_cost;
    var total=cost*(1-discount);
    println("The total cost is "+ total);
  }
}