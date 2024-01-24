FROM openjdk:17
COPY . /java
WORKDIR /java
RUN javac ItBcampApiApplication.java
CMD ["java", "ItBcampApiApplication"]