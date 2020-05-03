package subtask2

class Combinator {


    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]

        for(x in 0 .. (n/2 )){
            if(m*fact(x)*fact(n-x) == fact(n))
                return x
        }

        return null
    }

     fun fact (n : Int) : Int {
        if((n == 0) || (n == 1)) return 1
        var f = 1
        for(k in 1 ..  n){
            f*=k
        }
        return f
    }

}
