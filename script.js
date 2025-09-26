function play(userChoice) {
    const choices = ["Rock", "Paper", "Scissors"];
    const computerChoice = choices[Math.floor(Math.random() * 3)];

    // Display user and computer choices
    document.getElementById("user-choice").innerText = "You chose: " + userChoice;
    document.getElementById("computer-choice").innerText = "Computer chose: " + computerChoice;

    // Determine winner
    let winner = "";
    if (userChoice === computerChoice) {
        winner = "It's a tie!";
    } else if (
        (userChoice === "Rock" && computerChoice === "Scissors") ||
        (userChoice === "Paper" && computerChoice === "Rock") ||
        (userChoice === "Scissors" && computerChoice === "Paper")
    ) {
        winner = "You win!";
    } else {
        winner = "Computer wins!";
    }

    // Display the result
    document.getElementById("winner").innerText = winner;
}
