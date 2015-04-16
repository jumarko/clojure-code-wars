(ns clojure-code-wars.function-composition-test
  (:require [clojure-code-wars.function-composition :refer :all]
            [clojure.test :refer :all]))

;; Sample function:
(defn id [n] (do n))

(deftest compose-simple
  (testing
      (is (= ((compose (partial + 1) id) 0) 1))))

(deftest compose-simple-arithmetic
  (testing
      (is (= ((compose first rest) [1 2 3 4]) 2 ))))
