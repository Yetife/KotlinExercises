import java.util.*

fun main() {
    val string = "kotlin is a great language"
    val remove = removeVowel(string)
    println(remove)
}

fun removeVowel(strings : String) : String{
    val vowel = charArrayOf('a', 'e', 'i', 'o', 'u')
    var newString = ""

//         for (l in newString) {
//            for (a in vowel) {
//                if (a == l) {
//                    newString = strings.replace(l.toString(), "")
////                    println(newString)
////                    removeVowel(newString)
//                }
//            }
//        }
    for(letter in strings){
        if(letter !in vowel){
            newString += letter
        }
    }
    return newString;
}

