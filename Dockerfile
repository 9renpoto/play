FROM hseeberger/scala-sbt:latest@sha256:469f66700793dfdb16735f194a7015caa124fc22990567f1e9337c5be76d3456
RUN mkdir /myapp
WORKDIR /myapp
ADD build.sbt build.sbt
ADD project project
RUN sbt compile
COPY . /myapp

CMD ["sbt", "run"]
