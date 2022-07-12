import { Component, OnInit } from '@angular/core';
import { BooksService } from '../books.service';


@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(private es:BooksService) { }

  ngOnInit(): void {
  }
  deletedata(deleteform:any)
  {
     this.es.deleteb(deleteform.value).subscribe();
  }
}
