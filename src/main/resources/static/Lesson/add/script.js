let createLessonForm = document.querySelector("form");
let subjectInput = document.querySelector("#subject");
let dateInput = document.querySelector("#date");
let descriptionInput = document.querySelector("#description");

createLessonForm.addEventListener("submit", event => {
    let lesson = {
        subject: subjectInput.value,
        date: dateInput.value,
        description: descriptionInput.value
    };
    fetch("http://localhost:8080/lesson", {
        method: "post",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify(lesson)
    }).then(r => doNotTrack)});

