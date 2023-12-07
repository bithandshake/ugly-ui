
(ns ugly-elements.label
    (:require [fruits.random.api    :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) label-id
  ; @param (map) label-props
  ; {:font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :s
  ;  :color (keyword)(opt)
  ;   :highlight, :muted, :default
  ;   Default: :default
  ;  :content (*)
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [label {...}]
  ;
  ; @usage
  ; [label :my-label {...}]
  ([label-props]
   [element (random/generate-keyword) label-props])

  ([label-id {:keys [color content font-size style] :or {color :default font-size :s}}]
   [:pre {:id    label-id
          :style style
          :class [:ue-label (case font-size :xxs :ue-font--xxs :xs :ue-font--xs :m :ue-font--m :ue-font--s)
                            (case color :highlight :ue-color--highlight :muted :ue-color--muted :ue-color--default)]}
         (-> content)]))
