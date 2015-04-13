(ns clojure-code-wars.haskell-array-operations-test
  (:require [clojure.test :refer :all]
            [clojure-code-wars.haskell-array-operations :refer :all] ))


(deftest head-test
  ,(testing "Head should return the first element of list"
    (is (= (clojure-code-wars.haskell-array-operations/head [1 2 3 4 5]) 1 ))))

(deftest tail-test
  ,(testing "tail should return the first element of list"
    (is (= (clojure-code-wars.haskell-array-operations/tail [1 2 3 4 5]) 5 ))))

(deftest init-test
  ,(testing "init should return the list without last element"
    (is (= (clojure-code-wars.haskell-array-operations/init [1 2 3 4 5]) [1 2 3 4] ))))

(deftest last-test
  ,(testing "last_ should return the last element of list"
    (is (= (clojure-code-wars.haskell-array-operations/last_ [1 2 3 4 5]) 5))))
