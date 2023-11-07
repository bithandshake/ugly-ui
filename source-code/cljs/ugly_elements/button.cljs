
(ns ugly-elements.button
    (:require [random.api           :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) button-id
  ; @param (map) button-props
  ; {:disabled? (boolean)(opt)
  ;  :font-size (keyword)(opt)
  ;   :xs, :s, :m
  ;   Default: :s
  ;  :label (string)
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

  ([button-id {:keys [disabled? font-size label on-click style] :or {font-size :s}}]
   [:button (if disabled? {:class [:ue-button :ue-disabled]     :id button-id :style style}
                          {:class :ue-button :on-click on-click :id button-id :style style})
            [:pre {:class (case font-size :xs :ue-font--s :m :ue-font--m :ue-font--s)}
                  (-> label)]]))
