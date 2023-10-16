const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Enter a sentence: ", function (userInput) {
  const reversedSentence = reverseWords(userInput);
  console.log("Reversed sentence: " + reversedSentence);
  rl.close();
});

function ReverseWord(sentence) {
  const words = sentence.split(" ");
  const reversedWords = words.map((word) => {
    return word.split("").reverse().join("");
  });
  const reversedSentence = ReverseWord.join(" ");
  return reversedSentence;
}
