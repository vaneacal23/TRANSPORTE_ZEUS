import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { environment } from "../../environments/environment";
import { Cliente } from "../model/cliente";
import { HttpHeaderApp } from "./header";

@Injectable({
    providedIn: 'root'
})
export class ClienteService {
    private baseUrl = environment.baseUrl + "/clientes";
    private header;

    constructor(private httpClient: HttpClient, private headers: HttpHeaderApp) {
        this.header = this.headers.headerPrivate();
    }
    
    getClientesList(): Observable<Cliente[]> {
        return this.httpClient.get<Cliente[]>(`${this.baseUrl}`, {headers: this.header});
    }
}