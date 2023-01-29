import { MyAnimals } from "./MyAnimals.js";


export class Cat implements MyAnimals{

    bodyTemp: number=0;

    setBodyTemp(temp: number): void {
        this.bodyTemp=temp;
    }
    saySomething(): string {
       return "Cats says Meoow..";
    }
    getBodyTemp(): number {
        return this.bodyTemp;
    }
    
}