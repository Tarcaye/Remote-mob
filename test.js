const test = require('ava');

function toRoman(value){
    return "I";
}

test('should convert 1 to I', t => {
    t.is(toRoman(1), 'I');
});
