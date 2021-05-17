(ns ch1)

;; chapter 1, Model your domains
(defrecord Planet [name
                   moons
                   volume
                   mass
                   aphelion
                   perihelion])

(def earth1
  (->Planet "Earth" 1 5.1 5.9 123 3231))

(def earth2
  (map->Planet {:name       "Earth"
                :moons      1
                :volume     5.1
                :mass       5.9
                :aphelion   123
                :perihelion 3231}))
