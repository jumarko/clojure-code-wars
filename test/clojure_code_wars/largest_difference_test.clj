(ns clojure-code-wars.largest-difference-test
  (:require [clojure-code-wars.largest-difference :refer :all]
            [clojure.test :refer :all]))

(deftest test-largest-difference
  ;; data [1] <= data [5], so 5 - 1 = 4
  (is (= (largestDifference [9 4 1 10 3 4 0 -1 -2]) 4))
  ;; never finds i<j such that data [i] <= data [j]
  (is (= (largestDifference [3 2 1]) 0)))
