val DefaultAuthor = "me"

class Book(var title: String, var author: String) {
  def this(title: String) = {
    this(title, DefaultAuthor)
  }
}

val myBook1 = new Book("My awesome book 1", "Me")
val myBook2 = new Book("My awesome book 2") // Works!

println(myBook2.author)