const sendData = document.querySelector('#sendData');

const sendInfo = async() => {
    let response = await fetch('http://localhost:8080/asd/data');
    console.log(response);
    console.log("asd");
}

sendData.addEventListener('click', sendInfo);