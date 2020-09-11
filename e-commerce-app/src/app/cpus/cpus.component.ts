import { Component, OnInit } from '@angular/core';
import { Cpu } from "../cpu";

@Component({
  selector: 'app-cpus',
  templateUrl: './cpus.component.html',
  styleUrls: ['./cpus.component.css']
})
export class CpusComponent implements OnInit {

  cpuArray: Cpu[] = [
    {
      cores: 16,
      name: "ryzen 7 2700x",
      price: 150
    },
    {
      cores: 3000,
      name: "a;lsdkfjpajnfv[oi",
      price: 150093
    },
    {
      cores: 8,
      name: "some other cpu",
      price: 123
    },
  ];

  chooseCpu(cpu: Cpu) {
    this.chosenCpu = cpu;
  }
  chosenCpu = null;

  constructor() { }

  ngOnInit(): void {
  }

}
