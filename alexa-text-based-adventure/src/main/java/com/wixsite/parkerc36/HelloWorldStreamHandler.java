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

      private static Skill getSkill() {
          return Skills.standard()
                  .addRequestHandlers(
                         new CancelandStopIntentHandler(),
                         new HelloWorldIntentHandler(),
                         new HelpIntentHandler(),
                         new LaunchRequestHandler(),
                         new SessionEndedRequestHandler(),
						 new FallbackIntentHandler())
				  .withSkillId("alexa-text-based-adventure")
                  .build();
      }

      public HelloWorldStreamHandler() {
          super(getSkill());
      }

  }