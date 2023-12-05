
(ns ugly-elements.breadcrumbs
    (:require [hiccup.api           :as hiccup]
              [random.api           :as random]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn crumb
  ; @ignore
  ;
  ; @param (keyword) breadcrumbs-id
  ; @param (map) breadcrumbs-props
  ; @param (integer) crumb-dex
  ; @param (map) crumb
  ; {:href (string)(opt)
  ;  :label (string)
  ;  :on-click (function)(opt)}
  [_ _ crumb-dex {:keys [href label on-click]}]
  (cond href     [:a      {:href     href}     [:pre {:class :ue-font--xs} (if (zero? crumb-dex) (str label) (str " | " label))]]
        on-click [:button {:on-click on-click} [:pre {:class :ue-font--xs} (if (zero? crumb-dex) (str label) (str " | " label))]]
        :else    [:div    {}                   [:pre {:class :ue-font--xs} (if (zero? crumb-dex) (str label) (str " | " label))]]))

(defn element
  ; @param (keyword)(opt) breadcrumbs-id
  ; @param (map) breadcrumbs-props
  ; {:crumbs (maps or symbols in vector)
  ;   [{:href (string)(opt)
  ;     :label (string)
  ;     :on-click (function)(opt)}]
  ;  :style (map)(opt)}
  ;
  ; @usage
  ; [breadcrumbs {...}]
  ;
  ; @usage
  ; [breadcrumbs :my-breadcrumbs {...}]
  ([breadcrumbs-props]
   [element (random/generate-keyword) breadcrumbs-props])

  ([breadcrumbs-id {:keys [crumbs style] :as breadcrumbs-props}]
   [:div {:class :ue-breadcrumbs
          :id    breadcrumbs-id
          :style style}
         (letfn [(f0 [%1 %2] [crumb breadcrumbs-id breadcrumbs-props %1 %2])]
                (hiccup/put-with-indexed [:<>] crumbs f0))]))
