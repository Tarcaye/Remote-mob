const test = require('ava');

function toRoman(value){
    var newValue = value - 5;

    if (value === 10) return 'X';
    if (value === 10 - 1) return minus(10, 1);

    if (value === 5 + 1) return toRoman(5) + toRoman(1);
    if (value === 5) return 'V';
    if (value === 5 - 1) return minus(5, 1);

    return "I".repeat(value);
}

function isPrevious(ofValue, value) {
    return value === ofValue -1;
}

function minus(arabicNumber, arabicNumberToSubstract) {
    return toRoman(arabicNumberToSubstract) + toRoman(arabicNumber);
}

test('should convert 1 to I', t => {
    t.is(toRoman(1), 'I');
});

test('should convert 2 to II', t => {
    t.is(toRoman(2), 'II');
});

test('should convert 3 to III', t => {
    t.is(toRoman(3), 'III');
});

test('should convert 4 to IV', t => {
    t.is(toRoman(4), 'IV');
});

test('should convert 5 to V', t => {
    t.is(toRoman(5), 'V');
});

test('should convert 6 to VI', t => {
    t.is(toRoman(6), 'VI');
});

test('should convert 10 to X', t => {
    t.is(toRoman(10), 'X');
});

test('should convert 9 to IX', t => {
    t.is(toRoman(9), 'IX');
});
