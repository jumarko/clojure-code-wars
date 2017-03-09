(ns clojure-code-wars.egyptian-fractions-test
  (:require [clojure-code-wars.egyptian-fractions :refer :all]
            [clojure.test :refer :all]))


(deftest a-test1
  (testing "Test 1"
    (is (= (decompose "0") []))))
(deftest a-test2
  (testing "Test 2"
    (is (= (decompose "3/4") ["1/2", "1/4"]))))
(deftest a-test3
  (testing "Test 3"
    (is (= (decompose "12/4") ["3"]))))
(deftest a-test4
  (testing "Test 4"
    (is (= (decompose "4/5") ["1/2", "1/4", "1/20"]))))
