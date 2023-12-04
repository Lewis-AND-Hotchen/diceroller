run:
	./mvnw install && make docker-build && make docker-run

docker-build:
	docker build -t myorg/myapp .

docker-run:
	docker run -p 8080:8080 myorg/myapp