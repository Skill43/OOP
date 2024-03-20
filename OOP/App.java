import Controler.CalcControler;
import Model.ComplexCalcModel;
import Model.ComplexNumber;
import Model.TextLogger;
import Model.iCalcModel;
import Model.iLogger;
import View.DefaultCalcView;
import View.iCalcView;

public class App {
	public static void main(String[] args) throws Exception {
		iCalcModel<ComplexNumber> model = new ComplexCalcModel();
		iCalcView<ComplexNumber> view = new DefaultCalcView();
		iLogger<ComplexNumber> logger = new TextLogger("Probe");
		@SuppressWarnings("unused")
        CalcControler<ComplexNumber> controler = new CalcControler<ComplexNumber>(model, view, logger);
	}
}