(ns skin-a-cat)

(defn sum
  ([x] (partial + x))
  ([x y] (+ x y)) )
