
(ns ugly-elements.label
    (:require [fruits.random.api    :as random]
              [ugly-styles.api :as ugly-styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn view
  ; @param (keyword)(opt) id
  ; @param (map) props
  ; {:content (*)(opt)
  ;  :font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :s
  ;  :style (map)(opt)
  ;  :text-color (keyword)(opt)
  ;   :default, :muted, :highlight
  ;   Default: :default}
  ;
  ; @usage
  ; [label {...}]
  ;
  ; @usage
  ; [label :my-label {...}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [content style] :as props}]
   [:pre {:id id :style style
          :class [:ue-label (ugly-styles/font-size-class  props :s)
                            (ugly-styles/text-color-class props :default)]}
         (-> content)]))
