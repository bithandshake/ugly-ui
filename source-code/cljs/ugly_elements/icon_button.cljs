
(ns ugly-elements.icon-button
    (:require [fruits.random.api :as random]
              [ugly-styles.api   :as ugly-styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn view
  ; @param (keyword)(opt) id
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  :fill-color (keyword)(opt)
  ;   :default, :highlight, :muted, :primary, :secondary, :success, :warning
  ;   Default: :default
  ;  :font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :xs
  ;  :hover-color (keyword)(opt)
  ;   :default, :highlight, :muted, :primary, :secondary, :success, :warning
  ;   Default: :highlight
  ;  :icon (keyword)(opt)
  ;  :label (string)(opt)
  ;  :on-click-f (function)(opt)
  ;  :style (map)(opt)
  ;  :text-color (keyword)(opt)
  ;   :default, :muted, :highlight
  ;   Default: :default}
  ;
  ; @usage
  ; [icon-button {...}]
  ;
  ; @usage
  ; [icon-button :my-icon-button {...}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [disabled? icon label on-click-f style] :as props}]
   [:button {:id id :style style :on-click (if-not disabled? on-click-f)
             :class [:ue-icon-button (ugly-styles/disabled-class    props)
                                     (ugly-styles/fill-color-class  props :default)
                                     (ugly-styles/hover-color-class props :highlight)
                                     (ugly-styles/font-size-class   props :xs)
                                     (ugly-styles/text-color-class  props :default)]}
            [:i   {:class [:ue-icon :material-symbols-outlined]} icon]
            [:pre {:class :ue-label} label]]))
