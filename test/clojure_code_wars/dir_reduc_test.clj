(ns clojure-code-wars.dir-reduc-test
  (:require [clojure-code-wars.dir-reduc :refer :all]
            [clojure.test :refer :all]))

(deftest a-test1
  (testing "Test 1"
    (def ur ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"])
    (def vr ["WEST"])
        (is (= (dirReduc ur) vr))))

(deftest a-test2
  (testing "Test 2"
    (def ur ["NORTH", "WEST", "SOUTH", "EAST"])
    (def vr ["NORTH", "WEST", "SOUTH", "EAST"])
        (is (= (dirReduc ur) vr))))

(deftest a-test3
  (testing "Test 3"
    (def ur ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"])
    (def vr ["WEST", "WEST"])
        (is (= (dirReduc ur) vr))))

(deftest a-test4
  (testing "Test 4"
    (def ur ["NORTH", "WEST", "EAST"])
    (def vr ["NORTH"])
        (is (= (dirReduc ur) vr))))

(deftest a-test5
  (testing "Test 5"
    (def ur ["NORTH", "WEST", "EAST", "EAST", "WEST"])
    (def vr ["NORTH"])
        (is (= (dirReduc ur) vr))))

(deftest a-test6
  (testing "Test 6"
    (def ur [])
    (def vr nil)
        (is (= (dirReduc ur) vr))))
