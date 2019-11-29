package com.sekhanov.shopapi.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.sekhanov.shopapi.data.model.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * BookListJsonSerialiser
 */
public class BookListJsonSerializer extends StdSerializer<Set<Book>> {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    private class JsonBook {       

        Long id;
        String name;
    }

    public BookListJsonSerializer() {
        this(null);
    }

    protected BookListJsonSerializer(Class<Set<Book>> t) {
        super(t);
        // TODO Auto-generated constructor stub
    }

    private static final long serialVersionUID = 1L;

    @Override
    public void serialize(Set<Book> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        Set<JsonBook> result = new HashSet<>();
        value.forEach(e -> result.add(new JsonBook(e.getId(), e.getName())));
        gen.writeObject(result);
    }

    
}