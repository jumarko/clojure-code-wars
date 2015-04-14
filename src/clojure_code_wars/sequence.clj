(ns clojure-code-wars.sequence)

(defn nth-term
  "Returns nth term  in arithmetic sequence given by first element and constant c."
  [first n c ]
  (+ first (* n c)))

(nth-term 2 2 2)

(defn element-at
  [list n]
  (if (< n 2) (first list)
      (element-at (rest list) (dec n))))

(element-at [1 2 3] 0)
(element-at [1 2 3] 1)
(element-at [1 2 3] 2)
(element-at [1 2 3] 3)
(element-at [1 2 3] 4)

(element-at [1 9 13 1 99 9 9 13] 5)
