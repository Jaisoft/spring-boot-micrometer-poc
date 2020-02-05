# spring-boot-micrometer-poc

docker pull prom/prometheus:latest

docker run -d -p 9090:9090 -v /Users/jaimeg/Documents/prometheus/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
