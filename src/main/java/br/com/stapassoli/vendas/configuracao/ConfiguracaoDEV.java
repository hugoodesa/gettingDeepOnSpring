package br.com.stapassoli.vendas.configuracao;

import br.com.stapassoli.vendas.anottations.Dev;
import br.com.stapassoli.vendas.interfaces.Animal;
import br.com.stapassoli.vendas.interfaces.ConfiguracaoPadrao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@Dev
public class ConfiguracaoDEV implements ConfiguracaoPadrao {

    @Value("${application-name}")
    String nomeAplicacao;

    @Override
    @Bean
    public void mostrarNomeApplicacao() {
        System.out.println("==========");
        System.out.println(nomeAplicacao);
        System.out.println("==========");
    }

    @Bean(name = "gato")
    public Animal gato(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.println("Miau miau");
            }
        };
    }

    @Bean(name = "cachorro")
    public Animal cachorro(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.println("Au Au");
            }
        };
    }
}
