https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/887/

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        
        val size = strs.size

        /* if size is 0, return empty string */
        if (size == 0) return ""

        if (size == 1) return strs[0]

        /* sort the array of strings */
        Arrays.sort(strs)

        //print(strs[0])//flight

        /* find the minimum length from first and last string */
        val end = Math.min(strs[0].length, strs[size - 1].length)

        /* find the common prefix between the first and last string */
        var i = 0
        while (i < end && strs[0][i] == strs[size - 1][i])
            i++

        val pre = strs[0].substring(0, i) // i=2
        return pre
    }
}

// Time complexity: O(n logn)
// Space complexity: O(n)

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        
        val n = strs.size
        // take temp_prefix string and assign first element of arr : a.
        var result = strs[0]

        // Iterate for rest of element in string.
        for (i in 1 until n) {
            // .indexOf() return index of that substring from string.
            while (strs[i].indexOf(result) != 0) {

                // update matched substring prefix
                result = result.substring(0, result.length - 1)//flower,flowe,flow,flo

                // check for empty case. direct return if true..
                if (result.isEmpty()) {
                    return ""
                }
            }
        }

        return result
    }
}

//  Time complexity: O(n * m^2).
//  Space complexity: O(n)


class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        
        val w = strs[0]
        w.forEachIndexed { index, value ->
            if (strs.any { it.length == index || it[index] != value } ) 
            	return w.substring(0, index)
        }
        return w
    }
}

//  Time complexity: O(n * m^2).
//  Space complexity: O(n)