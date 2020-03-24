const test = require('ava');

function toRoman(value){
    
    if (value === 5 + 1) return toRoman(5) + toRoman(1);
    if (value === 5) return 'V';
    if (value === 5 - 1) return 'IV';
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

test('should convert 4 to IV', t => {
    t.is(toRoman(4), 'IV');
});

test('should convert 5 to V', t => {
    t.is(toRoman(5), 'V');
});

test('should convert 6 to VI', t => {
    t.is(toRoman(6), 'VI');
});
