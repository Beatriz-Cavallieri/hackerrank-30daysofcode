

const AgeMessages = Object.freeze({
    YOUNG: "You are young.",
    TEEN: "You are a teenager.",
    OLD: "You are old.",
})

function Person(initialAge){
    
    // Add some more code to run some checks on initialAge
    if (initialAge < 0 ){
        this.age = 0;
        console.log("Age is not valid, setting age to 0.")
    } else {
        this.age = initialAge;
    }

  this.amIOld=function(){
   // Do some computations in here and print out the correct statement to the console
   var ageRange
   if (this.age < 13) {
    ageRange = "YOUNG";
   } else if (this.age < 18) {
    ageRange = "TEEN";
   } else ageRange = "OLD";
   console.log(AgeMessages[ageRange])
  };
   this.yearPasses=function(){
          // Increment the age of the person in here
          this.age += 1;
   };
}

