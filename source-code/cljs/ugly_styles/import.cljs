
(ns ugly-styles.import
    (:require [fruits.css.api :as css]
              [ugly-styles.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn import-styles
  ; @usage
  ; (import-styles)
  ; =>
  ; "..."
  ;
  ; @return (string)
  []
  (letfn [(f0 [classes class props] (str classes ".ue-" (name class) " { " (css/unparse props) " } "))]
         (reduce-kv f0 "" (merge styles/CLASSES
                                 styles/PRESETS))))
