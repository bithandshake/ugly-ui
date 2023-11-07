
(ns ugly-elements.toolbar
    (:require [hiccup.api                :as hiccup]
              [random.api                :as random]
              [ugly-elements.icon-button :as icon-button]
              [ugly-elements.styles      :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn element
  ; @param (keyword)(opt) toolbar-id
  ; @param (map) toolbar-props
  ; {:buttons (maps in vector)
  ;   [{:disabled? (boolean)(opt)
  ;     :icon (keyword)
  ;     :label (string)
  ;     :on-click (function)}]
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [toolbar {...}]
  ;
  ; @usage
  ; [toolbar :my-toolbar {...}]
  ;
  ; @usage
  ; [toolbar {:buttons [{:label "My button" :on-click #(...)}]}]
  ;
  ; @usage
  ; (defn my-button [] [icon-button {:label "My button" :on-click #(...)}])
  ; [toolbar {:buttons [my-button, ...]}]
  ([toolbar-props]
   [element (random/generate-keyword) toolbar-props])

  ([toolbar-id {:keys [buttons style]}]
   [:div {:class :ue-toolbar
          :id    toolbar-id
          :style style}
         (letfn [(f [%] (if (map? %) [icon-button/element %] [%]))]
                (hiccup/put-with [:<>] buttons f))]))
