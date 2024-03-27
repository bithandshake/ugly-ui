
(ns ugly-elements.text-field
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
  ;   Default: :highlight
  ;  :font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :s
  ;  :label (string)(opt)
  ;  :on-change-f (function)(opt)
  ;  :style (map)(opt)
  ;  :text-color (keyword)(opt)
  ;   :default, :muted, :highlight
  ;   Default: :default
  ;  :value (string)(opt)}
  ;
  ; @usage
  ; [text-field {...}]
  ;
  ; @usage
  ; [text-field :my-text-field {...}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [disabled? label on-change-f placeholder style value] :as props}]
   [:pre {:class :ue-font-size--s} (if label (str label " "))
         [:input {:id id :placeholder placeholder :style style :type :text :value value
                  :on-change (if-not disabled? (fn [e] (-> e .-target .-value on-change-f)))
                  :class [:ue-text-field (ugly-styles/disabled-class   props)
                                         (ugly-styles/fill-color-class props :highlight)
                                         (ugly-styles/font-size-class  props :s)
                                         (ugly-styles/text-color-class props :default)]}]]))
