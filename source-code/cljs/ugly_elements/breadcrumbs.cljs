
(ns ugly-elements.breadcrumbs
    (:require [fruits.hiccup.api    :as hiccup]
              [fruits.random.api    :as random]
              [ugly-styles.api :as ugly-styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn crumb
  ; @ignore
  ;
  ; @param (keyword) id
  ; @param (map) props
  ; @param (integer) dex
  ; @param (map) crumb
  ; {:href-uri (string)(opt)
  ;  :label (string)(opt)
  ;  :on-click-f (function)(opt)}
  [_ _ dex {:keys [href-uri label on-click-f]}]
  (cond href-uri   [:a      {:href     href-uri}   [:pre (if (zero? dex) (str label) (str " | " label))]]
        on-click-f [:button {:on-click on-click-f} [:pre (if (zero? dex) (str label) (str " | " label))]]
        :else      [:div    {}                     [:pre (if (zero? dex) (str label) (str " | " label))]]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn view
  ; @param (keyword)(opt) id
  ; @param (map) props
  ; {:crumbs (maps in vector)
  ;   [(map) crumb
  ;     {:href-uri (string)(opt)
  ;     :label (string)(opt)
  ;     :on-click-f (function)(opt)}]
  ;  :fill-color (keyword)(opt)
  ;   :default, :highlight, :muted, :primary, :secondary, :success, :warning
  ;   Default: :highlight
  ;  :font-size (keyword)(opt)
  ;   :xxs, :xs, :s, :m
  ;   Default: :xs
  ;  :style (map)(opt)
  ;  :text-color (keyword)(opt)
  ;   :default, :muted, :highlight
  ;   Default: :muted}
  ;
  ; @usage
  ; [breadcrumbs {...}]
  ;
  ; @usage
  ; [breadcrumbs :my-breadcrumbs {...}]
  ([props]
   [view (random/generate-keyword) props])

  ([id {:keys [crumbs style] :as props}]
   [:div {:id id :style style
          :class [:ue-breadcrumbs (ugly-styles/fill-color-class props :highlight)
                                  (ugly-styles/font-size-class  props :xs)
                                  (ugly-styles/text-color-class props :muted)]}
         (letfn [(f0 [%1 %2] [crumb id props %1 %2])]
                (hiccup/put-with-indexed [:<>] crumbs f0))]))
