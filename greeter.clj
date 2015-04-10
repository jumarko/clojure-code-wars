(ns person)

(defprotocol Greeter
  (greet [this other-name]))

(defrecord Person [name]
  Greeter
  (greet [this other-name]
    (str "Hi " other-name ", my name is " name)))
