(ns shouter.controller.shouts
  (:use [compojure.core :only (defroutes GET POST)])
  (:require [clojure.string :as str]
            [ring.util.response :as ring]
            [shouter.views.shouts :as view]
            [shouter.model.shout :as model]))

(defn index []
  (views/index (model/all)))

(defn create [shout]
  (when-not (str/blank? shout)
    (model/create shoute))
  (ring/redirect "/"))

(defn route 
  (GET) "/" (index)
  (POST "/" [shout] (create shout)))
