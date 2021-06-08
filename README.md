<center>
	<img src="https://raw.githubusercontent.com/samvkn/guestbook-api/main/images/logo.png?token=ANLIBTRHKPH3YMQCZH3IIG3AX6K7C">
</center>

---

![United Kingdom's flag](https://raw.githubusercontent.com/samvkn/guestbook-api/main/images/uk.png?token=ANLIBTUV26OU44PWHM5IO3DAX6KNE)
**Guestbook API** is a college project on Java & Cloud services. It consists on a REST-like API built with [Spring Framework](https://spring.io/) and hosted on [Heroku](https://heroku.com) that the user can see messages left from guests, delete a message and also leave his/her own messages. The API in itself is very simple, but the concepts applied to building it were a thrill to learn.


![Brazil's flag](https://raw.githubusercontent.com/samvkn/guestbook-api/main/images/brazil.png?token=ANLIBTQ25TXJ7FIQSYEWW33AX6KEG)
**Guestbook API** é um projeto de faculdade sobre Java e serviços de cloud. Ele consiste em uma API REST-like construída com [Spring Framework](https://spring.io/) e hospedado no [Heroku](https://heroku.com) onde o usuário pode ver mensagens deixadas por visitantes, deletar uma mensagem e também deixar suas próprias mensagens. A API por si só é bastante simples mas os conceitos aplicados na sua construção foram muito divertidos de se aprender.


## :books: Documentação

A API usa o formato JSON para retornar as mensagens dos visitantes e criar novas mensagens (é possível criar mensagens exepcionalmente com query params, essa opção não é a ideal mas resolvi implementar para que fosse possível consumir, e de tabela corrigir a API 100% pelo navegador sem precisar de um software extra como o Postman, Insomnia e etc).

### :earth_americas: Consumir via navegador

O endereço da API é [samvkn-guestbook.herokuapp.com](https://samvkn-guestbook.herokuapp.com) através dele podemos consumir a API pelo navegador. Recomendo usar uma extensão como o [JSONViewer](https://chrome.google.com/webstore/detail/json-viewer/gbmdgpbipfallnflgajpaliibnhdgobh?hl=pt-BR) para visualizar melhor as respostas.

### :gear: Consumir via software
Existem alguns software para debugar APIs disponíveis, o mais famoso deles é o [Postman](https://www.postman.com/), mas recomendo o Insomnia por ser de código aberto e completamente grátis. Tem também algumas extensões do chrome que são muito simples, basta procurar na loja de extensões por [REST Client](https://chrome.google.com/webstore/detail/yet-another-rest-client/ehafadccdcdedbhcbddihehiodgcddpl?hl=pt-BR) e várias opções vão aparecer.

## :round_pushpin: Endpoints

**GET** `samvkn-guestbook.herokuapp.com/` Retorna todas as mensagens ordenadas por id.

**GET** `samvkn-guestbook.herokuapp.com/messages/{id}` Retorna a mensagem correspondente à id passada via route param.

**GET** `samvkn-guestbook.herokuapp.com/messages/by-signature?signature={assinatura}` Retorna todas as mensagens com a assinatura correspondente ao parâmetro signature.

**GET** `samvkn-guestbook.herokuapp.com/messages/random` Retorna uma mensagem aleatória.

**POST** `samvkn-guestbook.herokuapp.com/messages/new` Recebe um JSON no formato {"message": "Mensagem", "signature": "Assinatura"} e cria (e retorna) uma nova mensagem.

**GET** `samvkn-guestbook.herokuapp.com/messages/new?message={Assinatura}&signature={Assinatura}` Cria e retorna uma nova mensagem baseado nos parâmetros message e signature passados via query params.

**GET** `samvkn-guestbook.herokuapp.com/messages/delete/{id}` Deleta a mensagem pela id passada no route param.

---

### :page_with_curl: Créditos

Ícone do logo por **Kiranshastry** via [Flaticon](https://www.flaticon.com/authors/kiranshastry)
Fonte do logo **Comfortaa** via [Google Fonts](https://fonts.google.com)
Ícones das bandeiras do Brasil e Reino Unido via [Iconfinder](https://iconfinder.com)