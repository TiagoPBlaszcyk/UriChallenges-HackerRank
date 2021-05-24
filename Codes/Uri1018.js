function Uri1018(valor) {
    const cedula = [100, 50, 20, 10, 5, 2, 1]
    let contagem = 0
    if (0 < cedula.length) {
        if (valor >= cedula[j]) {
            contagem++
            Uri1018(valor - cedula[j])
        } else if (valor < cedula[j]) {
            console.log(`${contagem} nota(s) de R$ ${cedula[j].toFixed(0)},00`)
            contagem = 0
            j++
            Uri1018(valor)
        }
    }
}
Uri1018(283)