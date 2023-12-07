
(ns ugly-elements.icon-button
    (:require [fruits.random.api    :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) button-id
  ; @param (map) button-props
  ; {:disabled? (boolean)(opt)
  ;  :icon (keyword)
  ;  :label (string)
  ;  :on-click (function)
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [icon-button {...}]
  ;
  ; @usage
  ; [icon-button :my-icon-button {...}]
  ([button-props]
   [element (random/generate-keyword) button-props])

  ([button-id {:keys [disabled? icon label on-click style]}]
   [:button (if disabled? {:class [:ue-icon-button :ue-disabled]     :id button-id :style style}
                          {:class :ue-icon-button :on-click on-click :id button-id :style style})
            [:i   {:class [:ue-icon :material-symbols-outlined]} icon]
            [:pre {:class :ue-font--xs} label]]))
