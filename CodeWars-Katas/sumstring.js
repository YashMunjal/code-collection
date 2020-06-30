function sumStrings(a,b) { 
    let num1 = a.replace(/^0*/g, "").split("").reverse()
    let num2 = b.replace(/^0*/g, "").split("").reverse()
    let spillOver = 0 
    let counter = 0 
    let sum = ""
    
    while(counter < num1.length || counter < num2.length){
      let tempSum = (parseInt(num1[counter]) || 0) + (parseInt(num2[counter]) || 0) + spillOver
      if(tempSum > 9){
        sum = `${tempSum - 10}` + sum 
        spillOver = 1 
      } else {
        sum = `${tempSum}` + sum
        spillOver = 0 
      }
      counter++
    }
    return spillOver ? `1${sum}` : sum
  }