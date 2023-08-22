class Book(var title: String, var author: String)

val myBook1 = new Book("My awesome book 1", "Me")
val myBook2 = new Book("My awesome book 2", "Me")

println(myBook1.title)

myBook1.title = "My awesomebook 1 updated!"

println(myBook1.title)