
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
              [ugly-elements.scope                :as scope]
              [ugly-elements.text-field           :as text-field]
              [ugly-elements.textarea             :as textarea]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (*/element)
(def badge                badge/element)
(def box                  box/element)
(def breadcrumbs          breadcrumbs/element)
(def button               button/element)
(def column               column/element)
(def horizontal-line      horizontal-line/element)
(def horizontal-separator horizontal-separator/element)
(def icon-button          icon-button/element)
(def label                label/element)
(def import-styles        scope/import-styles)
(def row                  row/element)
(def text-field           text-field/element)
(def textarea             textarea/element)
