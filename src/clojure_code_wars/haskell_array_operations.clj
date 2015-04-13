(ns clojure-code-wars.haskell-array-operations
  (:gen-class))

(defn head
  "Returns the first element of list"
  [lst]
  (first lst))

(defn tail
  "Returns the rest of the list, without the first element"
  [lst]
  (last lst))

(defn init
  "Returns the list without its last element"
  [lst]
  (drop-last lst)
  )

(defn last_
  "Returns the last element of the list"
  [lst]
  (last lst)
  )
