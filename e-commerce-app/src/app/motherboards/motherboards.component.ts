import { Component, OnInit } from '@angular/core';
import { Motherboard } from "../motherboard";

@Component({
  selector: 'app-motherboards',
  templateUrl: './motherboards.component.html',
  styleUrls: ['./motherboards.component.css']
})
export class MotherboardsComponent implements OnInit {
  motherboards: Motherboard[] = [
    {
      price: 200,
      name: "msi pro carbon something",
      manufacturer: "MSI"
    },
    {
      price: 150,
      name: "i don't even know anymore",
      manufacturer: "AMD IG UESS"
    }
  ]

  chooseMotherboard(mb: Motherboard) {
    this.selectedMotherboard = mb;
  }

  selectedMotherboard: Motherboard = null;

  constructor() { }

  ngOnInit(): void {
  }

}
