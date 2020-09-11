import { Component, OnInit } from '@angular/core';
import { Gpu } from "../gpu";

@Component({
  selector: 'app-gpus',
  templateUrl: './gpus.component.html',
  styleUrls: ['./gpus.component.css']
})
export class GpusComponent implements OnInit {

  gpus: Gpu[] = [
    {
      raytracing: true,
      price: 700,
      name: 'rtx 2070 super'
    },
    {
      raytracing: false,
      price: 300,
      name: "an amd gpu"
    }
  ]

  chooseGpu(gpu: Gpu) {
    this.chosenGpu = gpu;
  }
  chosenGpu: Gpu = null;

  constructor() { }

  ngOnInit(): void {
  }

}
