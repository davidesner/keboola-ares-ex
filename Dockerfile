FROM maven:3
MAINTAINER David Esner <esnerda@gmail.com>

ENV APP_VERSION 1.1.0

RUN git clone https://github.com/davidesner/keboola-ares-ex.git ./  
RUN mvn compile

ENTRYPOINT mvn -q exec:java -Dexec.args=/data  