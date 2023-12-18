
# ugly-ui

### Overview

The <strong>ugly-ui</strong> library is a set of extremely simplified UI elements
and inputs designed for making developer tools in Clojure projects.

> UI components in this library are Reagent components. Check out the [Reagent Project](https://github.com/reagent-project/reagent).

### deps.edn

```
{:deps {pretty-project/ugly-ui {:git/url "https://github.com/pretty-project/ugly-ui"
                                :sha     "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"}}}
```

### Current version

Check out the latest commit on the [release branch](https://github.com/pretty-project/ugly-ui/tree/release).

### Documentation

The <strong>ugly-ui</strong> functional documentation is [available here](https://pretty-project.github.io/ugly-ui).

### Changelog

You can track the changes of the <strong>ugly-ui</strong> library [here](CHANGES.md).

# Usage

> Some parameters of the following functions and some further functions are not discussed in this file.
  To learn more about the available functionality, check out the [functional documentation](documentation/COVER.md)!

### Index

- [How to use Ugly UI elements?](#how-to-use-ugly-ui-elements)

- [Examples](#examples)

### How to use Ugly UI elements?

The only preparation that you have to do before using Ugly UI elements is that you must place
the `import-styles` component at the beginning of the scope where you want to use the elements.

```
(ns my-namespace
    (:require [ugly-elements.api :as ugly-elements]))

(defn my-ui
  []
  [:<> [ugly-elements/import-styles] ; <- Place the import-styles component once in your scope.
       [ugly-elements/label  {:content "My label"}]])
       [ugly-elements/button {:on-click #(...) :label "My button"}]
```

### Examples

With Ugly UI elements you can create such <i>beautiful</i> developer tools like this:

![sample1](https://github.com/pretty-project/ugly-ui/blob/release/resources/public/images/example1.png?raw=true)
