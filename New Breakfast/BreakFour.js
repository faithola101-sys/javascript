function display(month) {

    let months = ["january", "febuary", "march",
                  "april", "may", "june",
                  "july", "august", "september",
                  "october", "november", "december"];

    month = month.toLowerCase();

    for (let i = 0; i < months.length; i++) {

        if (month === months[i]) {

            if (i < 3) {
                return month + " is firstQuarter";
            }
            else if (i < 6) {
                return month + " is secondQuarter";
            }
            else if (i < 9) {
                return month + " is thirdQuarter";
            }
            else {
                return month + " is fourthQuarter";
            }
        }
    }

    return "invalid";
}


let month = "may";
let result = display(month);
console.log(result);
