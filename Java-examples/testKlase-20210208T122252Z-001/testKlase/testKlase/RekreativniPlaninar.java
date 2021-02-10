package testKlase;

public class RekreativniPlaninar extends Planinar{

	private int tezinaOpreme;
	private String okrug;
	private int maximalanUspon;
	
	public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String okrug, int maximalanUspon) {
		super(id, ime, prezime);
		this.tezinaOpreme = tezinaOpreme;
		this.okrug = okrug;
		this.maximalanUspon = maximalanUspon;
	}
	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id: " + id + "\nime: " + ime + " " + prezime + "\nOkrug: " + okrug);
		
	}
	@Override
	public int clanarinaPlaninara() {
		
		return 1000;
	}
	@Override
	public boolean uspesanUspon(Planina planina) {
		
		int maxUsponSaOpremom = maximalanUspon - (tezinaOpreme * 50);
	
		if (maximalanUspon < planina.getVisinaPlanine() || maxUsponSaOpremom < planina.getVisinaPlanine()) {
			return false;
		}else {
			return true;
		}		
		
	}
	
	
}
