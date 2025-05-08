let dark = false;
function toggleMode() {
    const page = document.getElementById("page");
    dark = !dark;
    page.className = dark ? "dark" : "light";
}
