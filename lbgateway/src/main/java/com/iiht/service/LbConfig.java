package com.iiht.service;

	import org.springframework.cloud.gateway.route.RouteLocator;
	import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.context.annotation.Bean;

	@Configuration
	public class LbConfig {

		@Bean
		public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
			return 
					builder.routes().
					route(
							"lbservice",
							r->r.path("/test").
							uri("lb://LBSERVICE")
							)
					.build();
		}
	}


