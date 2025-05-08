function calculateAge() {
    const dob = new Date(document.getElementById("dob").value);
    if (!dob.getTime()) {
        document.getElementById("ageResult").innerText =
            "Please select a valid date.";
        return;
    }
    const diff = Date.now() - dob.getTime();
    const age = new Date(diff).getUTCFullYear() - 1970;
    document.getElementById(
        "ageResult"
    ).innerText = `You are ${age} years old.`;
}
