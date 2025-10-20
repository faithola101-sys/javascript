let num1 = parseInt(prompt("Enter first number: "))

let num2 = parseInt(prompt("Enter second number: "))

let min = num1 < num2 ? num1 : num2

for(let i = 1; i < min; i++)

if (num1 % i == 0 && num2 % i == 0)


console.log (i)