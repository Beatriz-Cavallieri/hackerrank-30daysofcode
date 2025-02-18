'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');
let inputString: string = '';
let inputLines: string[] = [];
let currentLine: number = 0;
process.stdin.on('data', function (inputStdin: string): void {
    inputString += inputStdin;
});

process.stdin.on('end', function (): void {
    inputLines = inputString.split('\n');
    inputString = '';
    main();
});

class ListNode<T> {
    data: T;
    next: ListNode<T> | null;
    constructor(n: T) {
        this.data = n;
        this.next = null;
    }
}

function insert<T>(head: ListNode<T> | null, data: T): ListNode<T> {
    if (head == null) {
        head = new ListNode(data);
        head.next = null;
        return head;
    }
    if (head.next == null) {
        head.next = new ListNode(data);
    } else {
        insert(head.next, data);
    }
    return head;
}

function display<T>(head: ListNode<T>): void {
    let start: ListNode<T> | null = head;
    let output = ''
    while (start !== null) {
        output = output + start.data + " ";
        start = start.next;
    }
    console.log(output);
}


function readLine(): string {
    return inputLines[currentLine++];
}

function main() {
    // Enter your code here
    let n: number = parseInt(readLine().trim(), 10);
    let head: ListNode<number> | null = null;

    while (n-- > 0) {
        let element: number = parseInt(readLine().trim(), 10);
        head = insert(head, element);
    }

    if (head) display(head);

}