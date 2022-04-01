(ns clj-challenges.first-factorial (:gen-class))

(defn FirstFactorial [num]
  (if (or (nil? num)
          (not (number? num))
          (= 0 num))
    0
    (reduce * (range 1 (inc num)))))
