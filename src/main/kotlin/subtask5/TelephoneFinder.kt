package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {

    var resultArr=ArrayList<String>()

    fun findAllNumbersFromGivenNumber(number: String): Array<String>?{
        val str:String=number
        var str2:String
         if (number.contains("-")){
             return null
         }
        for (num in number){
            when(num){
                '0'-> {
                    str2=str.replace(num,'8')
                    resultArr.add(str2)
                }
                '1'-> {
                    str2=str.replace(num,'2')
                    resultArr.add(str2)
                    str2=str.replace(num,'4')
                    resultArr.add(str2)
                }
                '2'-> {
                    str2=str.replace(num,'1')
                    resultArr.add(str2)
                    str2=str.replace(num,'5')
                    resultArr.add(str2)
                    str2=str.replace(num,'3')
                    resultArr.add(str2)
                }
                '3'-> {
                    str2=str.replace(num,'2')
                    resultArr.add(str2)
                    str2=str.replace(num,'6')
                    resultArr.add(str2)
                }
                '4'-> {
                    str2=str.replace(num,'1')
                    resultArr.add(str2)
                    str2=str.replace(num,'5')
                    resultArr.add(str2)
                    str2=str.replace(num,'7')
                    resultArr.add(str2)
                }
                '5'-> {
                    str2=str.replace(num,'2')
                    resultArr.add(str2)
                    str2=str.replace(num,'4')
                    resultArr.add(str2)
                    str2=str.replace(num,'8')
                    resultArr.add(str2)
                    str2=str.replace(num,'6')
                    resultArr.add(str2)
                }
                '6'-> {
                    str2=str.replace(num,'9')
                    resultArr.add(str2)
                    str2=str.replace(num,'5')
                    resultArr.add(str2)
                    str2=str.replace(num,'3')
                    resultArr.add(str2)
                }
                '7'-> {
                    str2=str.replace(num,'4')
                    resultArr.add(str2)
                    str2=str.replace(num,'8')
                    resultArr.add(str2)
                }
                '8'-> {
                    str2=str.replace(num,'5')
                    resultArr.add(str2)
                    str2=str.replace(num,'7')
                    resultArr.add(str2)
                    str2=str.replace(num,'0')
                    resultArr.add(str2)
                    str2=str.replace(num,'9')
                    resultArr.add(str2)
                }
                '9'-> {
                    str2=str.replace(num,'6')
                    resultArr.add(str2)
                    str2=str.replace(num,'8')
                    resultArr.add(str2)
                }

            }
        }
        val array = arrayOfNulls<String>(resultArr.size)
      print(resultArr.toString())
        return resultArr.toArray(array)

    }
}
