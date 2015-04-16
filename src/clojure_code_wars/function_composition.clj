(ns clojure-code-wars.function-composition)

(defn compose [f g]
   (fn [& more] (f (apply g more))))
