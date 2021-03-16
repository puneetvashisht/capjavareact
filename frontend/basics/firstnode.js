const fs = require('fs');
// import java.io.*;

console.log('Hello world in NodeJS!!')


var content = fs.readFileSync('style.css');
console.log('Content: ' + content);