(ns clojure-code-wars.unpack)

(defn spread
  [func, args]
  (apply func args)
  )

;; following should return 15
(clojure-code-wars.unpack/spread + [1 2 3 4 5])
