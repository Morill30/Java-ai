import aima.Core.agent.*;
import aima.Core.environment.*;

public class Main {
	
	public static void main(String[] args) {
		EnvironmentListener<Object, Object> vacuumViewer = new SimpleEnvironmentView();
		Environment<VacuumPercept, Action> vacuumEnv = new VacuumEnvironment().addEnvironmentListener(vacuumViewer);
		
		Agent simpleAgent 	= new SimpleReflexVacuumAgent();
		Agent tableAgent 	= new TableDrivenVacuumAgent();
		Agent modelAgent 	= new ModelBaderVacuumAgent();
		
		VacuumEnvironment cleanClean = new VacuumEnvironment(VacuumEnvironment.LocationState.Clean, VacuumEnvironment.LocationState.Clean);
		VacuumEnvironment cleanDirty = new VacuumEnvironment(VacuumEnvironment.LocationState.Clean, VacuumEnvironment.LocationState.Dirty);
		VacuumEnvironment dirtyClean = new VacuumEnvironment(VacuumEnvironment.LocationState.Dirty, VacuumEnvironment.LocationState.Clean);
		VacuumEnvironment dirtyDirty = new VacuumEnvironment(VacuumEnvironment.LocationState.Dirty, VacuumEnvironment.LocationState.Dirty);
		
		
	}

}
