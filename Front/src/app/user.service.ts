import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './@types/user';

@Injectable({
  providedIn: 'root'
})

export class RoomService {


  private baseUrl = 'http://localhost:8080/user';

  constructor(private http: HttpClient) { }



  createUser(user: User) {
    return this.http.post(`${this.baseUrl}`, user);
  }


}
