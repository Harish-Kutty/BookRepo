import { Component, OnInit } from '@angular/core';
import { BooksService } from '../books.service';


@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private es :BooksService) { }

  ngOnInit(): void {
  }

  updatedata(updateform:any)
  {
    this.es.updatedetail(updateform.value).subscribe();
  }
}