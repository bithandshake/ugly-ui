
(ns ugly-elements.text-field
    (:require [random.api           :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) field-id
  ; @param (map) field-props
  ; {:disabled? (boolean)(opt)
  ;  :label (string)
  ;  :on-change (function)
  ;  :placeholder (string)(opt)
  ;  :style (map)(opt)
  ;  :value (string)}
  ;
  ; @usage
  ; [text-field {...}]
  ;
  ; @usage
  ; [text-field :my-text-field {...}]
  ([field-props]
   [element (random/generate-keyword) field-props])

  ([field-id {:keys [disabled? label on-change placeholder style value]}]
   [:pre {:class :ue-font--s} (if label (str label " "))
         [:input {:class       :ue-text-field
                  :id          field-id
                  :on-change   (fn [e] (-> e .-target .-value on-change))
                  :placeholder placeholder
                  :style       style
                  :type        :text
                  :value       value}]]))
