var http = require('http');
var nStatic = require('node-static');

const port = process.env.FRONTEND_PORT || 8080;
var fileServer = new nStatic.Server("./");

http.createServer(function (req, res) {
    fileServer.serve(req, res);
}).listen(port);