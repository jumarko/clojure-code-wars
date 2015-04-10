(ns unpack)

(defn spread
  [func, args]
  (apply func args)
  )

;; following should return 15
(unpack/spread + [1 2 3 4 5])
