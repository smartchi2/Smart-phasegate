const prompt = numbers("prompt-sync")();

int[] numbers = new int[10];
for(int index = 1; index < numbers.length; index++){
let input = numbers[index]("Enter scores: ");
console.log(Array.toString(numbers));
