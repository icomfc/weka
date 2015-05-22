package wine;

import java.io.FileReader;
import java.util.Random;

import weka.classifiers.Evaluation;
import weka.classifiers.rules.ZeroR;
import weka.core.Instances;

public class WineZeroR {
	
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("/home/luan/workspace/weka/weka/src/main/datas/wine.arff");
		Instances instancia = new Instances(file);
		instancia.setClassIndex(0);
		ZeroR classidicador = new ZeroR();
		classidicador.buildClassifier(instancia);
		
		
		
		Evaluation eval = new Evaluation(instancia);
		eval.evaluateModel(classidicador, instancia);
		System.out.println(eval.numInstances());
		System.out.println(eval.avgCost());
		System.out.println(eval.correct());
		System.out.println(eval.incorrect());
		System.out.println(eval.errorRate());
		System.out.println(eval.unclassified());
		
		
		
	}
   
}
