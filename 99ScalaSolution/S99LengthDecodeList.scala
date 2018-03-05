// P12 (**) Decode a run-length encoded list.
//     Given a run-length code list generated as specified in problem P10,
//     construct its uncompressed version.
//
//     Example:
//     scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
//     res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

import scala.collection.immutable.List._
object S99LengthDecodeList{
	def main(args: Array[String]){
	println("The value of output of Decoded List is: "+decodeList(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))	
	}
	def repeat[A](e: (Int, A)) = fill(e._1)(e._2)
	def decodeList[A](rle: List[(Int,A)]) = rle flatMap repeat
}
