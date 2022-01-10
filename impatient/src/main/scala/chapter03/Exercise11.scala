package chapter03

import java.util.TimeZone
import java.awt.datatransfer._
import java.util

object Exercise11 extends App {

  private val flavorMap: SystemFlavorMap = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  private val result: Array[AnyRef] = flavorMap.getNativesForFlavor(DataFlavor.imageFlavor).toArray()
  println(result.mkString(" "))

}
