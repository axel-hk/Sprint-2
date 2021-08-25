import kotlin.math.abs

class ProblemC {

    fun main() {

        val n = readInt();
        val a = readIntArray(n)
        var sum = 0
        a.sort()
        for(i in a.indices step 2) sum+= a[i+1] - a[i]
        println(sum)


    }

}