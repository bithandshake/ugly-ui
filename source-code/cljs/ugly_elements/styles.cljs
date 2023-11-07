
(ns ugly-elements.styles)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @ignore
;
; @consant (map)
(def CLASSES {:badge                    {:padding          "3px 6px"
                                         :position         "absolute"
                                         :right            "0"
                                         :top              "0"}
              :box                      {:background-color "#f0f0f0"
                                         :padding          "6px"}
              :breadcrumbs              {:align-items      "center"
                                         :background-color "#f0f0f0"
                                         :color            "#888"
                                         :display          "flex"
                                         :flex-shrink      "0"
                                         :height           "42px"
                                         :padding          "6px"}
              :button                   {:display          "block"
                                         :flex-grow        "1"
                                         :text-align       "left"}
              :button:hover             {:background-color "#f0f0f0"}
              :color--highlight         {:color            "#aaa"}
              :color--muted             {:color            "#888"}
              :color--default           {:color            "#222"}
              :column                   {:display          "flex"
                                         :flex-direction   "column"}
              :disabled                 {:cursor           "default"
                                         :opacity          ".5"}
              :fill-color--highlight    {:background-color "#f0f0f0"}
              :fill-color--muted        {:background-color "#d0d0d0"}
              :fill-color--default      {:background-color "#ffffff"}
              :fill-color--primary      {:background-color "#bbccff"}
              :fill-color--secondary    {:background-color "#ccbbff"}
              :fill-color--success      {:background-color "#bbffcc"}
              :fill-color--warning      {:background-color "#ffbbcc"}
              :font--xxs                {:font-size        "10px"
                                         :line-height      "14px"}
              :font--xs                 {:font-size        "12px"
                                         :line-height      "16px"}
              :font--s                  {:font-size        "14px"
                                         :line-height      "20px"}
              :font--m                  {:font-size        "18px"
                                         :line-height      "24px"}
              :horizontal-line          {:border           "1px dashed #ddd"
                                         :height           "1px"
                                         :width            "100%"}
              :horizontal-separator--xs {:height           "6px"}
              :horizontal-separator--s  {:height           "12px"}
              :horizontal-separator--m  {:height           "24px"}
              :icon                     {:display          "flex"
                                         :align-items      "center"
                                         :justify-content  "center"
                                         :font-size        "24px"
                                         :font-weight      "200"}
              :icon-button              {:align-items      "center"
                                         :display          "flex"
                                         :flex-direction   "column"
                                         :height           "60px"
                                         :justify-content  "center"
                                         :user-select      "none"
                                         :width            "60px"}
              :icon-button:hover        {:background-color "#f0f0f0"}
              :label                    {:display          "flex"
                                         :align-items      "center"}
              :row                      {:display          "flex"}
              :text-field               {:background-color "#f0f0f0"
                                         :padding          "6px"
                                         :width            "100%"}
              :textarea                 {:background-color "#f0f0f0"
                                         :padding          "6px"
                                         :width            "100%"}
              :toolbar                  {}})
