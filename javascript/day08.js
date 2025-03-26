function processData(input) {
    const inputAsArray = input.split('\n');
    const numEntries = inputAsArray.splice(0,1)[0];
    const entries = inputAsArray.splice(0, numEntries);
    const queries = inputAsArray;
    const phoneBook = new Map();
    
    function notFound() {
        console.log("Not found");
    }
    
    function addPhoneNumber(entry) {
        const [name, phoneNumber] = entry.split(' ');
        phoneBook.set(name, phoneNumber);
    }
    
    function findPhoneNumber(person) {
        if (phoneBook.has(person)) {
            console.log(person + "=" + phoneBook.get(person));
        } else {
            notFound();
        }
    }
    
    entries.forEach(addPhoneNumber);
    queries.forEach(findPhoneNumber);
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
