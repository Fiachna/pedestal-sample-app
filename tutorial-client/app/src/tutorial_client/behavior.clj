(ns ^:shared tutorial-client.behavior
    (:require [clojure.string :as string]
              [io.pedestal.app.messages :as msg]))

(def inc-transform [old-value _]
  ((fnil inc 0) old-value))

(def example-app
  {:version 2
   :transform [[:inc [:**] inc-transform]]})

