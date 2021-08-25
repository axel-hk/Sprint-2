import kotlin.random.Random

class ProblemB {

    fun main() {

        val t: Int = readInt()

        for(i in 1..t) {

            var str: String = ""
            val arr: IntArray = readIntArray(2)
            //Длина строки
            val len = arr[0]
            val uniq = arr[1]
            val min: Int = len / uniq
            //Позиции букв латинского алфавита а - 0, b - 1, с -2...
            val index = IntArray(uniq)
            while (str.length < len){
                //Ascii код буквы
                var character: Int = Random.nextInt(97,97+uniq)

                     //Если есть буква, которая ещё не достигла предела повторений
                    if((min > index[character - 97])) {
                        str += character.toChar()
                        index[character - 97]++
                    }
                    //Если есть неиспользованные буквы
                    else if((index.contains(0))){
                        val lastVal = index.lastIndexOf(0)
                        character = lastVal + 97
                        str += character.toChar()
                        index[character - 97]++

                    }
                    //Если все буквы использовались и предел повторений достигнут
                    else if(str.length == len-1){
                        character = Random.nextInt(97, 97 + uniq)
                        str += character.toChar()
                    }
                }


            println(str)
        }


    }

}


