function quadrante(x, y) {
    if (x === 0 && y === 0) console.log("Origem")
    else if (x === 0) console.log("Eixo Y")
    else if (y === 0) console.log("Eixo X")
    else if (y > 0 && x > 0) console.log("Q1")
    else if (y > 0 && x < 0) console.log("Q2")
    else if (y < 0 && x < 0) console.log("Q3")
    else console.log("Q4")
}
quadrante(1,-2)