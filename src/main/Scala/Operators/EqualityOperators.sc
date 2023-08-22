case class PersonCaseClass(name: String, age:Int)

val firstCaseClassInstance = PersonCaseClass("Donald",66)
val secondCaseClassInstance = PersonCaseClass("Donald",66)

firstCaseClassInstance == secondCaseClassInstance
firstCaseClassInstance != secondCaseClassInstance
firstCaseClassInstance eq secondCaseClassInstance
firstCaseClassInstance ne secondCaseClassInstance