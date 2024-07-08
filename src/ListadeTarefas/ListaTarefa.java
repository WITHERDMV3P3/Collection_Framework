package ListadeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasPararemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasPararemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasPararemover);
    }

    public int obterNumerototalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoestarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("o numero total de elementos é: "+listaTarefa.obterNumerototalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("o numero total de elementos é: "+listaTarefa.obterNumerototalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("o numero total de elementos é: "+listaTarefa.obterNumerototalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("o numero total de elementos é: "+listaTarefa.obterNumerototalTarefas());

        listaTarefa.obterDescricoestarefas();
    }

}
