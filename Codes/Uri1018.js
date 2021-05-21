var input = require('fs').readFileSync('stdin', 'utf8');

var a= input.split(` `)
valor = parseInt(a)

const cedula = [100, 50, 20, 10, 5, 2, 1]
var contagem = 0

console.log(valor)
cedulas(valor, 0)

function cedulas(valor, j) {
    if (j < cedula.length) {
        if (valor >= cedula[j]) {
            contagem++
            cedulas(valor - cedula[j], j)
        } else if (valor < cedula[j]) {
            console.log(`${contagem} nota(s) de R$ ${cedula[j].toFixed(0)},00`)
            contagem = 0
            j++
            cedulas(valor, j)
        }
    }
}

