//a.) module web
//b.) 8/14/23
//c.) Francisco Orellana
//d.) In this module it does two things. One it opens our port that displays our interface. It also contacts the html file and more.
//e.) We really need this or we would not be able to show the work we have been commiting to this assignment. 

const { execFile } = require('child_process');

const express = require('express');
const web = express(); 

const nodemailer = require("nodemailer");

const server = process.env.PORT || 9000;

web.use(express.static('public')); 
web.use(express.json()); 

web.get('/', (req, res) => {
    res.sendFile(__dirname + '/public/contact.html'); // Send the contact form HTML
});

web.post('/', (req, res) => {
    console.log(req.body); 

   
    const transporter = nodemailer.createTransport({
        service: 'gmail',
        auth: {
            user: 'codesign23@gmail.com', // The Gmail account used to send the email.
            pass: '1234 1234 1234 5678', // Password for above
        }
    });

    
    const mailOptions = {
        from: req.body.email, // The sender's email address from the form.
        to: 'codesign23@gmail.com', // The email address to receive the form data.
        subject: 'Contact Form ', // Subject line for the email.
        html: `
            <h2 style="color: #333;">Contact Form</h2>
            <p><strong>Name:</strong> ${req.body.name}</p>
            <p><strong>Email:</strong> ${req.body.email}</p>
            <p><strong>Subject:</strong> ${req.body.subject}</p>
            <p><strong>Message:</strong><br>${req.body.message}</p>
        `
    };

    
    transporter.sendMail(mailOptions, (error, info) => {
        if (error) {
            console.log(error); 
            res.status(500).send('Error sending email'); 
        } else {
            console.log('Email sent: ' + info.response); 
            res.status(200).send({ status: 'success' }); 
        }
    });

});

// Start the sever
web.listen(server, () => {
    console.log(`http://localhost:${server}`); // Print the server URL 
});
