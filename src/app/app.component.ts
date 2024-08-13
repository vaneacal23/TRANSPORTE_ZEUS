import { Component, OnInit } from '@angular/core';
import { ClienteService } from './service/cliente.service';
import { Cliente } from './model/cliente';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {
  title = 'Transportadora Zeus';
  cliente: Cliente[] = [] ;

  constructor(
    private clienteService: ClienteService
  ){}

  ngOnInit(): void{
    this.getClientes();
  }

  getClientes(){
    this.clienteService.getClientesList().subscribe(data => {
      this.cliente = data;
      console.log(this.cliente);
    },error => {
      console.log(error);
    })
  }
}
