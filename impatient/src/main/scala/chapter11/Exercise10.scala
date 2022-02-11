package chapter11

import java.nio.file.Path
import scala.jdk.CollectionConverters._

object Exercise10 extends App {

  val path = Path.of("/tmp/xpto.txt")

  path match {
    case PathComponents(root, file) => println(s"Root $root, File: $file")
  }

  object PathComponents {
    def unapplySeq(path: Path): Option[Seq[String]] =
      Some(path.iterator().asScala.map(_.toString).toSeq)
  }
}
