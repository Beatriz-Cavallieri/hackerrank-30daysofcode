'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function (inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function () {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

function shortensZeroSequences(str) {
    return str.replace(/0+/g, "0");
}

function isolateSequencesOf1(str) {
    const sequences = shortensZeroSequences(str).split('0');
    return sequences;
}

function countLargestSequenceOf1(str) {
    const sequences = isolateSequencesOf1(str);

    var largest = 0;
    sequences.forEach(element => {
        if (element.length > largest) largest = element.length;
    });

    return largest;
}


function main() {
    const n = parseInt(readLine().trim(), 10);

    const binary = n.toString(2);

    const consecutive = countLargestSequenceOf1(binary);
    
    console.log(consecutive);

}
