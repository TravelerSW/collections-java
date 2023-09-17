package OperaçoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos{
    //atributo

    private Map<String, Integer>agendaContatoMap;

    public AgendaContatos(Map<String, Integer>agendaContatoMap){
        this.agendaContatoMap = new HashMap<>(0, 0);
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    
    public static void main(String[] args) {
       
    }
}
