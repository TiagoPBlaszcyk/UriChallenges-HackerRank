var input = require('fs').readFileSync('stdin', 'utf8');

var quantidade= input.split(` `)
var resposta = input.split(` `)

for (let i = 0; i < quantidade.length; i++) {
    for (let j = i; j < quantidade.length; j++) {
        if (quantidade[i] > quantidade[j]) {
            aux = quantidade[i]
            quantidade[i] = quantidade[j]
            quantidade[j] = aux
        }
    }
}

for (let z = 0; z < quantidade.length; z++) {
    console.log(quantidade[z])
}
console.log()

for (let z = 0; z < resposta.length; z++) {
    console.log(resposta[z])
}