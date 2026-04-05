package com.lucasgcunha.workshopmongo.services;

import com.lucasgcunha.workshopmongo.domain.Post;
import com.lucasgcunha.workshopmongo.repositories.PostRepository;
import com.lucasgcunha.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
