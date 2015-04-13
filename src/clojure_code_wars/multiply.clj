(ns multiply.bug.fix)

;; following need to be fixed
(defn multiply [a b]
  (a * b))

;; fixed version
(defn multiply [a b]
  (* a b))
