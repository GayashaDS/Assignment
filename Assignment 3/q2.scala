package assignment_3

object q2 {
  def main(args:Array[String]){
    println(primeSeq(10))
}
  
def GCD(a:Int,b:Int):Int={
  b match{
    case 0 => a
    case b if b>a => GCD(b,a)
    case _ => GCD (b, a%b)
  }
}

def prime(p_num:Int,num:Int=2):Boolean={
  num match{
    case num if (num ==p_num) => true
    case num if (GCD(p_num, num))>1 => false
    case num => prime(p_num, num+1)
    
  }
}

def primeSeq(p:Int, n:Int=2):Unit={
  if(p>=n){
			if(prime(n)) println(n);
					primeSeq(p, n+1)};
}
	}

