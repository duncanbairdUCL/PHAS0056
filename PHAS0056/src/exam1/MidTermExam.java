package exam1;


public class MidTermExam {

	public static void main(String[] args) {
		//// Analysis of NFL player data
		try {
			Analysis.analysis("http://www.hep.ucl.ac.uk/undergrad/3459/exam-data/NFL2012OffensiveStats.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
