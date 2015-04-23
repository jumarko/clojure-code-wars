(ns clojure-code-wars.bookseller)

(defn group-by-category [list-of-books]
  "Groups books by their categories.
   Category is the first letter of book code.
   Example: for input [\"ABC 100\", \"ABD 1100\", \"BCD 200\" ]
            this function returns {\"A\" 200, \"B\" 200}"
  (group-by #(first %) list-of-books))

(defn sumbooks [books-count-pairs-vec]
  "Accepts vector of books-count pairs such as ['ABC 100' 'ABA 200' 'ADE 1000']
   and produces the total sum of all books, such as 1300"
  (apply +
         (map
          #(Integer/valueOf (second (.split  % " ")))
           books-count-pairs-vec)))

(defn sum-by-category [list-of-books]
  "Given the sequence of \"book-code book-count \" pairs
   this function produces a map containing pairs {book-category total-books-count-in-category} "
  (let [books-by-category (group-by-category list-of-books)]
    (reduce (fn [altered-map [category books]]
              (assoc altered-map (str category)  (sumbooks books)))
            {} books-by-category)
    ))

(defn stock-list [list-of-books list-of-cat]
  (if (or (seq list-of-books) (seq list-of-cat))
    (let [books-sum-by-category (sum-by-category list-of-books)]
      (vec (map (fn [cat] [cat (get books-sum-by-category cat 0)]) list-of-cat)) )
      []  ;; some of input arguments is empty
    )
  )
