package fakeDataSetFake;

import java.util.ArrayList;

import models.PontoTuristicoModel;

public class PontoTuristicoDataSetFake {
    private static ArrayList<PontoTuristicoModel> pontosTuristicos;

    public static ArrayList<PontoTuristicoModel> getItens(){

        pontosTuristicos = new ArrayList<>();

        pontosTuristicos.add(new PontoTuristicoModel(1,
                "Jardim Botânico",
                "O parque tem um terreno de cerca de 220 mil m² e foi construído no Jardim Dois Corações",
                "jardim1",
                "jardim2",
                "jardim3",
                "Rua+Miguel+Montoro+Lozano+340",
                "https://turismo.sorocaba.sp.gov.br/visite/jardim-botanico-irmaos-vilas-boas/"));
        pontosTuristicos.add(new PontoTuristicoModel(2,
                "Zoológico Municipal Quinzinho de Barros",
                "considerado o segundo zoológico do Brasil em número de espécies.",
                "zoo1",
                "zoo2",
                "zoo3",
                "Rua+Teodoro+Kaisel+883",
                "https://www.sorocaba.sp.gov.br/zoologico/"));

        pontosTuristicos.add(new PontoTuristicoModel(3,
                "Museu da Ferrovia de Sorocaba",
                "A casa, com 2 pavimentos, exibe móveis, equipamentos, projetos e maquetes da EFS.",
                "museu1",
                "museu2",
                "museu3",
                "Rua+Dr.+Álvaro+Soares+553",
                "http://museusferroviarios.net.br/museus-ferroviarios/museu-sorocaba/"));

        return pontosTuristicos;
    }
}
