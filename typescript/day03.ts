'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString: string = '';
let inputLines: string[] = [];
let currentLine: number = 0;

process.stdin.on('data', function(inputStdin: string): void {
    inputString += inputStdin;
});

process.stdin.on('end', function(): void {
    inputLines = inputString.split('\n');
    inputString = '';

    main();
});

function readLine(): string {
    return inputLines[currentLine++];
}

function sayWeird(): void {
    console.log('Weird');
}

function sayNotWeird(): void {
    console.log('Not Weird');
}

function solve(N: number): void {
    const isOdd = Boolean(N%2);
    let weird: boolean = false
    if (isOdd) {
        sayWeird();
        return;
    }
    if (N>=6 && N<=20) {
        sayWeird();
        return;
    }
    if (N>=2) {
        sayNotWeird();
    }
}


function main() {
    const N: number = parseInt(readLine().trim(), 10);
    
    solve(N);
}