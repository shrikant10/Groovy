/**
 * Created by shrikant on 8/6/16.
 */

println "!..     Hello        ..!"

List a = [2,3,4,5,6,66]

if(a) {
    println "This list a is not empty"
}

String b =""

if(b) {
    println "This string is not empty"
}
else {
    println("This string is empty");
}

Map data = [firstname:"Shrikant",lastname:"Gupta",info:"I am awesome"]
println data
println(data.firstname)
println(data.get("firstname"))
println(data["lastname"])
println(data["info"])

String  asr = """ Shrikant gupta
iiitnr
btech CSE """;

println "HEllo ${asr} $asr"
