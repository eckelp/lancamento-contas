package br.eckelp.lancamentoconta.service.validacao.lancamento;

import br.eckelp.lancamentoconta.domain.model.Lancamento;

public interface ValidacaoLancamento {

    void validar(Lancamento lancamento);
}