package com.agiledeveloper

class Counter(initialValue: Int) {

    var value = initialValue

    // https://kotlinlang.org/docs/reference/operator-overloading.html
    operator fun inc() = Counter(value + 1)
    operator fun dec() = Counter(if(value > 0) value - 1 else 0)

    // https://kotlinlang.org/docs/reference/classes.html#constructors
    init {
        if (initialValue< 0) {
            throw RuntimeException("Invalid value")
        }
    }
}

//Uncomment one part at a time, write minimum code to make that part to work. Then
//uncomment the next part to move forward.

fun main() {
var counter = Counter(3)
  
println(counter.value) //3

for(i in 1..3) {
    counter++
}

println(counter.value) //6

  for(i in 1..5) {
    counter--
  }

println(counter.value) //1

counter--
counter--

println(counter.value) //0

try {
    Counter(-1)
  } catch(ex: RuntimeException) {
    println(ex) //java.lang.RuntimeException: Invalid value
  }
}

main()
