(ns clojure-code-wars.egyptian-fractions
  "Exercise 'Some Egyption fractions'.
  More details here: https://www.codewars.com/kata/54f8693ea58bce689100065f/train/clojure.")

;;; Some examples:
;;;   decompose("21/23") should return ["1/2", "1/3", "1/13", "1/359", "1/644046"]


(defn decompose
  "Decompose rational given as a string into the series of rationals
  with numerator equal to one and without repetitions."
  [r]
  (let [number (clojure.edn/read-string r)]
    [number])
  )

(decompose "2/3")
