package com.bd2.ocorrenciasAeronauticas.model;

import java.io.Serial;
import java.io.Serializable;

public class OcorrenciaTeste implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id; // Você pode adicionar um ID se desejar

    private String Numero_da_Ocorrencia;

    private String numeroDaFicha;

    private String operadorPadronizado;

    private String classificacaoDaOcorrencia;

    private String dataDaOcorrencia;

    private String horaDaOcorrencia;

    private String municipio;

    private String uf;

    private String regiao;

    private String descricaoDoTipo;

    private String icao;

    private String latitude;

    private String longitude;

    private String tipoDeAerodromo;

    private String historico;

    private String matricula;

    private String categoriaDaAeronave;

    private String operador;

    private String tipoDeOcorrencia;

    private String faseDaOperacao;

    private String operacao;

    private String danosAAeronave;

    private String aerodromoDeDestino;

    private String aerodromoDeOrigem;

    private String lesoesFataisTripulantes;

    private String lesoesFataisPassageiros;

    private String lesoesFataisTerceiros;

    private String lesoesGravesTripulantes;

    private String lesoesGravesPassageiros;

    private String lesoesGravesTerceiros;

    private String lesoesLevesTripulantes;

    private String lesoesLevesPassageiros;

    private String lesoesLevesTerceiros;

    private String ilesosTripulantes;

    private String ilesosPassageiros;

    private String lesoesDesconhecidasTripulantes;

    private String lesoesDesconhecidasPassageiros;

    private String lesoesDesconhecidasTerceiros;

    private String modelo;

    private String cls;

    private String tipoIcao;

    private String pmd;

    private String numeroDeAssentos;

    private String nomeDoFabricante;

    private String psso;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumero_da_Ocorrencia(String numero_da_Ocorrencia) {
        Numero_da_Ocorrencia = numero_da_Ocorrencia;
    }

    public void setNumeroDaFicha(String numeroDaFicha) {
        this.numeroDaFicha = numeroDaFicha;
    }

    public void setOperadorPadronizado(String operadorPadronizado) {
        this.operadorPadronizado = operadorPadronizado;
    }

    public void setClassificacaoDaOcorrencia(String classificacaoDaOcorrencia) {
        this.classificacaoDaOcorrencia = classificacaoDaOcorrencia;
    }

    public void setDataDaOcorrencia(String dataDaOcorrencia) {
        this.dataDaOcorrencia = dataDaOcorrencia;
    }

    public void setHoraDaOcorrencia(String horaDaOcorrencia) {
        this.horaDaOcorrencia = horaDaOcorrencia;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setDescricaoDoTipo(String descricaoDoTipo) {
        this.descricaoDoTipo = descricaoDoTipo;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setTipoDeAerodromo(String tipoDeAerodromo) {
        this.tipoDeAerodromo = tipoDeAerodromo;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCategoriaDaAeronave(String categoriaDaAeronave) {
        this.categoriaDaAeronave = categoriaDaAeronave;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void setTipoDeOcorrencia(String tipoDeOcorrencia) {
        this.tipoDeOcorrencia = tipoDeOcorrencia;
    }

    public void setFaseDaOperacao(String faseDaOperacao) {
        this.faseDaOperacao = faseDaOperacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setDanosAAeronave(String danosAAeronave) {
        this.danosAAeronave = danosAAeronave;
    }

    public void setAerodromoDeDestino(String aerodromoDeDestino) {
        this.aerodromoDeDestino = aerodromoDeDestino;
    }

    public void setAerodromoDeOrigem(String aerodromoDeOrigem) {
        this.aerodromoDeOrigem = aerodromoDeOrigem;
    }

    public void setLesoesFataisTripulantes(String lesoesFataisTripulantes) {
        this.lesoesFataisTripulantes = lesoesFataisTripulantes;
    }

    public void setLesoesFataisPassageiros(String lesoesFataisPassageiros) {
        this.lesoesFataisPassageiros = lesoesFataisPassageiros;
    }

    public void setLesoesFataisTerceiros(String lesoesFataisTerceiros) {
        this.lesoesFataisTerceiros = lesoesFataisTerceiros;
    }

    public void setLesoesGravesTripulantes(String lesoesGravesTripulantes) {
        this.lesoesGravesTripulantes = lesoesGravesTripulantes;
    }

    public void setLesoesGravesPassageiros(String lesoesGravesPassageiros) {
        this.lesoesGravesPassageiros = lesoesGravesPassageiros;
    }

    public void setLesoesGravesTerceiros(String lesoesGravesTerceiros) {
        this.lesoesGravesTerceiros = lesoesGravesTerceiros;
    }

    public void setLesoesLevesTripulantes(String lesoesLevesTripulantes) {
        this.lesoesLevesTripulantes = lesoesLevesTripulantes;
    }

    public void setLesoesLevesPassageiros(String lesoesLevesPassageiros) {
        this.lesoesLevesPassageiros = lesoesLevesPassageiros;
    }

    public void setLesoesLevesTerceiros(String lesoesLevesTerceiros) {
        this.lesoesLevesTerceiros = lesoesLevesTerceiros;
    }

    public void setIlesosTripulantes(String ilesosTripulantes) {
        this.ilesosTripulantes = ilesosTripulantes;
    }

    public void setIlesosPassageiros(String ilesosPassageiros) {
        this.ilesosPassageiros = ilesosPassageiros;
    }

    public void setLesoesDesconhecidasTripulantes(String lesoesDesconhecidasTripulantes) {
        this.lesoesDesconhecidasTripulantes = lesoesDesconhecidasTripulantes;
    }

    public void setLesoesDesconhecidasPassageiros(String lesoesDesconhecidasPassageiros) {
        this.lesoesDesconhecidasPassageiros = lesoesDesconhecidasPassageiros;
    }

    public void setLesoesDesconhecidasTerceiros(String lesoesDesconhecidasTerceiros) {
        this.lesoesDesconhecidasTerceiros = lesoesDesconhecidasTerceiros;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public void setTipoIcao(String tipoIcao) {
        this.tipoIcao = tipoIcao;
    }

    public void setPmd(String pmd) {
        this.pmd = pmd;
    }

    public void setNumeroDeAssentos(String numeroDeAssentos) {
        this.numeroDeAssentos = numeroDeAssentos;
    }

    public void setNomeDoFabricante(String nomeDoFabricante) {
        this.nomeDoFabricante = nomeDoFabricante;
    }

    public void setPsso(String psso) {
        this.psso = psso;
    }

    public Long getId() {
        return id;
    }

    public String getNumero_da_Ocorrencia() {
        return Numero_da_Ocorrencia;
    }

    public String getNumeroDaFicha() {
        return numeroDaFicha;
    }

    public String getOperadorPadronizado() {
        return operadorPadronizado;
    }

    public String getClassificacaoDaOcorrencia() {
        return classificacaoDaOcorrencia;
    }

    public String getDataDaOcorrencia() {
        return dataDaOcorrencia;
    }

    public String getHoraDaOcorrencia() {
        return horaDaOcorrencia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getUf() {
        return uf;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getDescricaoDoTipo() {
        return descricaoDoTipo;
    }

    public String getIcao() {
        return icao;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getTipoDeAerodromo() {
        return tipoDeAerodromo;
    }

    public String getHistorico() {
        return historico;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCategoriaDaAeronave() {
        return categoriaDaAeronave;
    }

    public String getOperador() {
        return operador;
    }

    public String getTipoDeOcorrencia() {
        return tipoDeOcorrencia;
    }

    public String getFaseDaOperacao() {
        return faseDaOperacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public String getDanosAAeronave() {
        return danosAAeronave;
    }

    public String getAerodromoDeDestino() {
        return aerodromoDeDestino;
    }

    public String getAerodromoDeOrigem() {
        return aerodromoDeOrigem;
    }

    public String getLesoesFataisTripulantes() {
        return lesoesFataisTripulantes;
    }

    public String getLesoesFataisPassageiros() {
        return lesoesFataisPassageiros;
    }

    public String getLesoesFataisTerceiros() {
        return lesoesFataisTerceiros;
    }

    public String getLesoesGravesTripulantes() {
        return lesoesGravesTripulantes;
    }

    public String getLesoesGravesPassageiros() {
        return lesoesGravesPassageiros;
    }

    public String getLesoesGravesTerceiros() {
        return lesoesGravesTerceiros;
    }

    public String getLesoesLevesTripulantes() {
        return lesoesLevesTripulantes;
    }

    public String getLesoesLevesPassageiros() {
        return lesoesLevesPassageiros;
    }

    public String getLesoesLevesTerceiros() {
        return lesoesLevesTerceiros;
    }

    public String getIlesosTripulantes() {
        return ilesosTripulantes;
    }

    public String getIlesosPassageiros() {
        return ilesosPassageiros;
    }

    public String getLesoesDesconhecidasTripulantes() {
        return lesoesDesconhecidasTripulantes;
    }

    public String getLesoesDesconhecidasPassageiros() {
        return lesoesDesconhecidasPassageiros;
    }

    public String getLesoesDesconhecidasTerceiros() {
        return lesoesDesconhecidasTerceiros;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCls() {
        return cls;
    }

    public String getTipoIcao() {
        return tipoIcao;
    }

    public String getPmd() {
        return pmd;
    }

    public String getNumeroDeAssentos() {
        return numeroDeAssentos;
    }

    public String getNomeDoFabricante() {
        return nomeDoFabricante;
    }

    public String getPsso() {
        return psso;
    }

    @Override
    public String toString() {
        return "OcorrenciaTeste{" +
                "id=" + id +
                ", Numero_da_Ocorrencia='" + Numero_da_Ocorrencia + '\'' +
                ", numeroDaFicha='" + numeroDaFicha + '\'' +
                ", operadorPadronizado='" + operadorPadronizado + '\'' +
                ", classificacaoDaOcorrencia='" + classificacaoDaOcorrencia + '\'' +
                ", dataDaOcorrencia='" + dataDaOcorrencia + '\'' +
                ", horaDaOcorrencia='" + horaDaOcorrencia + '\'' +
                ", municipio='" + municipio + '\'' +
                ", uf='" + uf + '\'' +
                ", regiao='" + regiao + '\'' +
                ", descricaoDoTipo='" + descricaoDoTipo + '\'' +
                ", icao='" + icao + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", tipoDeAerodromo='" + tipoDeAerodromo + '\'' +
                ", historico='" + historico + '\'' +
                ", matricula='" + matricula + '\'' +
                ", categoriaDaAeronave='" + categoriaDaAeronave + '\'' +
                ", operador='" + operador + '\'' +
                ", tipoDeOcorrencia='" + tipoDeOcorrencia + '\'' +
                ", faseDaOperacao='" + faseDaOperacao + '\'' +
                ", operacao='" + operacao + '\'' +
                ", danosAAeronave='" + danosAAeronave + '\'' +
                ", aerodromoDeDestino='" + aerodromoDeDestino + '\'' +
                ", aerodromoDeOrigem='" + aerodromoDeOrigem + '\'' +
                ", lesoesFataisTripulantes='" + lesoesFataisTripulantes + '\'' +
                ", lesoesFataisPassageiros='" + lesoesFataisPassageiros + '\'' +
                ", lesoesFataisTerceiros='" + lesoesFataisTerceiros + '\'' +
                ", lesoesGravesTripulantes='" + lesoesGravesTripulantes + '\'' +
                ", lesoesGravesPassageiros='" + lesoesGravesPassageiros + '\'' +
                ", lesoesGravesTerceiros='" + lesoesGravesTerceiros + '\'' +
                ", lesoesLevesTripulantes='" + lesoesLevesTripulantes + '\'' +
                ", lesoesLevesPassageiros='" + lesoesLevesPassageiros + '\'' +
                ", lesoesLevesTerceiros='" + lesoesLevesTerceiros + '\'' +
                ", ilesosTripulantes='" + ilesosTripulantes + '\'' +
                ", ilesosPassageiros='" + ilesosPassageiros + '\'' +
                ", lesoesDesconhecidasTripulantes='" + lesoesDesconhecidasTripulantes + '\'' +
                ", lesoesDesconhecidasPassageiros='" + lesoesDesconhecidasPassageiros + '\'' +
                ", lesoesDesconhecidasTerceiros='" + lesoesDesconhecidasTerceiros + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cls='" + cls + '\'' +
                ", tipoIcao='" + tipoIcao + '\'' +
                ", pmd='" + pmd + '\'' +
                ", numeroDeAssentos='" + numeroDeAssentos + '\'' +
                ", nomeDoFabricante='" + nomeDoFabricante + '\'' +
                ", psso='" + psso + '\'' +
                '}';
    }
}
