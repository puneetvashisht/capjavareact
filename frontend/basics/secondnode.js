var Url = require('url-parse');

var url = new Url('https://github.com/foo/bar');

console.log(url.protocol);