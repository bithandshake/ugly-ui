
(ns ugly-elements.scope
    (:require [css.api              :as css]
              [ugly-elements.styles :as styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn import-styles
  ; @usage
  ; (import-styles)
  []
  (let [icon-family-uri "https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"]
       [:<> [:link  {:item-prop "url" :rel "stylesheet" :type "text/css" :href icon-family-uri}]
            [:style {:rel "stylesheet" :type "text/css"}
                    (letfn [(f0 [classes class props] (str classes ".ue-" (name class) " { " (css/unparse props) " } "))]
                           (reduce-kv f0 "" styles/CLASSES))]]))
