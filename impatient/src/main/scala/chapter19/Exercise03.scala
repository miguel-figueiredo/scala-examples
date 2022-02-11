package chapter19

import scala.collection.mutable.ArrayBuffer
import scala.language.postfixOps

object Exercise03 extends App {

  private val book: Book = new Book()

  book set Title to "Dune" set Author to "Frank Herbert"

  println(book)

  class Value
  object Title extends Value
  object Author extends Value

  class Document {

    private var useNextArgs: Any = null
    protected var title: String = ""
    protected var author: String = ""

    def set(obj: Title.type ): this.type = {
      useNextArgs = obj
      this
    }

    def set(obj: Author.type ): this.type = {
      useNextArgs = obj
      this
    }

    def to(value: String): this.type = {
      useNextArgs match {
        case Title => title = value
        case Author => author = value
      }
      this
    }

    def setAuthor(author: String): this.type = {
      this.author = author
      this
    }
  }

  class Book extends Document {

    val chapters: ArrayBuffer[String] = new ArrayBuffer()

    def addChapter(chapter: String): Book = {
      chapters += chapter
      this
    }

    override def toString: String = s"Title $title, Author: $author, Chapters: ${chapters.mkString(" ")}"
  }
}
