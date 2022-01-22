import { Component, OnInit } from '@angular/core';
import { User } from '../@types/user';
import { RoomService } from '../user.service';

@Component({
  selector: 'app-tamplate-form',
  templateUrl: './tamplate-form.component.html',
  styleUrls: ['./tamplate-form.component.css']
})
export class TamplateFormComponent implements OnInit {


  user: User = {
    name: '',
    email: '',
    telefone: ''
  };


  constructor(private roomService: RoomService) { }



  ngOnInit() { }

  onSubmit(form: any) {
    console.log(this.user);
    this.roomService.createUser(this.user).subscribe(
      success => alert('Usuário cadastrado com sucesso!'),
      error => console.log(error)
    );
    //Limpa o formulario
    form.reset();
  }


  // onSubmit(form: NgForm) {
  //   console.log(form);
  // }




}
