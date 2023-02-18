var a:string="ciao a tutti uhh";

console.log(a);


type casaEditrice={
    nome:string;
}

type libro={
    titolo:string,
    autore:string,
    numPagine:number,
    casa:casaEditrice
}

var c:libro={
autore:"ludovica",
titolo:"ISDA",
numPagine:4678,
casa:{
    nome:"ciao"
}
}   

console.log(c.numPagine);
console.log(c.casa.nome);

class Persona{
    nome:string
    eta:number
    sesso:string

    constructor (nome:string,eta:number,sesso:string){
        this.nome=nome
        this.eta=eta
        this.sesso=sesso
    }

    public getNome():string{
        return this.nome
    }
}
