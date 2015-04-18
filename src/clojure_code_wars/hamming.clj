(ns clojure-code-wars.hamming)

(defn get-first-char-distance [first-word second-word]
 (if (= (first first-word) (first second-word))
         0
         1))

(defn hamming [a b]
  (loop [distance 0 first-word a second-word b]
    (if (and (empty? first-word) (empty? second-word))
      distance
      (recur
       ;; compute new distance
       (+ distance (get-first-char-distance first-word second-word))
       (rest first-word)
       (rest second-word)))))

;;; Follows a shorter and clearer solution:
(defn hamming2
  [a b]
  (count (filter false? (map = a b))))
