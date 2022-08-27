package aplicacao;

import fabricas.FabricaUI;
import fabricas.FabricaUIMac;
import fabricas.FabricaUIWindows;

public class Principal {
    public static void main(String[] args) {
        String arquivoConfigAplicacao = "Mac";
        FabricaUI sistema = null;

        if (arquivoConfigAplicacao.equals("Windows")) {
            sistema = new FabricaUIWindows();
        } else {
            if (arquivoConfigAplicacao.equals("Mac")) {
                sistema = new FabricaUIMac();
            } else {
                System.err.println("Sistema operacional inválido");
                throw new Error("Sistema operacional inválido");
            }
        }

        Aplicacao app = new Aplicacao(sistema);
        app.criarUI();
    }
}
