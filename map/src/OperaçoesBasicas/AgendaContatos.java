package OperaçoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos{
    //atributo

    private Map<String, Integer>agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
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
      AgendaContatos agendaContatos = new AgendaContatos();

       agendaContatos.adicionarContato("Kevin", 88228461);
       agendaContatos.adicionarContato("ELiane", 88649241);
       agendaContatos.adicionarContato("machado", 99887766);
       agendaContatos.exibirContatos();
       agendaContatos.removerContato("Kevin");
       agendaContatos.exibirContatos(); 

       System.out.println("O número é: " + agendaContatos.pesquisarPorNome("machado"));

       
    }
}
