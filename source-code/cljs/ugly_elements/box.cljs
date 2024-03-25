
(ns ugly-elements.box
    (:require [fruits.random.api :as random]
              [ugly-styles.api :as ugly-styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn view
  ; @param (keyword)(opt) id
  ; @param (map) props
  ; {:content (*)(opt)
  ;  :fill-color (keyword)(opt)
  ;   :default, :highlight, :muted, :primary, :secondary, :success, :warning
  ;   Default: :highlight
  ;  :font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :xxs
  ;  :style (map)(opt)
  ;  :text-color (keyword)(opt)
  ;   :default, :muted, :highlight
  ;   Default: :default}
  ;
  ; @usage
  ; [box {...}]
  ;
  ; @usage
  ; [box :my-box {...}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [content style] :as props}]
   [:pre {:id id :style style
          :class [:ue-box (ugly-styles/fill-color-class props :highlight)
                          (ugly-styles/font-size-class  props :s)
                          (ugly-styles/text-color-class props :default)]}
         (-> content)]))
