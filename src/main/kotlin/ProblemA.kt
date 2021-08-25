
class ProblemA {

    fun main() {

        val t: Int = readInt();
        for(i in 1..t) {
            //Позиция лягушки после прыжков
            var sum: Long = 0;
            val arr: LongArray = readLongArray(3);
            val a: Long = arr[0];
            val b: Long = arr[1];
            val k: Int = arr[2].toInt();
            for(l in 1..k){
                //Если шаг чётный
                if(l%2==1){
                    sum+=a;
                }
                else sum-=b;
            }
            println(sum);
        }

        //ваша реализация в методе main

    }

}