package br.eckelp.lancamentoconta.service.validacao.formaPagamento;

import br.eckelp.lancamentoconta.domain.model.FormaPagamento;

public interface ValidacaoFormaPagamento {

    void validar(FormaPagamento formaPagamento);

}
