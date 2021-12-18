package com.carlostojal.tarefascasa.Controladores;

import com.carlostojal.tarefascasa.Auxiliares.Autenticacao;
import com.carlostojal.tarefascasa.Entidades.Tarefa;
import com.carlostojal.tarefascasa.Entidades.Utilizador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
public class ControladorTarefa {

    private static ArrayList<Tarefa> tarefas = new ArrayList<>();

    // obtém a listagem de tarefas
    @GetMapping("/tarefas")
    public ArrayList<Tarefa> obterTarefas() {
        return tarefas;
    }

    // cria uma nova tarefa
    @PostMapping("/tarefas/nova")
    public Tarefa criarTarefa(@RequestBody Tarefa novaTarefa, @RequestHeader String authorization) {

        Utilizador sessao = Autenticacao.descodificarToken(authorization);

        // criar ID
        UUID uuid = UUID.randomUUID();
        novaTarefa.setId(uuid.toString());

        novaTarefa.setEncarregado(sessao);

        return novaTarefa;
    }

    // gera a distribuição semanal de tarefas
    @PostMapping("/tarefas/gerar_semana")

    // marca uma tarefa como concluida
    @PatchMapping("/tarefas/marcar_como_concluida")
    public Tarefa marcarComoConcluida(@RequestBody Tarefa tarefa, @RequestHeader String authorization) {

    }


}
