void main (){

    int temperatura = 0;
    int contagem = 0;
    int somaTemperaturas = 0;
    int mediaTemperatura = 0;

    IO.println("Porfavor escreva a temperatura em Celcius e escreva 999 para terminar:");
    while(true){
        while (temperatura != 999) {
            

            temperatura = Integer.parseInt(IO.readln());
            somaTemperaturas = somaTemperaturas + temperatura;

            contagem++;
                
        }
        
        somaTemperaturas = somaTemperaturas - 999;
        contagem = contagem - 1;

        if(contagem == 0){

            IO.println("Por favor insira uma temperatura");

            temperatura = 0;
            somaTemperaturas = 0;
            contagem = 0;

        }else{
            break;
        }
    }


    mediaTemperatura = somaTemperaturas/contagem;

    IO.println("A temperatura media atual é de: "+mediaTemperatura+" C");
    IO.println("leituras registradas: "+contagem);
    
        if (mediaTemperatura < 18) {
            IO.println("Temperatura Baixa: Ligar Aquecimento");
        }

        if (18 <= mediaTemperatura & mediaTemperatura <= 28) {
            IO.println("Temperatura Ideal");
        }

        if (mediaTemperatura > 28) {
            IO.println("Temperatura Alta: Ligar Ventilação");
        }

}