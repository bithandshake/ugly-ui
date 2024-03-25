
(ns ugly-elements.badge
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
  ;   Default: :primary
  ;  :font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :xxs
  ;  :style (map)(opt)
  ;  :text-color (keyword)(opt)
  ;   :default, :muted, :highlight
  ;   Default: :default}
  ;
  ; @usage
  ; [badge {...}]
  ;
  ; @usage
  ; [badge :my-badge {...}]
  ;
  ; @usage
  ; [button {:content [:<> "My button" [badge {...}]]}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [content style] :as props}]
   [:pre {:id id :style style
          :class [:ue-badge (ugly-styles/fill-color-class props :primary)
                            (ugly-styles/font-size-class  props :xxs)
                            (ugly-styles/text-color-class props :default)]}
         (-> content)]))
