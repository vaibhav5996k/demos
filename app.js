//  const fs = require('fs');
//creating new file
//  fs.writeFile('example.txt', "this is simple example", (err) => {
//      if (err)
//          console.log(err);
//      else {
//          console.log('File successfully created');
//          fs.readFile('example.txt', 'utf8', (err, file) => {
//              if (err)
//                  console.log(err);
//              else
//                  console.log(file);
//          });
//      }

//  })

//rename file

//  fs.rename('example.txt', 'example2.txt', (err) => {
//      if (err)
//          console.log(err);
//      else
//          console.log('successfully renamed the file');
//  })

//  fs.appendFile('example2.txt', 'Some data being appended', (err) => {
//      if (err)
//          console.log(err); 
//      else
//          console.log('Successfully appended data to file');
//  })

//  fs.unlink('example2.txt', (err) => {
//      if (err)
//          console.log(err);
//      else
//          console.log('successfully deleted the file')
//  })

//  fs.mkdir('tutorial', (err) => {
//      if (err)
//          console.log(err);
//      else

//  });
//  fs.unlink('./tutorial/example.txt', (err) => {
//      if (err)
//          console.log(err);
//      else {
//          fs.rmdir('tutorial', (err) => {
//              if (err)
//                  console.log(err);
//              else
//                  console.log('successfully deleted the folder');
//          });
//      }
//  });



//  fs.readdir('example', (err, files) => {

//      if (err)
//          console.log(err);


//      else {
//          for (let file of files) {
//              fs.unlink('./example/' + file, (err) => {
//                  if (err)
//                      console.log(err);
//                  else {
//                      console.log('successfullydeleted file');

//                  }
//              });
//          }

//      }
//  });



// const fs = require('fs');
// const zlib = require('zlib');
// const gunzip = zlib.createGunzip();
// const readStream = fs.createReadStream('./example2.txt.gz')
// const writeStream = fs.createWriteStream('uncompressed.txt');
// readStream.pipe(gunzip).pipe(writeStream);


// const fs = require('fs');
// fs.readFile('./apt-cache', 'utf8', (err, file) => {
//     if (err)
//         console.log(err);
//     else {
//         console.log(file);
//     }
// });

// const readStream = fs.createReadStream('./apt-cache', 'utf8')
// readStream.on('data', (chunk) => {
//     console.log(chunk);
// });


// const http = require('http');
// const server = http.createServer((req, res) => {
//     if (req.url === '/') {
//         res.write('Hello World From Nodejs');
//         res.end();
//     } else {
//         res.write('using some other domain');
//         res.end();
//     }
// });
// server.listen('8000');


const http = require('http');
const fs = require('fs');
http.createServer((req, res) => {
    const readStream = fs.createReadStream('./example/wow.jpg');
    res.writeHead(200, { 'Content-type': 'image/jpg' });
    readStream.pipe(res);
}).listen(8000);