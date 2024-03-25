
(ns ugly-elements.button
    (:require [fruits.random.api    :as random]
              [ugly-styles.api :as ugly-styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn view
  ; @param (keyword)(opt) id
  ; @param (map) props
  ; {:content (*)(opt)
  ;  :disabled? (boolean)(opt)
  ;  :fill-color (keyword)(opt)
  ;   :default, :highlight, :muted, :primary, :secondary, :success, :warning
  ;   Default: :default
  ;  :font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :s
  ;  :hover-color (keyword)(opt)
  ;   :default, :highlight, :muted, :primary, :secondary, :success, :warning
  ;   Default: :highlight
  ;  :on-click-f (function)(opt)
  ;  :style (map)(opt)
  ;  :text-color (keyword)(opt)
  ;   :default, :muted, :highlight
  ;   Default: :default}
  ;
  ; @usage
  ; [button {...}]
  ;
  ; @usage
  ; [button :my-button {...}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [content disabled? on-click-f style] :as props}]
   [:button {:id id :style style :on-click (if-not disabled? on-click-f)
             :class [:ue-button (ugly-styles/disabled-class    props)
                                (ugly-styles/fill-color-class  props :default)
                                (ugly-styles/hover-color-class props :highlight)
                                (ugly-styles/font-size-class   props :s)
                                (ugly-styles/text-color-class  props :default)]}
            [:pre (-> content)]]))
