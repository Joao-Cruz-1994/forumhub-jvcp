package br.dev.rx.forumhub.domain.resposta;

import java.time.LocalDateTime;

public record DadosDetalhamentoResposta(Long id,
                                        String mensagem,
                                        LocalDateTime data_criacao,
                                        Boolean solucao,
                                        Long autorId,
                                        Long topicoId) {
}
