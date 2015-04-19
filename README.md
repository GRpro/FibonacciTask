Simple Fibonacci Task
=====================

You can find task in /src/main/resources/task.txt
You can find explanation in /src/main/resources/explanation.txt

**Used technologies**
* Java
* Clojure
* Maven

There are four solutions: 3 - java 1 - clojure
The answer on question how to invoke Clojure functions from java also exists there.

*To run Clojure function in REPL you need do the following:*
* Run REPL: just run maven command "mvn clojure:repl"
* Load file in REPL: run following command in REPL (load-file "src/main/clojure/fibonacci.clj")
* Invoke function: (fib-sum-ev 4000000)

Result will be in REPL console.