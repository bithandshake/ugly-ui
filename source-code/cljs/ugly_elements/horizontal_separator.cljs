
(ns ugly-elements.horizontal-separator
    (:require [fruits.random.api    :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) separator-id
  ; @param (map) separator-props
  ; {:height (keyword)(opt)
  ;   :xs, :s, :m
  ;   Default: :s
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [horizontal-separator {...}]
  ;
  ; @usage
  ; [horizontal-separator :my-horizontal-separator {...}]
  ([separator-props]
   [element (random/generate-keyword) separator-props])

  ([separator-id {:keys [height style] :or {height :s}}]
   [:div {:id    separator-id
          :style style
          :class (case height :xs :ue-horizontal-separator--xs
                              :m  :ue-horizontal-separator--m
                                  :ue-horizontal-separator--s)}]))
