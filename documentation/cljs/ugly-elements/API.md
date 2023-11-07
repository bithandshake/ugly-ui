
### ugly-elements.api

Functional documentation of the ugly-elements.api ClojureScript namespace

---

##### [README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > ugly-elements.api

### Index

- [box](#box)

- [breadcrumbs](#breadcrumbs)

- [button](#button)

- [column](#column)

- [horizontal-line](#horizontal-line)

- [horizontal-separator](#horizontal-separator)

- [icon-button](#icon-button)

- [import-styles](#import-styles)

- [label](#label)

- [row](#row)

- [textarea](#textarea)

- [toolbar](#toolbar)

---

### box

```
@param (keyword)(opt) box-id
@param (map) box-props
{:color (keyword)(opt)
  :highlight, :muted, :default
 :content (*)
 :font-size (keyword)(opt)
  :xs, :s, :m
  Default: :s
 :style (map)(opt)}
```

```
@usage
[box {...}]
```

```
@usage
[box :my-box {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([box-props]
   [element (random/generate-keyword) box-props])

  ([box-id {:keys [color content font-size style] :or {font-size :s color :default}}]
   [:pre {:id    box-id
          :style style
          :class [:ue-box (case font-size :xs :ue-font--xs :m :ue-font--m :ue-font--s)
                          (case color :highlight :ue-color--highlight :muted :ue-color--muted :ue-color--default)]}
         (-> content)]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [box]]))

(ugly-elements.api/box ...)
(box                   ...)
```

</details>

---

### breadcrumbs

```
@param (keyword)(opt) breadcrumbs-id
@param (map) breadcrumbs-props
{:crumbs (maps or symbols in vector)
  [{:href (string)(opt)
    :label (string)
    :on-click (function)(opt)}]
 :style (map)(opt)}
```

```
@usage
[breadcrumbs {...}]
```

```
@usage
[breadcrumbs :my-breadcrumbs {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([breadcrumbs-props]
   [element (random/generate-keyword) breadcrumbs-props])

  ([breadcrumbs-id {:keys [crumbs style] :as breadcrumbs-props}]
   [:div {:class :ue-breadcrumbs
          :id    breadcrumbs-id
          :style style}
         (letfn [(f [%1 %2] [crumb breadcrumbs-id breadcrumbs-props %1 %2])]
                (hiccup/put-with-indexed [:<>] crumbs f))]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [breadcrumbs]]))

(ugly-elements.api/breadcrumbs ...)
(breadcrumbs                   ...)
```

</details>

---

### button

```
@param (keyword)(opt) button-id
@param (map) button-props
{:disabled? (boolean)(opt)
 :font-size (keyword)(opt)
  :xs, :s, :m
  Default: :s
 :label (string)
 :on-click (function)
 :style (map)(opt)}
```

```
@usage
[button {...}]
```

```
@usage
[button :my-button {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([button-props]
   [element (random/generate-keyword) button-props])

  ([button-id {:keys [disabled? font-size label on-click style] :or {font-size :s}}]
   [:button (if disabled? {:class [:ue-button :ue-disabled]     :id button-id :style style}
                          {:class :ue-button :on-click on-click :id button-id :style style})
            [:pre {:class (case font-size :xs :ue-font--s :m :ue-font--m :ue-font--s)}
                  (-> label)]]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [button]]))

(ugly-elements.api/button ...)
(button                   ...)
```

</details>

---

### column

```
@param (keyword)(opt) column-id
@param (map) column-props
{:content (*)
 :style (map)(opt)}
```

```
@usage
[column {...}]
```

```
@usage
[column :my-column {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([column-props]
   [element (random/generate-keyword) column-props])

  ([column-id {:keys [content style]}]
   [:div {:class :ue-column
          :style style
          :id    column-id}
         (-> content)]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [column]]))

(ugly-elements.api/column ...)
(column                   ...)
```

</details>

---

### horizontal-line

```
@param (keyword)(opt) line-id
@param (map) line-props
{:style (map)(opt)}
```

```
@usage
[horizontal-line {...}]
```

```
@usage
[horizontal-line :my-horizontal-line {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([line-props]
   [element (random/generate-keyword) line-props])

  ([line-id {:keys [style]}]
   [:div {:class :ue-horizontal-line
          :id    line-id
          :style style}]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [horizontal-line]]))

(ugly-elements.api/horizontal-line ...)
(horizontal-line                   ...)
```

</details>

---

### horizontal-separator

```
@param (keyword)(opt) separator-id
@param (map) separator-props
{:height (keyword)(opt)
  :xs, :s, :m
  Default: :s
 :style (map)(opt)}
```

```
@usage
[horizontal-separator {...}]
```

```
@usage
[horizontal-separator :my-horizontal-separator {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([separator-props]
   [element (random/generate-keyword) separator-props])

  ([separator-id {:keys [height style] :or {height :s}}]
   [:div {:id    separator-id
          :style style
          :class (case height :xs :ue-horizontal-separator--xs
                              :m  :ue-horizontal-separator--m
                                  :ue-horizontal-separator--s)}]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [horizontal-separator]]))

(ugly-elements.api/horizontal-separator ...)
(horizontal-separator                   ...)
```

</details>

---

### icon-button

```
@param (keyword)(opt) button-id
@param (map) button-props
{:disabled? (boolean)(opt)
 :icon (keyword)
 :label (string)
 :on-click (function)
 :style (map)(opt)}
```

```
@usage
[icon-button {...}]
```

```
@usage
[icon-button :my-icon-button {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([button-props]
   [element (random/generate-keyword) button-props])

  ([button-id {:keys [disabled? icon label on-click style]}]
   [:button (if disabled? {:class [:ue-icon-button :ue-disabled]     :id button-id :style style}
                          {:class :ue-icon-button :on-click on-click :id button-id :style style})
            [:i   {:class [:ue-icon :material-symbols-outlined]} icon]
            [:pre {:class :ue-font--xs} label]]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [icon-button]]))

(ugly-elements.api/icon-button ...)
(icon-button                   ...)
```

</details>

---

### import-styles

```
@usage
(import-styles)
```

<details>
<summary>Source code</summary>

```
(defn import-styles
  []
  (let [icon-family-uri "https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"]
       [:<> [:link  {:item-prop "url" :rel "stylesheet" :type "text/css" :href icon-family-uri}]
            [:style {:rel "stylesheet" :type "text/css"}
                    (letfn [(f [classes class props] (str classes ".ue-" (name class) " { " (css/unparse props) " } "))]
                           (reduce-kv f "" styles/CLASSES))]]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [import-styles]]))

(ugly-elements.api/import-styles)
(import-styles)
```

</details>

---

### label

```
@param (keyword)(opt) label-id
@param (map) label-props
{:font-size (keyword)(opt)
  :xs, :s, :m
  Default: :s
 :color (keyword)(opt)
  :highlight, :muted, :default
  Default: :default
 :content (string)
 :style (map)(opt)}
```

```
@usage
[label {...}]
```

```
@usage
[label :my-label {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([label-props]
   [element (random/generate-keyword) label-props])

  ([label-id {:keys [color content font-size style] :or {color :default font-size :s}}]
   [:pre {:id    label-id
          :style style
          :class [:ue-label (case font-size :xs :ue-font--xs :m :ue-font--m :ue-font--s)
                            (case color :highlight :ue-color--highlight :muted :ue-color--muted :ue-color--default)]}
         (str content)]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [label]]))

(ugly-elements.api/label ...)
(label                   ...)
```

</details>

---

### row

```
@param (keyword)(opt) row-id
@param (map) row-props
{:content (*)
 :style (map)(opt)}
```

```
@usage
[row {...}]
```

```
@usage
[row :my-row {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([row-props]
   [element (random/generate-keyword) row-props])

  ([row-id {:keys [content style]}]
   [:div {:class :ue-row
          :style style
          :id    row-id}
         (-> content)]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [row]]))

(ugly-elements.api/row ...)
(row                   ...)
```

</details>

---

### textarea

```
@param (keyword)(opt) textarea-id
@param (map) textarea-props
{:disabled? (boolean)(opt)
 :label (string)
 :on-change (function)
 :style (map)(opt)
 :value (string)}
```

```
@usage
[textarea {...}]
```

```
@usage
[textarea :my-textarea {...}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([textarea-props]
   [element (random/generate-keyword) textarea-props])

  ([textarea-id {:keys [disabled? label on-change style value]}]
   [:pre {:class :ue-font--s}
         [:textarea {:class     :ue-textarea
                     :id        textarea-id
                     :on-change (fn [e] (-> e .-target .-value on-change))
                     :style     style
                     :value     value}]]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [textarea]]))

(ugly-elements.api/textarea ...)
(textarea                   ...)
```

</details>

---

### toolbar

```
@param (keyword)(opt) toolbar-id
@param (map) toolbar-props
{:buttons (maps in vector)
  [{:disabled? (boolean)(opt)
    :icon (keyword)
    :label (string)
    :on-click (function)}]
 :style (map)(opt)}
```

```
@usage
[toolbar {...}]
```

```
@usage
[toolbar :my-toolbar {...}]
```

```
@usage
[toolbar {:buttons [{:label "My button" :on-click #(...)}]}]
```

```
@usage
(defn my-button [] [icon-button {:label "My button" :on-click #(...)}])
[toolbar {:buttons [my-button, ...]}]
```

<details>
<summary>Source code</summary>

```
(defn element
  ([toolbar-props]
   [element (random/generate-keyword) toolbar-props])

  ([toolbar-id {:keys [buttons style]}]
   [:div {:class :ue-toolbar
          :id    toolbar-id
          :style style}
         (letfn [(f [%] (if (map? %) [icon-button/element %] [%]))]
                (hiccup/put-with [:<>] buttons f))]))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [ugly-elements.api :refer [toolbar]]))

(ugly-elements.api/toolbar ...)
(toolbar                   ...)
```

</details>

---

<sub>This documentation is generated with the [clj-docs-generator](https://github.com/bithandshake/clj-docs-generator) engine.</sub>

