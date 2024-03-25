
(ns ugly-styles.styles)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @ignore
;
; @consant (map)
(def CLASSES {:badge                    {:padding          "3px 6px"
                                         :position         "absolute"
                                         :right            "0"
                                         :top              "0"}
              :box                      {:padding          "6px"}
              :breadcrumbs              {:align-items      "center"
                                         :display          "flex"
                                         :flex-shrink      "0"
                                         :height           "42px"
                                         :padding          "6px"}
              :button                   {:display          "block"
                                         :flex-grow        "1"
                                         :text-align       "left"}
              :column                   {:display          "flex"
                                         :flex-direction   "column"}
              :disabled                 {:cursor           "default"
                                         :opacity          ".5"}
              :horizontal-line          {:border           "1px dashed #ddd"
                                         :height           "1px"
                                         :width            "100%"}
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
              :label                    {:display          "flex"
                                         :align-items      "center"}
              :row                      {:display          "flex"}
              :text-field               {:padding          "6px"
                                         :width            "100%"}
              :textarea                 {:padding          "6px"
                                         :width            "100%"}
              :toolbar                  {}})

(def PRESETS {:fill-color--highlight        {:background-color "#f0f0f0"}
              :fill-color--muted            {:background-color "#d0d0d0"}
              :fill-color--default          {:background-color "#ffffff"}
              :fill-color--primary          {:background-color "#bbccff"}
              :fill-color--secondary        {:background-color "#ccbbff"}
              :fill-color--success          {:background-color "#bbffcc"}
              :fill-color--warning          {:background-color "#ffbbcc"}
              :hover-color--highlight:hover {:background-color "#f0f0f0"}
              :hover-color--muted:hover     {:background-color "#d0d0d0"}
              :hover-color--default:hover   {:background-color "#ffffff"}
              :hover-color--primary:hover   {:background-color "#bbccff"}
              :hover-color--secondary:hover {:background-color "#ccbbff"}
              :hover-color--success:hover   {:background-color "#bbffcc"}
              :hover-color--warning:hover   {:background-color "#ffbbcc"}
              :text-color--highlight        {:color            "#aaa"}
              :text-color--muted            {:color            "#888"}
              :text-color--default          {:color            "#222"}
              :font-size--xxs               {:font-size        "10px"
                                             :line-height      "14px"}
              :font-size--xs                {:font-size        "12px"
                                             :line-height      "16px"}
              :font-size--s                 {:font-size        "14px"
                                             :line-height      "20px"}
              :font-size--m                 {:font-size        "18px"
                                             :line-height      "24px"}
              :height--xxs                  {:height           "6px"}
              :height--xs                   {:height           "12px"}
              :height--s                    {:height           "24px"}
              :height--m                    {:height           "48px"}})
