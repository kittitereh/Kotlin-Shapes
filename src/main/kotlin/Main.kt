fun main() {
    var rectangle = Rectangle(2.0, 3.0)

//    println(rectangle.area)

    var square = Square(2.0)

    println(square.area)
    println(square.perimeter)

    square.border = 4.0

    println(square.area)
    println(square.perimeter)
}

