https://leetcode.com/problems/most-common-word/description/

class Solution {
        fun mostCommonWord(paragraph: String, banned: Array<String>): String {

            var ban = HashMap<String, Int>()
            for(banV in banned) {
                val count = ban.getOrDefault(banV, 0) + 1
                ban[banV] = count
            }

            val words = paragraph.split("\\W+".toRegex()).filter { it.isNotEmpty() }.map { it.toLowerCase() }

            var result = HashMap<String, Int>()

            for (word in words) {
                if(!ban.containsKey(word)) {
                    val count = result.getOrDefault(word, 0) + 1
                    result[word] = count
                }
            }

            var max = 0
            var finalResult = ""
            for((key, value) in result) {
                if(max < value) {
                    max = value
                    finalResult = key
                }
            }

            return finalResult
        }
    }
	
	
// Time complexity: O(n + m + k)
// Space complexity: O(n + k + m)

