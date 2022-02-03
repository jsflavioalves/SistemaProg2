package Model;

public class contabancaria {
	
	private int nroconta;
	private double saldo;
	private String dtabertura;
	private String dtencerramento;
	private int senha;
	private int situacao;
	
	public int getNroconta() {
		return nroconta;
	}
	public void setNroconta(int nroconta) {
		this.nroconta = nroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDtabertura() {
		return dtabertura;
	}
	public void setDtabertura(String dtabertura) {
		this.dtabertura = dtabertura;
	}
	public String getDtencerramento() {
		return dtencerramento;
	}
	public void setDtencerramento(String dtencerramento) {
		this.dtencerramento = dtencerramento;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	
	@Override
	public String toString() {
		return "contabancaria [nroconta=" + nroconta + ", saldo=" + saldo + ", dtabertura=" + dtabertura
				+ ", dtencerramento=" + dtencerramento + ", senha=" + senha + ", situacao=" + situacao + "]";
	}
	
	

}
