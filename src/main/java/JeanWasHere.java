import aima.core.*;
import aima.core.environment.vacuum.TableDrivenVacuumAgent;
import aima.core.environment.vacuum.VacuumEnvironment;
import aima.core.agent.impl.SimpleEnvironmentView;
import aima.core.environment.vacuum.SimpleReflexVacuumAgent;
import aima.core.environment.vacuum.VacuumPercept;
import aima.core.agent.Agent;
import aima.core.agent.Action;
import aima.core.agent.Environment;
import aima.core.agent.EnvironmentListener;
import aima.core.environment.vacuum.ModelBasedReflexVacuumAgent;

public class JeanWasHere {
	
	public static void main(String[] args) {
		EnvironmentListener<Object, Object> vacuumViewer = (EnvironmentListener<Object, Object>) new SimpleEnvironmentView();
		Environment<VacuumPercept, Action> vacuumEnvironment = new VacuumEnvironment();
		
		vacuumEnvironment.addEnvironmentListener(vacuumViewer);
		
		VacuumEnvironment cleanClean = new VacuumEnvironment(VacuumEnvironment.LocationState.Clean, VacuumEnvironment.LocationState.Clean);
		VacuumEnvironment cleanDirty = new VacuumEnvironment(VacuumEnvironment.LocationState.Clean, VacuumEnvironment.LocationState.Dirty);
		VacuumEnvironment dirtyClean = new VacuumEnvironment(VacuumEnvironment.LocationState.Dirty, VacuumEnvironment.LocationState.Clean);
		VacuumEnvironment dirtyDirty = new VacuumEnvironment(VacuumEnvironment.LocationState.Dirty, VacuumEnvironment.LocationState.Dirty);
	
		Agent<VacuumPercept, Action> vacuumSimpleReflex = new SimpleReflexVacuumAgent();
		vacuumEnvironment.notify("sdfsdfsdfsdfsdf" + vacuumEnvironment.getPerformanceMeasure(vacuumSimpleReflex));
		
	}

}
