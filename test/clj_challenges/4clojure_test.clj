(ns clj-challenges.4clojure-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-challenges.4clojure]))

(deftest nothing_but_the_truth_test (testing "https://4clojure.oxal.org/#/problem/1"
    (is (true? (clj-challenges.4clojure/nothing_but_the_truth)))))

(deftest simple_math_test (testing "https://4clojure.oxal.org/#/problem/2"
    (is (true? (clj-challenges.4clojure/simple_math)))))

(deftest strings_test (testing "https://4clojure.oxal.org/#/problem/3"
    (is (true? (clj-challenges.4clojure/strings)))))

(deftest lists_test (testing "https://4clojure.oxal.org/#/problem/4"
    (is (true? (clj-challenges.4clojure/lists)))))

(deftest conj_on_lists_test (testing "https://4clojure.oxal.org/#/problem/5"
    (is (true? (clj-challenges.4clojure/conj_on_lists)))))

(deftest vectors_test (testing "https://4clojure.oxal.org/#/problem/6"
    (is (true? (clj-challenges.4clojure/vectors)))))

(deftest conj_on_vectors_test (testing "https://4clojure.oxal.org/#/problem/7"
    (is (true? (clj-challenges.4clojure/conj_on_vectors)))))

(deftest sets_test (testing "https://4clojure.oxal.org/#/problem/8"
    (is (true? (clj-challenges.4clojure/sets)))))

(deftest conj_on_sets_test (testing "https://4clojure.oxal.org/#/problem/9"
    (is (true? (clj-challenges.4clojure/conj_on_sets)))))

(deftest maps_test (testing "https://4clojure.oxal.org/#/problem/10"
    (is (true? (clj-challenges.4clojure/maps)))))

(deftest conj_on_maps_test (testing "https://4clojure.oxal.org/#/problem/11"
    (is (true? (clj-challenges.4clojure/conj_on_maps)))))

(deftest sequences_test (testing "https://4clojure.oxal.org/#/problem/12"
    (is (true? (clj-challenges.4clojure/sequences)))))

(deftest rest_test (testing "https://4clojure.oxal.org/#/problem/13"
    (is (true? (clj-challenges.4clojure/clj-rest)))))

(deftest functions_test (testing "https://4clojure.oxal.org/#/problem/14"
    (is (true? (clj-challenges.4clojure/functions)))))
