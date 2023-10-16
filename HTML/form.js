document.getElementById("surveyForm").addEventListener("submit", function (e) {
  e.preventDefault();

  // Collect user input
  const Name = document.getElementById("Name").value;
  const gender = [...document.querySelectorAll("input[name='gender']:checked")]
    .map((e) => e.nextElementSibling.textContent)
    .join(", ");
});
