document.getElementById("myForm").addEventListener("submit", function (e) {
    e.preventDefault();
    const name = document.getElementById("name").value.trim();
    const phone = document.getElementById("phone").value.trim();
    const email = document.getElementById("email").value.trim();

    if (!/^[a-zA-Z\s]+$/.test(name)) {
        showMsg("Name must contain only letters.");
    } else if (!/^\d{10}$/.test(phone)) {
        showMsg("Phone must be 10 digits.");
    } else {
        showMsg(`Form Submitted Successfully!`, true);
    }
});

function showMsg(msg, success = false) {
    const m = document.getElementById("msg");
    m.innerText = msg;
    m.style.color = success ? "green" : "red";
}
