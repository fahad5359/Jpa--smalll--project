package com.example.iivote;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IivoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(IivoteApplication.class, args);
    }

    @Bean

    public CommandLineRunner run(IdeaVote ig){   // So  in here we run the  interface  //    We must nbame the argumants the same as our interface.

        return (args -> {
            newPersonn(ig);
//            System.out.println(ig.findAll());
//            زي ما عطينا الكويري اللي بالداو   بارامييتر لازم نردلها باراميتر بعد
//            System.out.println(  ig.findByUserNem("fahad13"));
//            System.out.println(ig.findAllByUserNem());

        });
    }

//    We must nbame the argumants the same as our interface.
    private void newPersonn(IdeaVote iig){
//        iig.save(
    iig.save(new Personn("hamoodiexx","fadw3@gmail.com",98213));
    iig.save(new Personn("kkalhaf123","lok@gmail.com",9213));
    iig.save(new Personn("Saad552","sa43@gmail.com",91241233));
    iig.save(new Personn("lokie76","loike@gmail.com",2132133313));

    }
}


