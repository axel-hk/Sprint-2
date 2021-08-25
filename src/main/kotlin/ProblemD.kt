class ProblemD {

    fun main() {

        val t: Int = readInt();
        for(i in 1..t) {
            val n = readInt()
            val arr = readLongArray(n)
            val SortedArr = arr.sortedDescending()
            val maxProfit = ArrayList<Long>()
            for(j in SortedArr.indices){
                maxProfit.add(SortedArr[j]*(j+1))
            }
            println(maxProfit.maxOrNull())
        }

    }

}