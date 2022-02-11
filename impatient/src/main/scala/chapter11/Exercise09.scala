package chapter11

import java.nio.file.Path

object Exercise09 extends App {

  val PathComponents(path, filename) = Path.of("/tmp/xpto.txt")
  println(path)
  println(filename)

  object PathComponents {
    def unapply(path: Path): Option[(String, String)] =
      Some(path.toFile.getParent, path.toFile.getName)
  }
}
