package subtask3

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var countStr=0
        var countNeg=0
        var res:Int=1
        itemsFromArray.forEach {it->
            if (it is String ){
                countStr++
            }
            if ((it is Int)&& it<0){
                countNeg++
            }
        }
        if (countStr==itemsFromArray.size){
            return 0
        }
        if (itemsFromArray.size-countStr<=numberOfItems){
            itemsFromArray.forEach {
                it->if (it is Int){
                res*=it
            }
            }
            return res
        }
        if (countNeg==1){
            itemsFromArray.sort()
           for (i in itemsFromArray.size-1 downTo itemsFromArray.size-numberOfItems){
               res*=itemsFromArray[i] as Int
           }
            return res
        }
        else if (countNeg>1){

            var tempNeg=1
            var tempPos=1
            var tempNPos=1

            itemsFromArray.sort()

                tempNeg= itemsFromArray[0] as Int * itemsFromArray[1] as Int
                /*for (i in itemsFromArray.size-1  downTo  itemsFromArray.size-2){
                    tempPos*=itemsFromArray[i] as Int
                }*/
            for (i in itemsFromArray.size-1 downTo  itemsFromArray.size-(numberOfItems-2)){
                tempNeg*=itemsFromArray[i] as Int
            }
                for (i in itemsFromArray.size-1 downTo  itemsFromArray.size-numberOfItems){
                    tempNPos*=itemsFromArray[i] as Int
                }
            itemsFromArray.forEach { println(it) }
            println(tempNeg)
            println(tempNPos)
            println(tempPos)
                  return  if (tempNeg>tempNPos) tempNeg else tempNPos
            }

       return 0
    }
}

