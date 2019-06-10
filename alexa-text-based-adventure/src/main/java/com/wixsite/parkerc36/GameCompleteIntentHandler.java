/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wixsite.parkerc36;

 import com.amazon.ask.dispatcher.request.handler.HandlerInput;
 import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.dispatcher.request.handler.impl.IntentRequestHandler;
import com.amazon.ask.model.DialogState;
import com.amazon.ask.model.Intent;
import com.amazon.ask.model.IntentRequest;
 import com.amazon.ask.model.Response;
import com.amazon.ask.model.Slot;
 import com.amazon.ask.request.Predicates;

import java.util.Optional;

 public class GameCompleteIntentHandler implements IntentRequestHandler {

      public GameStart g = new GameStart();
     
      @Override
      public boolean canHandle(HandlerInput input, IntentRequest intentRequest) {
         return input.matches(Predicates.intentName("PlayGameIntent")) && intentRequest.getIntent().getSlots().get("ApproachCastle") != null;
      }

      @Override
      public Optional<Response> handle(HandlerInput input, IntentRequest req) {
          Intent intent = req.getIntent();
          Slot approachCastle = intent.getSlots().get("BigHype");
          
          String speechText;
          if (approachCastle.getValue() == "towards")
          {
              speechText = "You win";
          }
          
          else
          {
            speechText = "You lose";
          }
          
          return input.getResponseBuilder()
                  .withSpeech(speechText)
                  .withSimpleCard("HelloWorld", speechText)
                  .build();
      }
 }