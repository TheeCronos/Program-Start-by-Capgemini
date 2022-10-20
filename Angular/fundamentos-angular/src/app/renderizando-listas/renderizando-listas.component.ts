import { Component, OnInit } from '@angular/core';
import { Celular } from '../types/Celular';

@Component({
  selector: 'app-renderizando-listas',
  templateUrl: './renderizando-listas.component.html',
  styleUrls: ['./renderizando-listas.component.css']
})
export class RenderizandoListasComponent{

  celulares: Celular[] = [
    { id: 1, nome: "Redmi note 11", descricao: "Celular Xiaomi", esgotado: false},
    { id: 2, nome: "Redmi note 10", esgotado: false},
    { id: 3, nome: "Redmi note 10s", descricao: "Celular Xiaomi", esgotado: true}
  ]
}
