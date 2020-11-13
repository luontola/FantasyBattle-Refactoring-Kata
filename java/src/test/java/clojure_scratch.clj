(ns clojure-scratch
  (:require [clojure.test :refer :all]))

(let [player {:player/inventory {:inventory/equipment {:equipment/left-hand {}
                                                       :equipment/right-hand {}
                                                       :equipment/head {}
                                                       :equipment/feet {}
                                                       :equipment/chest {}}}
              :player/stats {}}
      player (assoc-in player [:player/inventory :intentory/equipment :equipment/left-hand] {:item/name "thing"
                                                                                             :item/base-damage 10
                                                                                             :item/damage-modifier 1.0})
      player (update-in player [:player/inventory :intentory/equipment] update-the-equipment)])
