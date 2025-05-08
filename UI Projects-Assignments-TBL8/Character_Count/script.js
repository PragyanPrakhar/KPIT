function countChars() {
    const len = document.getElementById("textInput").value.length;
    document.getElementById("charCount").innerText = `Characters: ${len}`;
}
