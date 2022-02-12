import java.util.ArrayList;
import java.util.List;

public class Coach {
    private List<Training> trainings = new ArrayList<Training>();

    public void executarTarefa(Training training){
        this.trainings.add(training);
        training.run();
    }

    public void cancelarUltimaTarefa() {
        if (trainings.size() != 0){
            Training tarefa = this.trainings.get(this.trainings.size() - 1);
            tarefa.cancel();
            this.trainings.remove(this.trainings.size() - 1);
        }
    }
}
