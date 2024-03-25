
(ns ugly-elements.column
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
  ;   Default: :default
  ;  :font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :s
  ;  :style (map)(opt)
  ;  :text-color (keyword)(opt)
  ;   :default, :muted, :highlight
  ;   Default: :default}
  ;
  ; @usage
  ; [column {...}]
  ;
  ; @usage
  ; [column :my-column {...}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [content style] :as props}]
   [:div {:id id :style style
          :class [:ue-column (ugly-styles/fill-color-class props :default)
                             (ugly-styles/font-size-class  props :s)
                             (ugly-styles/text-color-class props :default)]}
         (-> content)]))
