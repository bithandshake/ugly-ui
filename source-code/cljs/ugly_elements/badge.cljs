
(ns ugly-elements.badge
    (:require [fruits.random.api    :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) badge-id
  ; @param (map) badge-props
  ; {:content (*)
  ;  :fill-color (keyword)(opt)
  ;   :highlight, :muted, :primary, :secondary, :success, :warning
  ;   Default: :primary
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [badge {...}]
  ;
  ; @usage
  ; [badge :my-badge {...}]
  ;
  ; @usage
  ; [button {:content [:<> "My button"
  ;                        [badge {...}]]}]
  ([badge-props]
   [element (random/generate-keyword) badge-props])

  ([badge-id {:keys [content fill-color style] :or {fill-color :primary}}]
   [:pre {:class [:ue-badge :ue-font--xxs (case fill-color :highlight :ue-fill-color--highlight :muted :ue-fill-color--muted :secondary :ue-fill-color--secondary :success :ue-fill-color--success :warning :ue-fill-color--warning :ue-fill-color--primary)]
          :id    badge-id
          :style style}
         (-> content)]))
