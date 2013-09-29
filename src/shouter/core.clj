(ns shouter.core
  (:use [compojure.core :only (defroutes GET)]
        [ring.adapter.jetty :as ring]))

(defroutes routes
  (GET "/" [] "<h2>HELLO WOLRLDLDL</h2>"))

(defn -main []
  (run-jetty #'routes {:port 8000 :join? false}))
