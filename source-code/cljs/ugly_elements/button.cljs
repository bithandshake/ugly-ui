
(ns ugly-elements.button
    (:require [fruits.random.api    :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) button-id
  ; @param (map) button-props
  ; {:content (*)
  ;  :disabled? (boolean)(opt)
  ;  :font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :s
  ;  :on-click (function)
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [button {...}]
  ;
  ; @usage
  ; [button :my-button {...}]
  ([button-props]
   [element (random/generate-keyword) button-props])

  ([button-id {:keys [content disabled? font-size on-click style] :or {font-size :s}}]
   [:button (if disabled? {:class [:ue-button :ue-disabled]     :id button-id :style style}
                          {:class :ue-button :on-click on-click :id button-id :style style})
            [:pre {:class (case font-size :xxs :ue-font--xxs :xs :ue-font--xs :m :ue-font--m :ue-font--s)}
                  (-> content)]]))
