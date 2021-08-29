class ProblemD {

    fun main() {

        val t: Int = readInt();
        for(i in 1..t) {
            val n = readInt()
            val arr = readLongArray(n)
            val sortedArr = arr.sortedDescending()
            var maxProfit: Long = 0
            for(j in sortedArr.indices) {
                if (sortedArr[j] * (j + 1) > maxProfit)
                    maxProfit = sortedArr[j] * (j + 1)
            }
            println(maxProfit)
        }

    }

}