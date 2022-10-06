interface Shape {
    var area: Double
    var perimeter: Double
}

open class Rectangle(var a: Double, var b: Double): Shape {

    override var area = 0.0
        get() = this.a * this.b

    override var perimeter = 0.0
        get() = (this.a + this.b) * 2
}

class Square(border: Double) : Rectangle(border, border) {
    var border = 0.0
        set(value){
            super.b = value
            super.a = value
            field = value
        }
}

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