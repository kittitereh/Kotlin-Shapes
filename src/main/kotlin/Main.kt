fun main() {
    var rectangle = Rectangle(4.0, 3.0)

    println("Rectangle area ${rectangle.area}")
    println("Rectangle perimeter ${rectangle.perimeter}")

    var square = Square(2.0)

    println("Square area ${square.area}")
    println("Square perimiter ${square.perimeter}")

    square.side = 4.0
    println("Another square area ${square.area}")
    println("Another square perimeter ${square.perimeter}")

    var triangle = Triangle( 3.0, 5.0, 4.0)
    println("Triangle area ${triangle.area}")
    println("Triangle perimeter ${triangle.perimeter}")

    var circle = Circle(4.0)
    println("Circle area is ${circle.area}")
    println("Circle perimiter is ${circle.perimeter}")
}


