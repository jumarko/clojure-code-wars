(ns clojure-code-wars.dir-reduc)

;;; The idea behind this approach is to use concept similar to complex numbers (pairs of numbers)
;;; to represent different directions (NORTH, SOUTH, WEST, EAST)
;;; Then, the simple arithmetic will lead us to the final result.

(defn map-directions-to-numbers
  [directionsList]
  (map
   #(case %
    "NORTH" [1 0]
    "SOUTH" [-1 0]
    "EAST" [0 -1]
    "WEST" [0 1])
   directionsList))

(defn number-to-directions
  [numberPair]
  (let [x (numberPair 0)
        y (numberPair 1)]
    (concat
     (if (> x 0) (repeat x "NORTH"))
     (if (< x 0) (repeat x "SOUTH"))
     (if (> y 0) (repeat y "WEST"))
     (if (< y 0) (repeat y "EAST")))

    ))

(defn dirReduc
  "Take a list of directions and simplifies them to reduce number of necessary steps
  as much as possible"
  [directionsList]
  (let [directions-as-numbers (map-directions-to-numbers directionsList)
        result-as-numbers (reduce (fn [first second] [(+ (first 0) (second 0)) (+ (first 1) (second 1))])
          [0 0]
          directions-as-numbers)]
       (number-to-directions  result-as-numbers)
       ))
