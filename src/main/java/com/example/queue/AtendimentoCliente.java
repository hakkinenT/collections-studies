package com.example.queue;

import java.util.PriorityQueue;

public class AtendimentoCliente {
    public static void main(String[] args) {
        PriorityQueue<Suporte> suporte = new PriorityQueue<>();
        suporte.add(new Suporte("Reiniciar o roteador", 3));
        suporte.add(new Suporte("Problema de conexão", 1));
        suporte.add(new Suporte("Erro ao salvar o arquivo", 2));
        suporte.add(new Suporte("Atualizar antivírus", 3));

        System.out.println("Atendendo solicitações de suporte (por prioridade):");
        while (!suporte.isEmpty()) {
            System.out.println(suporte.poll());
        }

    }
}

class Suporte implements Comparable<Suporte>{
    private String description;
    private int priority;

    public Suporte() {
    }

    public Suporte(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Suporte o){
        return Integer.compare(this.priority, o.getPriority());
    }

    @Override
    public String toString() {
        return "Prioridade " + this.priority + ": " + this.description;
    }
}