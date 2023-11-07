
(ns ugly-elements.row
    (:require [random.api           :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) row-id
  ; @param (map) row-props
  ; {:content (*)
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [row {...}]
  ;
  ; @usage
  ; [row :my-row {...}]
  ([row-props]
   [element (random/generate-keyword) row-props])

  ([row-id {:keys [content style]}]
   [:div {:class :ue-row
          :style style
          :id    row-id}
         (-> content)]))
