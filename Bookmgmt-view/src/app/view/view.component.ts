import { Component, OnInit } from '@angular/core';

import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { BooksService } from '../books.service';
@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  constructor(private es:BooksService) { this.viewdata();}
  
  data1:any;
  ngOnInit(): void {}
      viewdata()
      { 
      this.es.viewb().subscribe(
        (res)=>{this.data1=res}
      );
    }
      }