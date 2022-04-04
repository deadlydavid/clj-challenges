(ns clj-challenges.4clojure
  (:require [clojure.set]))

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

(defn conj_on_vectors "https://4clojure.oxal.org/#/problem/7" []
  (let [result [1 2 3 4]]
  (and (= result (conj [1 2 3] 4))
       (= result (conj [1 2] 3 4))))) 

(defn sets "https://4clojure.oxal.org/#/problem/8" []
  (let [answer #{:a :b :c :d}]
    (and (= answer (set '(:a :a :b :c :c :c :c :d :d))) 
         (= answer (clojure.set/union #{:a :b :c} #{:b :c :d})))))

(defn conj_on_sets "https://4clojure.oxal.org/#/problem/9" []
  (= #{1 2 3 4} (conj #{1 4 3} 2)))

(defn maps "https://4clojure.oxal.org/#/problem/10" []
  (let [answer 20]
    (and (= answer ((hash-map :a 10, :b 20, :c 30) :b)) 
         (= answer (:b {:a 10, :b 20, :c 30})))))

(defn conj_on_maps "https://4clojure.oxal.org/#/problem/11" []
  (= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3])))

(defn sequences "https://4clojure.oxal.org/#/problem/12" []
  (let [__ 3]
    (and (= __ (first '(3 2 1))) 
         (= __ (second [2 3 4]))
         (= __ (last (list 1 2 3))))))

(defn clj-rest "https://4clojure.oxal.org/#/problem/13" []
  (= '(20 30 40) (rest [10 20 30 40])))

(defn functions "https://4clojure.oxal.org/#/problem/14" []
  (let [__ 8]
    (and (= __ ((fn add-five [x] (+ x 5)) 3)) 
         (= __ ((fn [x] (+ x 5)) 3))
         (= __ (#(+ % 5) 3))
         (= __ ((partial + 5) 3)))))
