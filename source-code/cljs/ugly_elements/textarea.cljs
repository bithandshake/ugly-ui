
(ns ugly-elements.textarea
    (:require [fruits.random.api    :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) textarea-id
  ; @param (map) textarea-props
  ; {:disabled? (boolean)(opt)
  ;  :label (string)
  ;  :on-change (function)
  ;  :placeholder (string)(opt)
  ;  :style (map)(opt)
  ;  :value (string)}
  ;
  ; @usage
  ; [textarea {...}]
  ;
  ; @usage
  ; [textarea :my-textarea {...}]
  ([textarea-props]
   [element (random/generate-keyword) textarea-props])

  ([textarea-id {:keys [disabled? label on-change placeholder style value]}]
   [:pre {:class :ue-font--s}
         [:textarea {:class       :ue-textarea
                     :id          textarea-id
                     :on-change   (fn [e] (-> e .-target .-value on-change))
                     :placeholder placeholder
                     :style       style
                     :value       value}]]))
