function ordenar(...input) {
    let original = input.slice()
    let ordenado = input
    for (let i = 0; i < ordenado.length; i++) {
        for (let j = i; j < ordenado.length; j++) {
            if (ordenado[i] > ordenado[j]) {
                aux = ordenado[i]
                ordenado[i] = ordenado[j]
                ordenado[j] = aux
            }
        }
    }
    console.log("Ordenado")
    for (let c = 0; c < ordenado.length; c++) {
        console.log(ordenado[c])
    }
    console.log("Original")
    for (let z = 0; z < original.length; z++) {
        console.log(original[z])
    }
}
ordenar(-2, 41, 2, -16)