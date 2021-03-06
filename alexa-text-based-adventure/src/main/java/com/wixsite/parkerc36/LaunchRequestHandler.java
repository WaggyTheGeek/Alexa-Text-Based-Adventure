/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wixsite.parkerc36;

 import com.amazon.ask.dispatcher.request.handler.HandlerInput;
 import com.amazon.ask.dispatcher.request.handler.RequestHandler;
 import com.amazon.ask.model.LaunchRequest;
 import com.amazon.ask.model.Response;
 import com.amazon.ask.request.Predicates;

 import java.util.Optional;

 public class LaunchRequestHandler implements RequestHandler {

      @Override
      public boolean canHandle(HandlerInput input) {
          return input.matches(Predicates.requestType(LaunchRequest.class));
      }

      @Override
      public Optional<Response> handle(HandlerInput input) {
          
          String speechText = "Welcome to Alexas Text Based Adventure, say play game to play?";
          return input.getResponseBuilder()
                  .withSpeech(speechText)
                  .withSimpleCard("Alexa's Text Based Adventure", speechText)
                  .withReprompt(speechText)
                  .build();
      }
      

 }