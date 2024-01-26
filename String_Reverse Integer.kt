https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/880/

fun reverse(x: Int): Int {
   var num = x
   var rev: Long = 0


   if(num < 0)
       num = (-1)*x


   while(num > 0) {
       var rem = num % 10
       rev = rev * 10 + rem
       num /= 10
   }


   if(rev > Int.MAX_VALUE || -rev < Int.MIN_VALUE)
       return 0


   if(x > 0)
       return rev.toInt()
   else
       return (-1)*rev.toInt()
}

// Time complexity: O(log10(x))
// Space complexity: O(1)

fun reverse(x: Int): Int {


   var num = x
   var rev = 0


   while (num != 0) {
       var rem = num % 10
       num /= 10


       if((rev > Int.MAX_VALUE/10) || (rev == Int.MAX_VALUE/10 && rem > 7)) {
           return 0
       }


       if((rev < Int.MIN_VALUE/10) || (rev == Int.MIN_VALUE/10 && rem < -8)) {
           return 0
       }


       rev = rev * 10 + rem
   }


   return rev
}

// Time complexity: O(log10(x))
// Space complexity: O(1)