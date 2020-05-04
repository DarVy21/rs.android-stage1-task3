package subtask6

import javax.swing.tree.TreeNode

class FullBinaryTrees {

    class TreeNode(var value: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    val map = mutableMapOf<Int, List<TreeNode?>>(1 to listOf(TreeNode(0)))

    fun stringForNodeCount(count: Int): String {
       if (count%2==0){
           return "[]"
       }
        if (count==1){
            return "[[0]]"
        }

        val map=allPossibleFBT(count)

        var result: ArrayList<String> = ArrayList<String>()
        for (i in map){
            println(i)
            result.add(i.toString())
            println(result)
        }

        return map.toString()

    }
    private fun allPossibleFBT(N: Int): List<TreeNode?> {
        var list=ArrayList<String>()
        if (!map.containsKey(N)) {
            val ans = mutableListOf<TreeNode?>()
            for (x in 0 until N) {
                val y = N - 1 - x
                for (left in allPossibleFBT(x)) {
                    for (right in allPossibleFBT(y)) {
                        val bns = TreeNode(0)
                        bns.left = left
                        bns.right = right
                        ans.add(bns)

                    }
                }
            }
            map.put(N, ans)
        }
        return map[N].orEmpty()
    }

}
