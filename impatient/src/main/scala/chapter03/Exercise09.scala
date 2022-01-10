package chapter03

import java.lang.Math.max
import scala.collection.mutable.ArrayBuffer

// NOT FINISHED. Restart from scratch
object Exercise09 extends App {
  removeAndPrint(ArrayBuffer(-1, -2, 1))
  removeAndPrint(ArrayBuffer())
  removeAndPrint(ArrayBuffer(1))
  removeAndPrint(ArrayBuffer(-1))
  removeAndPrint(ArrayBuffer(1, -1))
  removeAndPrint(ArrayBuffer(-1, 1))
  removeAndPrint(ArrayBuffer(-1, 1, -2))
  removeAndPrint(ArrayBuffer(1, -1, -2))
  removeAndPrint(ArrayBuffer(1, -1, -2, 3))
  removeAndPrint(ArrayBuffer(1, 2, -1, -2, 3))
  // TODO: fixme
  removeAndPrint(ArrayBuffer(1, 2, -1, -2, 3, 4, 5, 6))

  private def removeAndPrint(array: ArrayBuffer[Int]): Unit = {
    removeFromFirstNegative(array)
    println(array)
  }

  // The same can be used for an ArrayBuffer
  def removeFromFirstNegative(array: ArrayBuffer[Int]): Unit = {
    val target = array.indices.filter(array(_) < 0).drop(1)

    if(!target.isEmpty) {
      val first = if(target.length > 0) target.head else -1
      val source = array.indices.filter(i => i > first && i >= 0)
      source.indices.foreach(i => {
        val targetIndex = if(i >= target.length) source(i) else target(i)
        array.insert(targetIndex, array(source(i)))
      })
      val last = max(if(source.isEmpty) -1 else source.last, target.last)
      array.remove(last, array.length - last)
    }
  }

}
