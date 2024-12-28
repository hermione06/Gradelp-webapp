document.getElementById("gradesForm").onsubmit = function(event) {
        event.preventDefault();

        // Capture the grades from the form
        const grades = [
            { "name": "math1-notebook","grade": document.getElementById("math1-notebook").value },
            { "name": "math1-first-written","grade": document.getElementById("math1-first-written").value },
            { "name": "math1-second-written","grade": document.getElementById("math1-second-written").value },
            { "name": "english-written-production","grade": document.getElementById("english-written-production").value },
            { "name": "english-oral-evaluation","grade": document.getElementById("english-oral-evaluation").value },
            { "name": "english-written-exam","grade": document.getElementById("english-written-exam").value },
            { "name": "physics-fluid-mechanics","grade": document.getElementById("physics-fluid-mechanics").value },
            { "name": "physics-thermodynamics","grade": document.getElementById("physics-thermodynamics").value },
            { "name": "physics-point-mechanics","grade": document.getElementById("physics-point-mechanics").value },
            { "name": "chemistry-first-written","grade": document.getElementById("chemistry-first-written").value },
            { "name": "chemistry-second-written","grade": document.getElementById("chemistry-second-written").value },
            { "name": "chemistry-practical-work","grade": document.getElementById("chemistry-practical-work").value },
            { "name": "chemistry-reports","grade": document.getElementById("chemistry-reports").value },
            { "name": "chemistry-practical-behaviour","grade": document.getElementById("chemistry-practical-behaviour").value },
            { "name": "front-end-participation","grade": document.getElementById("front-end-participation").value },
            { "name": "front-end-project","grade": document.getElementById("front-end-project").value },
            { "name": "front-end-written","grade": document.getElementById("front-end-written").value },
            { "name": "dsa-practical","grade": document.getElementById("dsa-practical").value },
            { "name": "dsa-written","grade": document.getElementById("dsa-written").value },
            { "name": "cs-practical","grade": document.getElementById("cs-practical").value },
            { "name": "cs-first-written","grade": document.getElementById("cs-first-written").value },
            { "name": "cs-second-written","grade": document.getElementById("cs-second-written").value }
        ];

        // Send the grades to the backend using fetch
        fetch('http://localhost:8080/grades/calculate', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(grades)
        })
        .then(response => response.json())
        .then(data => {
            console.log('Average:', data); 
            document.getElementById("overallAverage").textContent = data.toFixed(2); // Display result // Handle the response (average grade)
        })
        .catch(error => console.error('Error:', error));
};
