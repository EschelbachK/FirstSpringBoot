package org.example.firstspringboot.controller;

import org.example.firstspringboot.model.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final List<Message> messages = new ArrayList<>();

    public MessageController() {
        messages.add(new Message("1", "Kai", "Seid gegrüßt!"));
        messages.add(new Message("2", "Lisa", "Wie geht es dir?"));
    }
    // GET http://localhost:8080/api/messages
    @GetMapping
    public List<Message> getMessages() {
        return messages;
    }

   /* >> POST http://localhost:8080/api/messages
   >> raw >> JSON >>  Content-Type: application/json
    {
    "id": "243",
    "name": "Kai",
    "message": "Hats es funktioniert?"
}
     */
    @PostMapping
    public Message postMessage(@RequestBody Message newMessage) {
        messages.add(newMessage);
        return newMessage;
    }

    // DELETE http://localhost:8080/api/messages/+ID
    @DeleteMapping("/{id}")
    public String deleteMessage(@PathVariable String id) {
        boolean removed = messages.removeIf(message -> message.getId().equals(id));

        if (removed) {
            return "Nachricht mit ID " + id + " wurde gelöscht.";
        } else {
            return "Keine Nachricht mit ID " + id + " gefunden.";
        }
    }
}
