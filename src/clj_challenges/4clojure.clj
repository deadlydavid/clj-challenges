(ns clj-challenges.4clojure)

(defn nothing_but_the_truth "https://4clojure.oxal.org/#/problem/1" []
  (= true true))

(defn simple_math "https://4clojure.oxal.org/#/problem/2" []
  (= (- 10 (* 2 3)) 4))

(defn strings "https://4clojure.oxal.org/#/problem/3" []
  (= "HELLO WORLD" (.toUpperCase "hello world")))

(defn lists "https://4clojure.oxal.org/#/problem/4" []
  (= (list :a :b :c) '(:a :b :c)))

(defn conj_on_lists "https://4clojure.oxal.org/#/problem/5" []
  (and (= '(1 2 3 4) (conj '(2 3 4) 1)) 
       (= '(1 2 3 4) (conj '(3 4) 2 1))))

(defn vectors "https://4clojure.oxal.org/#/problem/6" []
  (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))
