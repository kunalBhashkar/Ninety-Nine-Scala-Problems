// P33 (*) Determine whether two positive integer numbers are coprime.
//     Two numbers are coprime if their greatest common divisor equals 1.
//
//     scala> 35.isCoprimeTo(64)
//     res0: Boolean = true
import S99FindGCD.gcd
object S99FindCoPrime {
	def main(args: Array[String]){
		val coPrime=new FindCoPrime(35)	
			println("The given input has coprime : "+coPrime.isCoprimeTo(64) )
		}
}

class FindCoPrime(val i: Int){	
	def isCoprimeTo(n:Int) = gcd(i,n) == 1		
		
}
