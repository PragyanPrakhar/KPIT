function calculateTip() {
    const bill = parseFloat(document.getElementById("bill").value);
    const tipPercent = parseFloat(document.getElementById("tip").value);
    if (isNaN(bill) || isNaN(tipPercent)) {
        document.getElementById("totalResult").innerText =
            "Enter valid numbers.";
        return;
    }
    const tipAmount = bill * (tipPercent / 100);
    const total = bill + tipAmount;
    document.getElementById(
        "totalResult"
    ).innerText = `Tip: ₹${tipAmount.toFixed(2)}, Total: ₹${total.toFixed(2)}`;
}
