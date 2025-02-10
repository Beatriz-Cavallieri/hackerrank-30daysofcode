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

function findLargestNumber(arr) {
    let largest = arr[0];
    arr.forEach(number => {
        if (number > largest) largest = number;
    });

    return largest;
}

function main() {

    let arr = Array(6);
    let hourglasses = [];

    for (let i = 0; i < 6; i++) {
        arr[i] = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));
    }

    function getHourglassValue(i, j) {
        let sum = arr[i][j];

        sum += arr[i][j + 1];

        sum += arr[i][j + 2];

        sum += arr[i + 1][j + 1];

        for (let k = j; k <= j + 2; k++) {
            sum += arr[i + 2][k];
        }

        return sum;
    }

    for (let i = 0; i < 4; i++) {
        for (let j = 0; j < 4; j++) {
            let sum = getHourglassValue(i, j);
            hourglasses.push(sum);
        }
    }

    console.log(findLargestNumber(hourglasses));
}
