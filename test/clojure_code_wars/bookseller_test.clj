(ns clojure-code-wars.bookseller-test
  (:require [clojure-code-wars.bookseller :refer :all]
            [clojure.test :refer :all]))

(deftest a-test1
  (testing "Test 1"
    (def ur ["BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"])
    (def vr ["A" "B" "C" "D"])
    (def res [["A" 0] ["B" 1290] ["C" 515] ["D" 600]])
        (is (= (stock-list ur vr) res))))

(deftest list-of-books-empty
  (is (empty? (stock-list [] ["A" "B" "C"]))))

(deftest list-of-cats-empty
  (is (empty? (stock-list  ["ABAR 100" "ACAR 200" "CIC 330"] []))))
