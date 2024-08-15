//a.) module sever
//b.) 8/14/23
//c.) Francisco Orellana
//d.) In this module we have a few stuff going on and this includes gettting the guest's input. This input connects to our contact form which guest have the opportunity to voice their option
//e.) We need this in order for the guest to be able to give their feedback, concerns, or pretty much anything they need 

// Get the HTML
const contactForm = document.querySelector('.contact-form');

// Get individual input fields from the form using their IDs.
let fullname = document.getElementById('name');
let email = document.getElementById('email');
let subject = document.getElementById('subject');
let message = document.getElementById('message');


contactForm.addEventListener('submit', (e) => {
    e.preventDefault(); 

    // Store
    let formData = {
        name: fullname.value, 
        email: email.value, 
        subject: subject.value, 
        message: message.value, 
    };

    
    let xhr = new XMLHttpRequest();
    xhr.open('POST', '/'); 
    xhr.setRequestHeader('content-type', 'application/json'); 

   //Body

    xhr.onload = function() {
        console.log(xhr.responseText); 
        if (xhr.responseText == 'success') {
            alert('Email Sent');   

            // Clear the after submission
            fullname.value = '';
            email.value = '';
            subject.value = '';
            message.value = '';
        } else {
            alert('Something went wrong!'); // Show an error if something went wrong
        }
    };

    
    xhr.send(JSON.stringify(formData));
});
