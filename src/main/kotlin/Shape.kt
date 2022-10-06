import kotlin.math.pow

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

class Square(side: Double) : Rectangle(side, side) {
    var side = 0.0
        set(value){
            field = value
            super.b = value
            super.a = value
        }
}

class Triangle(var a: Double, var b: Double, var c: Double): Shape {

    override var perimeter = 0.0
        get() = this.a + this.b + this.c
    override var area = 0.0
        get() {
            val p = perimeter / 2
            return (p * (p - a) * (p - b) * (p - c)).pow(0.5)
        }
}
class Circle(var r:Double): Shape{
    override var area = 0.0
        get() = kotlin.math.PI *  r.pow(2)

    override var perimeter = 0.0
        get() = 2 * kotlin.math.PI * r
}

