/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avalicaopoo;

import com.mycompany.avalicaopoo.Filme;
import com.mycompany.avalicaopoo.Avalicao;
import com.mycompany.avalicaopoo.Opnioes;

/**
 *
 * @author Gabriel Morais
 */
public class Main {
    public static void main(String[] args) {
        Filme starWars = new Filme(1, "Star Wars Episódio I: A Ameaça Fantasma",
        "Ficção científica/Ação", 
                "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa "
                + "de salvar o planeta das garras de Darth Sidious. Durante a "
                + "viagem, eles conhecem um habilidoso menino e decidem "
                + "treiná-lo para se tornar um Jedi. Mas o tempo irá "
                + "revelar que as coisas nem sempre são o que aparentam ser.");
        
        Avalicao starwars1 = new Avalicao(1, "Evan Williams", 3, 
                "Tudo em Phantom Menace existe em um vácuo brilhante e barulhento.");
        
        Avalicao starwars2 = new Avalicao(1, "Joe Holleman", 5, 
                "O filme é divertido, na maior parte, e várias cenas são "
                        + "tão boas ou melhores do que qualquer coisa que "
                        + "Lucas criou nos filmes originais. Os personagens "
                        + "humanos, no entanto, não são tão interessantes "
                        + "quanto os dos episódios anteriores.");
        
        Avalicao starwars3 = new Avalicao(1, "Ênio Gabriel", 4, 
                "Os visuais e os efeitos de ameaça fantasmas são muito bons,"
                        + " principalmente para o contexte anual a qual está"
                        + " inserido, mas falta um pouco da essência dos outros"
                        + " filmes");
        
        Avalicao[] arrAvalicaoStarWars = {starwars1, 
            starwars2, 
            starwars3};
        Opnioes opnioesStarWars = new Opnioes(arrAvalicaoStarWars);
        
        
        Filme ligaDaJustica = new Filme(2, "Liga da Justiça",
        "Ação/Aventura",
        "Impulsionado pela restauração de sua fé na humanidade e inspirado pelo "
                + "ato altruísta do Superman, Bruce Wayne convoca sua nova "
                + "aliada Diana Prince para o combate contra um inimigo ainda "
                + "maior, recém-despertado. Juntos, Batman e Mulher-Maravilha "
                + "buscam e recrutam com agilidade um time de meta-humanos, mas "
                + "mesmo com a formação da liga de heróis sem precedentes, "
                + "poderá ser tarde demais para salvar o planeta de um "
                + "catastrófico ataque.");
        
        Avalicao ligaDajustica1 = new Avalicao(2, "Kim Newman", 1, 
                "É uma saga ainda mais complicada do que Dawn of Justice, "
                        + "com um macguffin cansativo e pesado em que três "
                        + "caixas mágicas devem ser reunidas para o mal e, "
                        + "em seguida, separadas para o bem");
        
        Avalicao ligaDajustica2 = new Avalicao(2, "Noel Murray", 3, 
                "Todos os filmes de Snyder em DC - Liga da Justiça incluída - "
                        + "parecem mais preocupados com as repercussões das "
                        + "ações do que com as ações em si.");
        
        Avalicao ligaDajustica3 = new Avalicao(2, "Stephen Romei", 4, 
                "A ação às vezes é emocionante, mas os resultados são "
                        + "previsíveis. Na verdade, muitas vezes isso dá a "
                        + "sensação de um filme de cenário, feito para "
                        + "lançar uma série.");
        
        Avalicao[] arrAvalicaoLigaDaJustica = {ligaDajustica1, 
            ligaDajustica2, 
            ligaDajustica3};
        Opnioes opnioesLigaDaJustica = new Opnioes(arrAvalicaoLigaDaJustica);

        
        Filme laranjaMecanica = new Filme(3, "Laranja Mecânica", 
        "Crime/Drama",
        "O jovem Alex passa as noites com uma gangue de amigos briguentos. "
                + "Depois que é preso, se submete a uma técnica de modificação "
                + "de comportamento para poder ganhar sua liberdade.");
        
         Avalicao laranjaMecanica1 = new Avalicao(2, "John Huddy", 4, 
                "Se Laranja Mecânica não é um filme excelente ou memorável, é "
                        + "definitivamente uma demonstração da grande promessa "
                        + "que esta jovem e crescente forma de "
                        + "arte chamada cinema possui");
        
        Avalicao laranjaMecanica2 = new Avalicao(2, "Tom Beasley", 4, 
                "É uma coisa difícil de colocar antes de seus glazzies, "
                        + "mas acredite em mim, é realmente horrorshow.");
        
        Avalicao laranjaMecanica3 = new Avalicao(2, "Ênio Gabriel", 5, 
                "Um dos melhores filmes inspirados em filmes que já li"
                        + " a parte em que o persoangem principal"
                        + " canta 'i sing in the rain' da pra sentir toda a "
                        + "cena, simplesmente incrivel!");
        
        Avalicao[] arrAvaliacoesLaranjaMecanica = {ligaDajustica1, 
            ligaDajustica2, 
            ligaDajustica3};
        Opnioes opnioesLaranjaMecanica = new Opnioes(arrAvaliacoesLaranjaMecanica);
    }
}
