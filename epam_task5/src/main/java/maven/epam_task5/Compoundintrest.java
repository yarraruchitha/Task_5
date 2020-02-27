package maven.epam_task5;

public class Compoundintrest {
	Double intrestcalculation(Double amount,Double rate,Double duration,Double increment)

	{

		Double ci=amount*Math.pow(1+rate/increment,increment*duration);

		return ci-amount;

	}
}
