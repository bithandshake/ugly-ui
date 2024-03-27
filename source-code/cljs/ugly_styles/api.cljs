
(ns ugly-styles.api
    (:require [ugly-styles.class  :as class]
              [ugly-styles.import :as import]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (ugly-styles.class/*)
(def disabled-class    class/disabled-class)
(def fill-color-class  class/fill-color-class)
(def font-size-class   class/font-size-class)
(def height-class      class/height-class)
(def hover-color-class class/hover-color-class)
(def text-color-class  class/text-color-class)

; @redirect (ugly-styles.import/*)
(def import-styles import/import-styles)
