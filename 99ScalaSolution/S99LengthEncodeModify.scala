// P11 (*) Modified run-length encoding.
//     Modify the result of problem P10 in such a way that if an element has no
//     duplicates it is simply copied into the result list.  Only elements with
//     duplicates are transferred as (N, E) terms.
//
//     Example:
//     scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

import S99FindLengthEncode.lengthEncode
object S99LengthEncodeModify{
	def main(args: Array[String]){
	  println("The output value for method one is: "+encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  	  println("\nThe output value for method two is: "+encodeModifiedNew(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
	}
	def encodeModified[A](ls: List[A]): List[Any]=
		lengthEncode(ls) map { t=> if (t._1==1) t._2 else t}
	def encodeModifiedNew[A](ls: List[A]): List[Either[A,(Int,A)]]=
		lengthEncode(ls) map {t => if (t._1==1) Left(t._2) else Right(t)}
}
