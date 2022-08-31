<h1 align="center"> 🎟 Venda de Ingressos  </h1>
<p id="descrição" align="center"> Um sistema sismples de venda de ingressos para shows e eventos. Atividade MAPA da matéria de Programação I </p>
 
<div align="center">
  <img src="https://img.shields.io/static/v1?label=Faculdade&message=Unicesumar&color=4e2bd5&style=flat"/>
  <img src="https://img.shields.io/static/v1?label=Curso&message=ADS&color=4e2bd5&style=flat"/>
  <img src="https://img.shields.io/static/v1?label=Matéria&message=Programação I&color=4e2bd5&style=flat"/>
  <img src="https://img.shields.io/static/v1?label=IDE&message=NetBeans 12.4&color=4e2bd5&style=flat"/>
</div>

<div align="center">
 <a href="#descrição">Descriçao</a> •
 <a href="#enunciado">Enunciado</a> • 
 <a href="#prints">Screen Shots</a> • 
 <a href="#tecnologias">Tecnologias</a> • 
 <a href="#autor">Autor</a>
</div>

<h3 id="enunciado"> 🔎 Enunciado da questão </h3>

<p> O setor de eventos foi um dos mais atingidos pelas restrições da pandemia da COVID 19. </p>

<blockquote>
<p>“Responsável por pouco mais de 4% do PIB brasileiro, o setor de eventos foi um dos mais abalados pela pandemia da covid-19. Estima-se que as medidas restritivas impactaram 97% das empresas do setor, que deixaram de faturar ao menos R$ 230 bilhões em 2020 e 2021, segundo a Associação Brasileira de Promotores de Eventos (Abrape).” <cite>(Revista EXAME 2022)</cite></p>
</blockquote>

<p> Já para 2022 o cenário é outro, depois de tanto tempo, os eventos voltaram com tudo, um exemplo disso é o Rock in Rio 2022, evento que acontecerá em setembro de 2022 teve seus ingressos esgotados em poucas horas, mostrando a alta procura nesse período pós pandemia. </p>

<p> Sabendo disso você foi contratado para desenvolver um sistema de venda de ingressos para shows e eventos. Esse sistema deverá conter as seguintes regras: </p>

<ul>
<li> Armazenar dados de Evento: evento deverá ter como atributos, <b>nome, data, valor único, capacidade máxima</b> e uma <b>lista de ingressos vendidos</b>, essas informações são obrigatórias. </li>
<li> Armazenar dados de Ingresso: todo ingresso deverá ser nominal, portanto deverá ter o <b>nome, CPF</b> e o <b>evento relacionado</b>. </li>
<li> Devem existir 3 categorias de ingresso, <b>Ingresso Pista, Ingresso VIP</b> e <b>Ingresso Camarote</b>. </li>
<li> Nas classes de Ingressos, devem existir um método de <b>calcular valor do ingresso</b>, onde Pista é o valor único do evento, no VIP deve-se adicionar 30% sobre o valor único do evento e no Camarote adicionar 60%. </li>
<li> Para ingresso é preciso também um método <b>mostrar resumo</b>, onde mostrará o nome e o CPF do dono do ingresso e os dados do evento, como nome do evento e a data. </li>
<li> Para cada tipo de ingresso, crie um método <b>imprimirValor</b> que retorna o tipo do ingresso com o valor calculado. </b>
<li> Para evento deve existir um método <b>vender ingresso</b>, no qual irá adicionar o ingresso criado na lista, verificando se não excede a capacidade máxima do evento. </li>
<li> Para evento deve existir também um método pra <b>mostrar a quantidade de ingressos vendidos</b>. </li>
</ul>

<p>Para funcionamento do programa, poderá ser criado uma classe Principal para que se crie os objetos e executem os métodos, sem ter a necessidade da criação de uma interação com usuário, os dados para os testes devem ser fictícios. </p>

<h3 id="prints"> 📌 Screen Shots </h3>

<p> Dados do evento em questão: </p>
<img src="./images/dados-iniciais-evento.PNG">

<p> Valor de cada tipo de ingresso: </p>
<div>
  <img src="./images/valor-ingresso-pista.PNG">
  <img src="./images/valor-ingresso-vip.PNG">
  <img src="./images/valor-ingresso-camarote.PNG">
</div>

<p> Venda de ingressos: </p>
<div>
  <img src="./images/venda-ingresso1.PNG">
  <img src="./images/venda-ingresso2.PNG">
  <img src="./images/venda-ingresso3.PNG">
</div>

<p> Venda de ingresso com dados incompletos: </p>
<img src="./images/venda-ingresso-dados-faltando.PNG">

<p> Venda de ingresso quando a capacidade máxima foi excedida: </p>
<img src="./images/venda-ingresso-capacidade-excedida.PNG">

<p> Quantidade de ingressos vendidos: </p>
<img src="./images/quantidade-ingressos-vendidos.PNG">

<h3 id="tecnologias"> 🛠 Tecnologias </h3

<p>As seguintes ferramentas foram usadas na construção do projeto:</p>

<ul>
<li><a href="https://www.java.com/pt-BR/">Java</a></li>
</ul>

<h3 id="autor">👩‍💻 Autor</h3>
<img src="./images/autor.jpg" height="70px"/>
<p><b>Taissa Silva</b></p>

[![Linkedin Badge](https://img.shields.io/badge/-Taissa-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/taissa-silva-39a4171b5/)](https://www.linkedin.com/in/taissa-silva-39a4171b5/) 
[![Gmail Badge](https://img.shields.io/badge/-staissa002@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:staissa002@gmail.com)](mailto:staissa002@gmail.com)
