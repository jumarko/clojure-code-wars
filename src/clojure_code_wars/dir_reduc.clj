(ns clojure-code-wars.dir-reduc)

(defn reducible?
  [x y]
  (cond
    (and (= x "NORTH") (= y "SOUTH")) true
    (and (= x "SOUTH") (= y "NORTH")) true
    (and (= x "WEST") (= y "EAST")) true
    (and (= x "EAST") (= y "WEST")) true
    :else false )
  )


(defn dirReduc
  "Take a list of directions and simplifies them to reduce number of necessary steps
   as much as possible"
  [directionsList]
  (loop [procDirs []
         newDirs (vec directionsList)]
    (if (empty? newDirs)
      procDirs
      (let [lastProc (last procDirs)
            firstNew (first newDirs)]
        (if (reducible? lastProc firstNew)
          (recur (vec (drop-last procDirs))  (vec (rest newDirs)) )
          (recur (vec (conj procDirs (first newDirs)))  (vec (rest newDirs)) )
         )))
    )
  )
