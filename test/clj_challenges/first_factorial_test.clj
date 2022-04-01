(ns clj-challenges.first-factorial-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-challenges.first-factorial]))

(deftest zero_is_zero
  (testing "zero gives result zero"
    (is (= 0 (clj-challenges.first-factorial/FirstFactorial 0)))))

(deftest test_nil_returnsZero
  (testing "nil input gives zero as output"
    (is (= 0 (clj-challenges.first-factorial/FirstFactorial nil)))))

(deftest test_one_returns_one
  (testing "1 as input gives 1 as output"
    (is (= 1 (clj-challenges.first-factorial/FirstFactorial 1)))))

(deftest test_two_returns_2
  (testing "2 as input gives 2 as output"
    (is (= 2 (clj-challenges.first-factorial/FirstFactorial 2)))))

(deftest test_not_a_number_gives_output_zero
  (testing
    (is (= 0 (clj-challenges.first-factorial/FirstFactorial "no strings are allowed")))))

(deftest test_that_higher_numbers_do_the_factorial
  (testing
    (is (= (* 1 2 3 4) (clj-challenges.first-factorial/FirstFactorial 4)))))
