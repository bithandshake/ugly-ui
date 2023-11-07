
(ns ugly-elements.horizontal-line
    (:require [random.api           :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) line-id
  ; @param (map) line-props
  ; {:style (map)(opt)}
  ;
  ; @usage
  ; [horizontal-line {...}]
  ;
  ; @usage
  ; [horizontal-line :my-horizontal-line {...}]
  ([line-props]
   [element (random/generate-keyword) line-props])

  ([line-id {:keys [style]}]
   [:div {:class :ue-horizontal-line
          :id    line-id
          :style style}]))
