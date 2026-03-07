package Chap_08;

import Chap_08.Camera.FactoryCam;
import Chap_08.detecter.AdvencedFireDetector;
import Chap_08.detecter.Detectable;
import Chap_08.detecter.FireDetector;
import Chap_08.reporter.NormalReporter;
import Chap_08.reporter.VideoReporter;
import Chap_08.reporter.Reportable;


public class _02_Interface {
	public static void main(String[] args) {
		// 인터페이스
		NormalReporter normalReporter = new NormalReporter();
		normalReporter.report();
		
		Reportable videoReporter = new VideoReporter();
		videoReporter.report();
		
		System.out.println("-----------------------------");
		
		Detectable fireDetector = new FireDetector();
		fireDetector.detect();
		
		Detectable advancedFiDeprecated = new AdvencedFireDetector();
		advancedFiDeprecated.detect();
		
		System.out.println("-----------------------------");

		FactoryCam factoryCam = new FactoryCam();
		factoryCam.setDetector(fireDetector);
		factoryCam.setReporter(normalReporter);
		
		factoryCam.detect();
		factoryCam.report();
				
		
	}

}
