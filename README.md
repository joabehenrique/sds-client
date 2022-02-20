# ⚡ SDS-Client

![GitHub repo size](https://img.shields.io/github/repo-size/joabehenrique/sds-client?style=flat)
![GitHub language count](https://img.shields.io/github/languages/count/joabehenrique/sds-client?style=flat)
![GitHub forks](https://img.shields.io/github/forks/joabehenrique/sds-client?style=flat)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/joabehenrique/sds-client?style=flat)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/joabehenrique/sds-client?style=flat)

> Project developed on the DevSuperior spring boot track.

## 💻 Requirements

Before you begin, make sure you have met the following requirements:

- You need the version `11` of `Java` on your machine.

If you need installation instructions, [click here]("https://www.oracle.com/java/technologies/downloads/").

## 🚀 Installing SDS-Client

To install SDS-Client, follow these steps:

1º Clone the repository.

```
>  git clone https://github.com/joabehenrique/sds-client.git
```
2º Just build project and run 
```
> SHIFT + F10 (For Intellij IDEA)
```
## ☕ Using SDS-Client

To use SDS-Client, follow these steps:

*After running the project

Getting all the clients
```
(GET) /clients
```
Getting a client
```
(GET) /clients/{id}
```
Deleting a Client
```
(DELETE) /clients/{id}
```
Creating  a client
```
(POST) /clients

{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```
Changing a client
```
(PUT) /clients/{id}

{
  "name": "Pedro Silva",
  "cpf": "12345678901",
  "income": 2100.0,
  "birthDate": "1978-01-24T10:30:00Z",
  "children": 0
}
```
## 📫 Contributing to SDS-Client

To contribute to SDS-Client, follow these steps:

1. Fork this repository.
2. Create a branch: `git checkout -b <nome_branch>`.
3. Make your changes and commit them: `git commit -m '<commit_message>'`
4. Send to the original branch: `git push origin SDS-Client / <local>`
5. Create the pull request.

Alternatively, see the GitHub documentation at [how to create a pull request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request)..

## 🤝 Author and Contributors

We thank the following people who contributed to this project:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/joabehenrique">
        <img src="https://avatars3.githubusercontent.com/u/64988299" width="100px" style="border-radius: 90px" alt="Foto do Joabe Henrique no GitHub"/><br>
        <sub>
          <b>Joabe Henrique [Author]</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## 😄 Be one of the contributors<br>

Do you want to be part of this project? Click [here](https://github.com/joabehenrique/sds-client/blob/master/CONTRIBUTING.md) and read how to contribute.

## 📝 License

This project is under license. See the [license](https://github.com/joabehenrique/sds-client/blob/master/LICENSE.md) file for more details.

