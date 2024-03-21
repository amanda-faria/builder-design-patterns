package org.example;

import javax.xml.crypto.Data;
import java.util.Date;

public class CarroBuilder {

    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public Carro build() {
        if (carro.getMarca().equals("")) {
            throw new IllegalArgumentException("Marca inválida");
        }
        if (carro.getModelo().equals("")) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        return carro;
    }

    public CarroBuilder setCarro(Carro carro) {
        this.carro = carro;
        return this;
    }
    public CarroBuilder setModelo(String modelo){
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setMarca(String marca){
        carro.setMarca(marca);
        return this;
    }
    public CarroBuilder setAno(int ano){
        carro.setAno(ano);
        return this;
    }

    public CarroBuilder setDataDeLancamento(Date dataDeLancamento){
        carro.setDataDeLancamento(dataDeLancamento);
        return this;
    }

    public CarroBuilder setCor(String cor){
        carro.setCor(cor);
        return this;
    }

    public CarroBuilder setNumeroPortas(int numeroPortas){
        carro.setNumeroPortas(numeroPortas);
        return this;
    }

    public CarroBuilder setTipoDeTransmissao(String tipoDeTransmissao){
        carro.setTipoTransmissao(tipoDeTransmissao);
        return this;
    }

    public CarroBuilder setMotor(String motor){
        carro.setMotor(motor);
        return this;
    }

    public CarroBuilder setCombustivel(String combustivel){
        carro.setCombustivel(combustivel);
        return this;
    }

    public CarroBuilder setQuilometragem(double quilometragem){
        carro.setQuilometragem(quilometragem);
        return this;
    }

    public CarroBuilder setPreco(double preco){
        carro.setPreco(preco);
        return this;
    }


    /*public CarroBuilder setMatricula(int matricula) {
        aluno.setMatricula(matricula);
        return this;
    }

    public AlunoBuilder setNome(String nome) {
        aluno.setNome(nome);
        return this;
    }

    public AlunoBuilder setDataNascimento(Date dataNascimento) {
        aluno.setDataNascimento(dataNascimento);
        return this;
    }

    public AlunoBuilder setNomeMae(String nomeMae) {
        aluno.setNomeMae(nomeMae);
        return this;
    }

    public AlunoBuilder setNomePai(String nomePai) {
        aluno.setNomePai(nomePai);
        return this;
    }

    public AlunoBuilder setCpf(String cpf) {
        aluno.setCpf(cpf);
        return this;
    }

    public AlunoBuilder setRg(String rg) {
        aluno.setRg(rg);
        return this;
    }

    public AlunoBuilder setEscolaAnterior(String escolaAnterior) {
        aluno.setEscolaAnterior(escolaAnterior);
        return this;
    }

    public AlunoBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        aluno.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public AlunoBuilder setEnderecoNumero(int enderecoNumero) {
        aluno.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public AlunoBuilder setEnderecoComplemento(String enderecoComplemento) {
        aluno.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public AlunoBuilder setEnderecoBairro(String enderecoBairro) {
        aluno.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public AlunoBuilder setEnderecoCidade(String enderecoCidade) {
        aluno.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public AlunoBuilder setEnderecoUF(String enderecoUF) {
        aluno.setEnderecoUF(enderecoUF);
        return this;
    }

    public AlunoBuilder setCep(String cep) {
        aluno.setCep(cep);
        return this;
    }

    public AlunoBuilder setEmail(String email) {
        aluno.setEmail(email);
        return this;
    }

    public AlunoBuilder setCelular(String celular) {
        aluno.setCelular(celular);
        return this;
    }*/

}
