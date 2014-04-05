function init() {

    t = document.createElement("p");
    t.innerText = "It is now " + (new Date());
    document.body.appendChild(t);
}
window.onload=init;