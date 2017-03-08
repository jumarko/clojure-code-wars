(ns clojure-code-wars.double-cola-test
  (:require [clojure-code-wars.double-cola :refer :all]
            [clojure.test :refer :all]))

(deftest a-test1
  (testing "Test 1"
    (def na ["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"])
    (def rr 1)
    (def res "Sheldon")
    (println (who_is_next na rr))
        (is (= (who_is_next na rr) res))))
