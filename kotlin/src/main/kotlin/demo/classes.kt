package demo

data class Point(val x: Int, val y: Int) {
    operator fun plus(point: Point): Point {

        val (x1, y1) = this
        val (x2, y2) = point
        return Point(x1 + x2, y1 + y2)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(Point(3, 4) + Point(y = 2, x = 5))


        }
    }
    init {
        println(this)
    }
}