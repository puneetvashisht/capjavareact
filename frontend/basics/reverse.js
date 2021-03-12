function reverse(){
    console.log('reverse called on click event')
    var str = document.getElementById("message").innerText
    var revStr = str.split('').reverse().join('');
    document.getElementById("message").innerText = revStr; 
}