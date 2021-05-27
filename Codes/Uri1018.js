function Uri1018(valor) {
    const cedula = [100, 50, 20, 10, 5, 2, 1]
    for (let i = 0; i < cedula.length; i++) {
        console.log(Math.trunc(valor/cedula[i]) , "nota(s) de R$", cedula[i]) 
        valor %= cedula[i]   
    }
}
Uri1018(283)