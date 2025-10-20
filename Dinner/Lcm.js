let num1 = parseInt(prompt("Enter first number: "));
let num2 = parseInt(prompt("Enter second number: "));

let lcm;
let max = num1 > num2 ? num1 : num2;

for (let i = max; i >= max; i++)
    if (i % num1 === 0 && i % num2 === 0) {
        lcm = i;
        break;
    }

console.log(lcm);