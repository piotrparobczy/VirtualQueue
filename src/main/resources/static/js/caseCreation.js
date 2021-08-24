document.addEventListener("DOMContentLoaded", function () {

        let pin = document.getElementById("pin")
        let vip = document.getElementById("vip")
        let emergency = document.getElementById("emergency")
        let normal = document.getElementById("normal")

        emergency.onclick = function () {
            if (pin.classList.contains('hidden')) {
                pin.classList.remove('hidden')
            }
        }
        vip.onclick = function () {
            if (pin.classList.contains('hidden')) {
                pin.classList.remove('hidden')
            }
        }
        normal.onclick = function () {
            if (!pin.classList.contains('hidden')) {
                pin.classList.add('hidden')
            }
        }


    }
)