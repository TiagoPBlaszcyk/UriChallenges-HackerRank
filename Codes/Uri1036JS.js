var input = require('fs').readFileSync('stdin', 'utf8');

var [a,b,c]= input.split(` `)
ax2 = parseFloat(a)
bx = parseFloat(b)
c = parseFloat(c)

d = (bx * bx) - 4 * ax2 * c
x1 = (-bx + Math.sqrt(d)) / (2 * ax2)
x2 = (-bx - Math.sqrt(d)) / (2 * ax2)

if (d < 0 || ax2 == 0) {
    console.log("Impossivel calcular")
}
else {
    console.log(`R1 = ${x1.toFixed(5)}`)
    console.log(`R2 = ${x2.toFixed(5)}`)
}
