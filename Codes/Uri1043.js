const Uri1043 = function Uri1043(a, b, c) {
    if ((a < b + c) && (b < a + c) && (c < b + a)) {
        let perimetro = a + b + c
        console.log("Perimetro =", perimetro)
    } else {
        let area = ((a + b) * c) / 2
        console.log("Area = " + area)
    }
}

Uri1043(6.0, 4.0, 2.0)