package CaseClass

object q {
  def main(args:Array[String]){
    
    val p1 = Point(3,4)
    val p2 = Point(4,5)
    val p3 = p1.move(2, 2)
    val p4 = p1.invert
    
    println(p1)
    println(p2)
    println(p1+p2)
    println(p3)
    println(p2-p1)
    println(p4)    
  }
  
  case class Point(a:Int,b:Int){
    def x : Int = a
    def y : Int = b
    
    def +(that:Point) = Point(this.x+that.x,this.y+that.y)
    def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)
    def -(that:Point)=Point(this.x-that.x,this.y-that.y)
    def invert = Point(y,x)  
  }
  
}