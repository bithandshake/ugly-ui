
(ns ugly-elements.api
    (:require [ugly-elements.badge                :as badge]
              [ugly-elements.box                  :as box]
              [ugly-elements.breadcrumbs          :as breadcrumbs]
              [ugly-elements.button               :as button]
              [ugly-elements.column               :as column]
              [ugly-elements.horizontal-line      :as horizontal-line]
              [ugly-elements.horizontal-separator :as horizontal-separator]
              [ugly-elements.icon-button          :as icon-button]
              [ugly-elements.label                :as label]
              [ugly-elements.row                  :as row]
              [ugly-elements.style-scope          :as style-scope]
              [ugly-elements.text-field           :as text-field]
              [ugly-elements.textarea             :as textarea]))
 
;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Demo
;
; @usage
; (defn my-ui
;   []
;   [:<> [style-scope]
;        [button {:content "My button"}]])

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (*/view)
(def badge                badge/view)
(def box                  box/view)
(def breadcrumbs          breadcrumbs/view)
(def button               button/view)
(def column               column/view)
(def horizontal-line      horizontal-line/view)
(def horizontal-separator horizontal-separator/view)
(def icon-button          icon-button/view)
(def label                label/view)
(def row                  row/view)
(def style-scope          style-scope/view)
(def text-field           text-field/view)
(def textarea             textarea/view)
