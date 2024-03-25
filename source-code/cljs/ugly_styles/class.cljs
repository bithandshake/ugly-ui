
(ns ugly-styles.class)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn disabled-class
  ; @param (map) props
  ; {:disabled? (boolean)(opt)}
  ; @param (boolean)(opt) default
  ;
  ; @usage
  ; (disabled-class {:disabled? true})
  ; =>
  ; :ue-disabled
  ;
  ; @return (keyword)
  [{:keys [disabled?]} & [default]]
  (if (or disabled? default) :ue-disabled))

(defn fill-color-class
  ; @param (map) props
  ; {:fill-color (keyword)(opt)}
  ; @param (keyword)(opt) default
  ;
  ; @usage
  ; (fill-color-class {:fill-color :primary})
  ; =>
  ; :ue-fill-color--primary
  ;
  ; @return (keyword)
  [{:keys [fill-color]} & [default]]
  (case (or fill-color default) :highlight :ue-fill-color--highlight
                                :muted     :ue-fill-color--muted
                                :primary   :ue-fill-color--primary
                                :secondary :ue-fill-color--secondary
                                :success   :ue-fill-color--success
                                :warning   :ue-fill-color--warning
                                :default   :ue-fill-color--default
                                           nil))

(defn font-size-class
  ; @param (map) props
  ; {:font-size (keyword)(opt)}
  ; @param (keyword)(opt) default
  ;
  ; @usage
  ; (font-size-class {:font-size :m})
  ; =>
  ; :ue-font-size--m
  ;
  ; @return (keyword)
  [{:keys [font-size]} & [default]]
  (case (or font-size default) :xxs :ue-font-size--xxs
                               :xs  :ue-font-size--xs
                               :s   :ue-font-size--s
                               :m   :ue-font-size--m
                                    nil))

(defn height-class
  ; @param (map) props
  ; {:height (keyword)(opt)}
  ; @param (keyword)(opt) default
  ;
  ; @usage
  ; (height-class {:height :m})
  ; =>
  ; :ue-height--m
  ;
  ; @return (keyword)
  [{:keys [height]} & [default]]
  (case (or height default) :xxs :ue-height--xxs
                            :xs  :ue-height--xs
                            :s   :ue-height--s
                            :m   :ue-height--m
                                 nil))

(defn hover-color-class
  ; @param (map) props
  ; {:hover-color (keyword)(opt)}
  ; @param (keyword)(opt) default
  ;
  ; @usage
  ; (hover-color-class {:hover-color :primary})
  ; =>
  ; :ue-hover-color--primary
  ;
  ; @return (keyword)
  [{:keys [disabled? hover-color]} & [default]]
  (if-not disabled? (case (or hover-color default) :highlight :ue-hover-color--highlight
                                                  :muted     :ue-hover-color--muted
                                                  :primary   :ue-hover-color--primary
                                                  :secondary :ue-hover-color--secondary
                                                  :success   :ue-hover-color--success
                                                  :warning   :ue-hover-color--warning
                                                  :default   :ue-hover-color--default
                                                             nil)))

(defn text-color-class
  ; @param (map) props
  ; {:text-color (keyword)(opt)}
  ; @param (keyword)(opt) default
  ;
  ; @usage
  ; (text-color-class {:text-color :muted})
  ; =>
  ; :ue-text-color--muted
  ;
  ; @return (keyword)
  [{:keys [text-color]} & [default]]
  (case (or text-color default) :highlight :ue-text-color--highlight
                                :muted     :ue-text-color--muted
                                :default   :ue-text-color--default
                                           nil))
