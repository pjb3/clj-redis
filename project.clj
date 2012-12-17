(defproject org.clojars.pjb3/clj-redis "0.0.15"
  :description "Clojure Redis client library"
  :url "https://github.com/pjb3/clj-redis"
  :dependencies [[org.clojure/clojure "[1.2.0,1.3.0,1.4.0]"]
                 [redis.clients/jedis "1.5.2"]]
  :multi-deps {"1.4" [[org.clojure/clojure "1.4.0"]
                      [redis.clients/jedis "1.5.2"]]
               "1.3" [[org.clojure/clojure "1.3.0"]
                      [redis.clients/jedis "1.5.2"]]
               "1.2" [[org.clojure/clojure "1.2.1"]
                      [redis.clients/jedis "1.5.2"]]}
  :dev-deps [[lein-multi "1.0.0"]])
