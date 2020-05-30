package assignment_3

object q5 {
  
def main(args:Array[String]){
  println(even(10))
  }

def even(n:Int):Unit={
  if(n%2==0){
    add(n-2)
  }
  else{
    add(n-1)
  }
}

def add(n:Int):Int={
  n match{
    case 0 =>0
    case 1=> 0
    case n=> n+add(n-2)
  }
}
}