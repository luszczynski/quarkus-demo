FROM node:10-alpine

RUN mkdir /tmp/src

COPY . /tmp/src

RUN cd /tmp/src && npm install

WORKDIR /tmp/src

USER 1001

CMD ["/usr/local/bin/npm","start"]

