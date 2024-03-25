
(ns ugly-elements.horizontal-line
    (:require [fruits.random.api :as random]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn view
  ; @param (keyword)(opt) id
  ; @param (map) props
  ; {:style (map)(opt)}
  ;
  ; @usage
  ; [horizontal-line {...}]
  ;
  ; @usage
  ; [horizontal-line :my-horizontal-line {...}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [style]}]
   [:div {:id id :style style
          :class [:ue-horizontal-line]}]))
