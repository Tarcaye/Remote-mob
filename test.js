const test = require('ava');

function toRoman(value){
    return "I".repeat(value);
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
