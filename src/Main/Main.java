package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {

        Endereco cli1end = new Endereco(8702135,"58925-000","PB","Santa Helena","Centro",
                "Rua Goncalo Jose Vit.","Casa");
        Contato cli1cont = new Contato(8702135,"839993214345","nicollas@gmail.com");
        Cliente cli1 = new Cliente(8702135,cli1cont,cli1end,true,"19/12/2021");

        //System.out.println(cli1);

        Endereco cli2end = new Endereco(4456212,"44144-000","PB","Cajazeiras","Remedios",
                "Rua dos Remedios","Apartamento");
        Contato cli2cont = new Contato(4456212,"8399764211","pedro@hotmail.com");
        Sexo cli2sex = new Sexo(4456212,"Heterossexual");
        ClienteFisico cli2 = new ClienteFisico(4456212,cli2cont,cli2end,false,
                "13/05/2022",4456212,"Pedro Alves","112.115.654-87",
                "Estado da Paraiba",cli2sex,"04/08/2000");

        //System.out.println(cli2);

        Endereco cli3end = new Endereco(7765451,"3425-088","CE","Fortaleza",
                "ErlonPfvMeDaPonto","Rua Rene Gadelhao","Casa");
        Contato cli3cont = new Contato(7765451,"85996987542","Renezinho@gmail.com");
        IndicadorInscricaoEstadual indc = new IndicadorInscricaoEstadual(7765451,"Contribuinte ICMS");
        Sexo cli3sex = new Sexo(7765451,"Pansexual");
        ClienteJuridico cli3 = new ClienteJuridico(7765451,cli3cont,cli3end,true,
                "19/05/2022",7765451,"54467-12","Faculdade Catolica","Rene Dono da Fafic",indc,
                "54367asd24hjl9","2352465kokj534l");

        //System.out.println(cli3);
    }
}
