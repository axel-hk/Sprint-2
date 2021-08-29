import kotlin.random.Random

class ProblemB {

    fun main() {

        val t: Int = readInt()

        for(i in 1..t) {

            var str: String = ""
            val arr: IntArray = readIntArray(2)
            //Длина строки
            val len = arr[0]
            //Количество букв
            val uniq = arr[1]
            for (j in 0 until len) {
                str += Char(97 + j % uniq)
            }

            println(str)
        }

    }

}


