
(ns ugly-elements.column
    (:require [fruits.random.api    :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) column-id
  ; @param (map) column-props
  ; {:content (*)
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [column {...}]
  ;
  ; @usage
  ; [column :my-column {...}]
  ([column-props]
   [element (random/generate-keyword) column-props])

  ([column-id {:keys [content style]}]
   [:div {:class :ue-column
          :style style
          :id    column-id}
         (-> content)]))
