const images = [
    "https://images.pexels.com/photos/6686455/pexels-photo-6686455.jpeg?auto=compress&cs=tinysrgb&w=600",
    "https://images.pexels.com/photos/8721318/pexels-photo-8721318.jpeg?auto=compress&cs=tinysrgb&w=600",
    "https://images.pexels.com/photos/2426085/pexels-photo-2426085.jpeg?auto=compress&cs=tinysrgb&w=600",
];
let current = 0;
function showImage(index) {
    document.getElementById("slide").src = images[index];
}
function next() {
    current = (current + 1) % images.length;
    showImage(current);
}
function prev() {
    current = (current - 1 + images.length) % images.length;
    showImage(current);
}
