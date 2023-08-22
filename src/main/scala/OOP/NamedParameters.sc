class Book(
            var title: String = "Default Title",
            var author: String = "Me"
          ) {

}

val myBook = new Book()
val myBook2 = new Book(title = "My Title")

println(myBook.title)
println(myBook.author)
println(myBook2.title)