package br.com.stapassoli.vendas.configuracao;

import br.com.stapassoli.vendas.anottations.Homolog;
import br.com.stapassoli.vendas.interfaces.ConfiguracaoPadrao;
import org.springframework.beans.factory.annotation.Value;

@Homolog
public class ConfiguracaoHomolog implements ConfiguracaoPadrao{

    @Value("${application-name}")
    String nomeAplicacao;

    public void mostrarNomeApplicacao() {
        System.out.println("==========");
        System.out.println(nomeAplicacao);
        System.out.println("==========");
    }
}
