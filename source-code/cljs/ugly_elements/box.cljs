
(ns ugly-elements.box
    (:require [random.api           :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) box-id
  ; @param (map) box-props
  ; {:color (keyword)(opt)
  ;   :highlight, :muted, :default
  ;  :content (*)
  ;  :font-size (keyword)(opt)
  ;   :xs, :s, :m
  ;   Default: :s
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [box {...}]
  ;
  ; @usage
  ; [box :my-box {...}]
  ([box-props]
   [element (random/generate-keyword) box-props])

  ([box-id {:keys [color content font-size style] :or {font-size :s color :default}}]
   [:pre {:id    box-id
          :style style
          :class [:ue-box (case font-size :xs :ue-font--xs :m :ue-font--m :ue-font--s)
                          (case color :highlight :ue-color--highlight :muted :ue-color--muted :ue-color--default)]}
         (-> content)]))
