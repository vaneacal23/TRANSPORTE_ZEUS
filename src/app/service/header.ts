import { Injectable } from "@angular/core";
import { HttpHeaders } from "@angular/common/http";

@Injectable({
    providedIn: 'root'
})
export class HttpHeaderApp {
    constructor() { }
    public headerPublic = new HttpHeaders({
        'Content-Type': 'appplication/json',
        'Cache-Control': 'no-cache',
        'Pragma': 'no-cache',
        'Expires': '0',
        'Authorization': ''
    })

    public headerPrivate(): any {
        const headerPrivate = new HttpHeaders({
            'Content-Type': 'application/json; charset=utf-8',
            'Cache-Control': 'no-cache',
            'Pragma': 'no-cache',
            'Expires': '0'
        });

        return headerPrivate;
    }
}
