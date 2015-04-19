(ns user)

;counts the sum of all even-valued element in fibonacci sequence that
;are not grater of max param
(defn fib-sum-ev [max]
  (loop [sum 0 b 2 a 1]
    (if (> b max)
      sum
      (recur (+ sum b) (+ (* a 2) (* b 3)) (+ a (* b 2))))))