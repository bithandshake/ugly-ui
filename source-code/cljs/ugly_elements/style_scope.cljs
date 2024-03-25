
(ns ugly-elements.style-scope
    (:require [fruits.css.api :as css]
              [ugly-styles.api :as ugly-styles]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn view
  ; @usage
  ; [style-scope]
  []
  (let [icon-family-uri "https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"]
       [:<> [:link  {:item-prop "url" :rel "stylesheet" :type "text/css" :href icon-family-uri}]
            [:style {:rel "stylesheet" :type "text/css"}
                    (ugly-styles/import-styles)]]))
