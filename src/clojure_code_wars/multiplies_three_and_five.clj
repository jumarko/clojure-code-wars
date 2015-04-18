(ns clojure-code-wars.multiplies-three-and-five)

(defn solution [upper-bound]
  "Find sum of all multiplies of 3 and five strictly lower than given upper-bound."
  (let [multiplies-of-three-or-five (for [x (range upper-bound) :when (or (zero? (mod x 3)) (zero? (mod x 5)))] x)]
      (apply + multiplies-of-three-or-five)
    )
  )
