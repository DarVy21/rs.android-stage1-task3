package subtask4

class SquareDecomposer {


    fun decomposeNumber(number: Int): Array<Int>? {
        val lNumber=number.toLong()
        var list=Decomposer(lNumber,lNumber*lNumber)

        if (list!=null) {

            /*list.forEach{
            println(it)
        }
*/
            list.removeAt(list.size - 1)
            list.forEach {
                println(it)
            }

            val arr = mutableListOf<Int>()

            for(it in list) {
                val value = it.toInt()
                arr.add(value)
            }
            return arr.toTypedArray()
        }
        return null

    }

    fun Decomposer(number:Long, remain:Long):ArrayList<Long>?{
        if (remain==0L){
            var list=ArrayList<Long>()
            list.add(number)
            return list

        }
        for (i in (number-1).toLong() downTo 0){
            if ((remain- i*i)>=0){
                var list=Decomposer(i,(remain- i*i))
                if (list!=null){
                    list.add(number)
                    return list
                }
            }
        }
        return null
    }

}
