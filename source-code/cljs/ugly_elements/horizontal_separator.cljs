
(ns ugly-elements.horizontal-separator
    (:require [fruits.random.api    :as random]
              [ugly-styles.api :as ugly-styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn view
  ; @param (keyword)(opt) id
  ; @param (map) props
  ; {:height (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :s
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [horizontal-separator {...}]
  ;
  ; @usage
  ; [horizontal-separator :my-horizontal-separator {...}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [style] :as props}]
   [:div {:id id :style style
          :class [:ue-horizontal-separator (ugly-styles/height-class props :s)]}]))
