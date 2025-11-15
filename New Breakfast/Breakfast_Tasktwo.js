name = ["femi","hope","love", "lola", "ebu", "dayo"]

score = [84, 30, 80, 100, 85,72,]

combine = []
 
for(let i = 0; i < name.length; i++) {

if (score[i] > 80)
combine.push([name[i], score[i]]) 

}

 combine.sort((a, b) => b[1] - a[1]); 

for(let item of combine) {
console.log(item)
}
  









    