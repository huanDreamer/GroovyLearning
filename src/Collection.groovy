def range = 0..2
println(range.class)        // class groovy.lang.IntRange
assert range instanceof List

// ArrayList
list = [0, 1, 2]
list.add(3)
list << 4
list[5] = 5

println(list.class)    // class java.util.ArrayList
println(list)           // [0, 1, 2, 3, 4, 5]

list -= [1, 2]
list += 6
println(list)       // [0, 3, 4, 5, 6]


assert [1, 2, 3].join(",") == "1,2,3"
assert [1, 2, 3, 3].count(3) == 2

words = ["a", "b", "c"]
println(words*.toUpperCase())       // * meas every item

// map
map = [name: "Andy", "age": "45"]
println(map.getClass())     // class java.util.LinkedHashMap
println(map.get("name"))       // Andy
println(map.name)       // Andy


words.each {
    println(it)  // default: it
}

words.each { value ->
    println("-> ${value}")
}

