var input = require('fs').readFileSync('stdin', 'utf8');
var escolha = input.split(` `)
var aux = 0
var exit = ""
while (escolha[aux] != 0) {
    for (let i = 1; i <= escolha[aux]; i++) {
        exit = exit.concat(" " + i)
    }
    exit = exit.substring(1)
    console.log(exit)
    exit = ""
    aux++
}



