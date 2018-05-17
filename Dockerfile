FROM hseeberger/scala-sbt
RUN mkdir /myapp
WORKDIR /myapp
ADD build.sbt build.sbt
ADD project project
RUN sbt compile
COPY . /myapp

CMD ["sbt", "run"]
