// Get references to HTML elements
const chatLog = document.getElementById('chat-log');
const userInput = document.getElementById('user-input');
const sendButton = document.getElementById('send-button');

// Define the chatbot responses
const chatbotResponses = [
    "Hello! How can I assist you today?",
    "What can I help you with?",
    "Feel free to ask any questions.",
    "I'm here to provide information.",
];

// Function to add a message to the chat log
function addMessage(message, sender) {
    const messageElement = document.createElement('div');
    messageElement.classList.add('message', sender);
    messageElement.innerText = message;
    chatLog.appendChild(messageElement);
    chatLog.scrollTop = chatLog.scrollHeight;
}

// Function to handle user input
function handleUserInput() {
    const userMessage = userInput.value;
    if (userMessage.trim() === '') return;

    addMessage(userMessage, 'user');
    userInput.value = '';

    // Simulate a delayed response from the chatbot
    setTimeout(() => {
        const randomResponse = chatbotResponses[Math.floor(Math.random() * chatbotResponses.length)];
        addMessage(randomResponse, 'bot');
    }, 1000);
}

// Event listener for the send button
sendButton.addEventListener('click', handleUserInput);

// Event listener for the Enter key
userInput.addEventListener('keyup', (event) => {
    if (event.key === 'Enter') {
        handleUserInput();
    }
});

// Initial greeting from the chatbot
addMessage("Hello! How can I assist you today?", 'bot');
