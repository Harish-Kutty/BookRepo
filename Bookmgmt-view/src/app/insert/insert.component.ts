import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BooksService } from '../books.service';
@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  constructor(private es : BooksService) { }

  ngOnInit(): void {
  }
 
  insertdata(insertform:any)
  {
    this.es.insertb(insertform.value).subscribe();
  }
}

