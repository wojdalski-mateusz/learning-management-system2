let tableBody = document.querySelector("tbody");

function reloadTable(){
    fetch("http://localhost:8080/lesson")
        .then(response => response.json())
        .then(lessons => {
            tableBody.innerHTML = "";
            lessons.forEach(lesson => {
                let rowElement = document.createElement("tr");
                rowElement.innerHTML = `<td>${lesson.subject}</td><td>${lesson.date}</td><td>${lesson.description}</td>`;
                tableBody.appendChild(rowElement);
            });
        });
}

reloadTable();