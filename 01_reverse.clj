(ns reverse
  (:refer-clojure :exclude [reverse]))

(defn reverse
  "Reverse a list"
  [lst]
  (if (empty? lst) []
      (cons (last lst) (reverse (drop-last lst) )))
)

(reverse [1 2 3])

;; for best implementation check (source reverse)
;;   conj () coll)
