// hello world
println "hello world";

def hello = "hello world"
println(hello)
println(hello.class)    // class java.lang.String

def i = 1;
println(i.class)        // class java.lang.Integer

def repeat(val = 'hello') {
    for (j = 0; j < 3; j++) {
        println(val)
    }
}

repeat("h")
repeat()

// 0、1、2、3
for (k in 0..3) {
    println(k)
}
// 0、1、2
for (k in 0..<3) {
    println(k)
}
// 1.1、2.1
for (k in 1.1..3) {
    println(k)
}
