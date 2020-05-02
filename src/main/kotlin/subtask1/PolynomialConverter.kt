package subtask1

import java.lang.Math.abs

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        var str1=StringBuilder()
        val arrSize=numbers.size

        if (arrSize==0){
            return null
        }

        var j=0
       for (i in arrSize-1 downTo   0){

           when{
               (numbers[j]>0&&i==arrSize-1)->str1.append("${numbers[j]}x^$i")
               (i==1&& numbers[j]==1)->str1.append(" + x")
               (i==1&& numbers[j]==-1)->str1.append(" - x")
               ( numbers[j]==1)->str1.append(" + x^$i")
               (numbers[j]==-1)->str1.append(" - x^$i")
               (i==0&&numbers[j]<0)->str1.append(" - ${abs(numbers[j])}")
               (i==0&&numbers[j]>0)->str1.append(" + ${numbers[j]}")


               (numbers[j]>0&&i==1)->str1.append(" + ${numbers[j]}x")
               (numbers[j]<0&&i==1)->str1.append(" - ${abs(numbers[j])}x")
               (numbers[j]>0)->str1.append(" + ${numbers[j]}x^$i")
               (numbers[j]<0)->str1.append(" - ${abs(numbers[j])}x^$i")

           }

           j++

       }
        print(str1)
        return str1.toString()
    }

}
