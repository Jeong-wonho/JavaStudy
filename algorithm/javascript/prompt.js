//prompt에 대해서 알아보자

let inputString = prompt("문자열을 입력하세요", "기본값 문자열");

const element = document.getElementById("answer");
console.log(inputString);
element.textContent = inputString;
