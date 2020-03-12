/*
* Copyright (C) 2016 by Citigroup. All rights reserved.
* Citigroup claims copyright in this computer program as an unpublished work,
* one or more versions of which were first used to provide services to
* customers on the dates indicated in the foregoing notice. Claim of
* copyright does not imply waiver of other rights.
*
* NOTICE OF PROPRIETARY RIGHTS
*
* This program is a confidential trade secret and the property of Citigroup.
* Use, examination, reproduction, disassembly, decompiling, transfer and/or
* disclosure to others of all or any part of this software program are
* strictly prohibited except by express written agreement with Citigroup.
*/

package com.certificatic.tarjetas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuration class for swagger-ui interface.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


  /**
   * Required bean for scanning the existing API's in project and generating the swagger-ui.
   * interface.
   */
  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false).select()
            .apis(RequestHandlerSelectors.basePackage("com.certificatic.tarjetas.api"))
            .build().apiInfo(apiInfo());
  }

  /**
   * Builder of the ApiInfo.
   */
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("Tarjetas Digitales API")
            .description("API para administracion de tarjetas digitales")
        .version("1.0")
        .contact(new Contact("Eduardo Castillo Mendoza",
                "www.certificatic.org",
                "ecastillo@certificatic.org")).build();
  }

}
