(ns clojure-code-wars.hamming-test
  (:require [clojure-code-wars.hamming :refer :all]
            [clojure.test :refer :all]))


(deftest Tests
  (is (= (hamming "I like turtles" "I like turkeys") 3))
  (is (= (hamming "Hello World" "Hello World") 0))
    (is (= (hamming "Hello Haskell" "Hello World!!") 7)))

(deftest empty-word
  (is (= (hamming "" "I like") 6)))

(deftest different-length
  (is (= (hamming "I like he very much!" "I like he very very much!") 10)))
