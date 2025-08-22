# 🎪Sistema de Loja de Aluguel de Brinquedos
<br/>
<br/>
📋 Descrição
Sistema desenvolvido em Java para gerenciamento de uma loja especializada em aluguel de brinquedos. O projeto implementa um sistema completo de locação com interface gráfica utilizando JOptionPane, permitindo cadastro de clientes, funcionários e controle de aluguéis com opção de entrega.
✨ Funcionalidades
👤 Gestão de Clientes

Cadastro completo com dados pessoais (nome, CPF, telefone)
Informações de contato (email, endereço)
Registro de data de nascimento

🧸 Sistema de Brinquedos

Categorização por faixa etária - Brinquedos organizados por idade adequada
Sistema de precificação - Preços diferenciados por categoria
Controle de cores e descrições - Identificação detalhada dos produtos
Lista personalizada - Seleção múltipla de brinquedos por aluguel

👥 Gestão de Funcionários
Funcionários de Aluguel

Cadastro com informações profissionais
Sistema de comissões (2% sobre vendas)
Controle de local de trabalho e formação
Salário base + comissão automática

Funcionários de Entrega

Cadastro específico para entregas
Controle de CNH e experiência
Integração com sistema de delivery

💰 Sistema de Aluguel

Cálculo automático - Preço × dias de locação
Múltiplos brinquedos - Suporte para vários itens por pedido
Opção de entrega - Serviço de delivery opcional
Comissão automática - Cálculo de 2% para funcionários
Relatório completo - Resumo detalhado da transação

🏗️ Arquitetura
Padrão de Herança
Pessoa (classe pai)
├── Cliente
└── Funcionario
    ├── FuncionarioAluguel
    └── FuncionarioEntrega
Classes Principais

Pessoa - Classe base com dados pessoais
Cliente - Extends Pessoa, adiciona dados comerciais
Funcionario - Extends Pessoa, adiciona dados trabalhistas
Brinquedo - Produto principal do sistema
Categoria - Classificação e precificação
Alguel - Transação completa de locação

🔧 Tecnologias Utilizadas

Java - Linguagem principal
Swing (JOptionPane) - Interface gráfica
Collections Framework - Gerenciamento de listas
Programação Orientada a Objetos - Herança, encapsulamento

💼 Regras de Negócio

Comissão de Vendas: Funcionários de aluguel recebem 2% sobre o valor total
Precificação Dinâmica: Valor final = preço da categoria × dias de aluguel
Entrega Opcional: Sistema permite escolha entre retirada e entrega
Múltiplos Produtos: Um aluguel pode conter vários brinquedos
Controle de Funcionários: Diferentes tipos com especializações distintas

🚀 Como Usar

Execute a classe teste.java
Cadastre as informações do cliente
Registre o funcionário responsável
Selecione os brinquedos desejados
Escolha entre retirada ou entrega
Confirme a transação e visualize o resumo
