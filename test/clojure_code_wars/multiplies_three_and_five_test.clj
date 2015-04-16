(ns clojure-code-wars.multiplies-three-and-five-test
  (:require [clojure-code-wars.multiplies-three-and-five :refer :all]
            [clojure.test :refer :all]))

(deftest sum-below-10
  (testing
      "Sum of all multiplies of 3 and 5 below 10"
    (is (= (solution 10) 23))))

(deftest sum-below-30
  (testing
      "Sum of all multiplies of 3 and 5 below 30"
    (is (= (solution 30) 195))))

(deftest zero-sum
  (testing
      "Zero sum should be returned for number 2 or lower"
    (is (zero? (solution 2)))))
