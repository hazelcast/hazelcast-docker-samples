package com.hazelcast.springboot.http;

import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

    /**
     * A conditional configuration that potentially adds the bean definitions in
     * this class to the Spring application context, depending on whether the
     * {@code @ConditionalOnExpression} is true or not.
     * <p>
     * When true, beans are added that create a Hazelcast instance, and bind this
     * instance to Tomcat for storage of HTTP sessions, instead of Tomcat's default
     * implementation.
     */
    @Configuration
    @ConditionalOnExpression(Application.USE_HAZELCAST)
    public class HazelcastConfiguration {

        /**
         * Create a Hazelcast {@code Config} object as a bean. Spring Boot will use
         * the presence of this to determine that a {@code HazelcastInstance} should
         * be created with this configuration.
         * <p>
         * As a simple side-step to possible networking issues, turn off multicast
         * in favour of TCP connection to the local host.
         *
         * @return Configuration for the Hazelcast instance
         */
        @Bean
        public Config config() {

            List memberList = new ArrayList<String>();
            memberList.add("172.22.0.3");
            memberList.add("172.22.0.4");

            Config config = new Config();

            JoinConfig joinConfig = config.getNetworkConfig().getJoin();

            joinConfig.getMulticastConfig().setEnabled(false);
            joinConfig.getTcpIpConfig().setEnabled(true).setMembers(memberList);

            return config;
        }

    }

