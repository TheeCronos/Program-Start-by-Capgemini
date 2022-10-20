import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-segundo-componente',
  templateUrl: './segundo-componente.component.html',
  styleUrls: ['./segundo-componente.component.css']
})
export class SegundoComponenteComponent {

  nome = "João";
  dataNascimento = "1995-06-26";
  urlImagem = "/assets/rm.jpeg";

  mostrarDataNascimento(){
    alert(`A data de nascimento do João é: ${this.dataNascimento}`)
  }
}
