(ns ReverseLonger)

(defn reverseLonger
  [a b]
  (if (>= (count a) (count b) )
    (str b (clojure.string/reverse a) b)
    (str a (clojure.string/reverse b) a)))
