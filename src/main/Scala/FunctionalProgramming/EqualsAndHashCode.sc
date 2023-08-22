case class Car(brand: String, model: String, firstManufacturedYear: Int)

val porsche911 = Car("Porsche", "911", 1963)
val avante = Car("Hyundai", "Avante", 1990)

println(porsche911 == avante)