package br.dev.rx.forumhub.domain.curso;

public record DadosDetalhamentoCurso(
        Long id,
        String nome,
        String categoria) {

    public DadosDetalhamentoCurso(Long id, String nome, String categoria) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
    }
}
