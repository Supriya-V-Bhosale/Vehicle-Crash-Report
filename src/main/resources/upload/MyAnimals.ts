import { Animals } from "./Animals.js";
import { IMammles } from "./IMammles.js";

export class MyAnimals implements IMammles ,Animals{

    bodyTemp:number=0;

    setBodyTemp(temp:number){
        this.bodyTemp=temp;
    }

    saySomething(): string {
        return "";
    }

    getBodyTemp(): number {
        return this.bodyTemp;
    }
    
}