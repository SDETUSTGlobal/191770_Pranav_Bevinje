exports.config = {
  framework: 'jasmine', //Type of Framework used 
  directConnect:true, 
  specs: ['SmartTest.js'], //Name of the Specfile 
  onPrepare() { 
        require('ts-node').register({ 
        project: require('path').join(src, './tsconfig.json') // Relative path of tsconfig.json file 
    });
  } 
}