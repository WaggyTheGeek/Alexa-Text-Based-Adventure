/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wixsite.parkerc36;

 import com.amazon.ask.Skill;
 import com.amazon.ask.Skills;
 import com.amazon.ask.SkillStreamHandler;

  public class HelloWorldStreamHandler extends SkillStreamHandler {

      @SuppressWarnings("unchecked")
      private static Skill getSkill() {
          return Skills.standard().addRequestHandlers(
                         new CancelandStopIntentHandler(),
                         new PlayGameIntentHandler(),
                         new HelpIntentHandler(),
                         new LaunchRequestHandler(),
                         new GameCompleteIntentHandler(),
                         new SessionEndedRequestHandler()).withSkillId("amzn1.ask.skill.6fc3604e-c62d-4451-a370-4e519cadaeb8").build();
      }

      public HelloWorldStreamHandler() {
          super(getSkill());
      }

  }