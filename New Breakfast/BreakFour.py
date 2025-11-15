def display(month):

    months = ["january", "febuary", "march",
                  "april", "may", "june",
                  "july", "august", "september",
                  "october", "november", "december"];

    month = month.lower();

    for i in range(len(months)):

        if month == months[i]:

            if (i < 3): 
                return month + " is firstQuarter";
            
            elif (i < 6): 
                return month + " is secondQuarter";
            
            elif (i < 9):
                return month + " is thirdQuarter";
            
            else:
                return month + " is fourthQuarter";
            


month = "may";
result = display(month);
print(result);
